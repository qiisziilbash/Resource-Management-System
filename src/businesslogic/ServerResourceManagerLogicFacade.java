package businesslogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.accounting.job.Job;
import businesslogic.accounting.job.ProjectManagement;
import businesslogic.accounting.job.ProjectManagementDAO;
import businesslogic.accounting.job.ResourceManagement;
import businesslogic.accounting.user.User;
import businesslogic.accounting.user.UserDAO;
import businesslogic.distribution.Allocation;
import businesslogic.distribution.Allocation_DAO;
import businesslogic.distribution.ResourceAllocation;
import businesslogic.distribution.ResourceAllocationDAO;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.requirement.RequirementDAO;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.distribution.resource.InformationResourceDAO;
import businesslogic.distribution.resource.Project;
import businesslogic.distribution.resource.Resource;
import businesslogic.distribution.resource.ResourceDAO;
import businesslogic.prediction.ResourceAllocationPrediction;
import businesslogic.report.FlowReport;
import businesslogic.report.ResourceReport;
import businesslogic.report.ResourceRequirementReport;
import businesslogic.utility.Date;
import businesslogic.utility.Notification;
import businesslogic.utility.NotificationDAO;
import businesslogic.utility.Table;

/**
 * Created by Esi on 6/22/2016.
 */
public class ServerResourceManagerLogicFacade implements ResourceManagerLogicInterface{

    private static ServerResourceManagerLogicFacade instance;

    private ServerResourceManagerLogicFacade() {
    }

    public static ServerResourceManagerLogicFacade getInstance() {
        if(instance == null) {
            instance = new ServerResourceManagerLogicFacade();
        }
        return instance;
    }

    @Override
    public Notification registerResourceAllocation(int userID, Allocation allocation, Resource[] resources) {
        try{

            User user = UserDAO.getUserByORMID(userID);
            getResourceManagement(user).addAllocation(allocation);

            allocation.setAllocated(true);


            int requirementID = allocation.getRequirement().getID();
            Requirement requirement = RequirementDAO.getRequirementByORMID(requirementID);
            
            RequirementDAO.fetchInformationResource(allocation.getRequirement());
            RequirementDAO.fetchInformationResource(allocation.getRequirement());
            int informationResourceID = allocation.getRequirement().getInformationResource().getID();
            InformationResource informationResource = InformationResourceDAO.getInformationResourceByORMID(informationResourceID);


            informationResource.addAllocation(allocation);
            informationResource.removeRequirement(allocation.getRequirement());
            allocation.setRequirement(requirement);
            informationResource.addRequirement(allocation.getRequirement());
            InformationResourceDAO.save(informationResource);

            for(ResourceAllocation ra:(Set<ResourceAllocation>)allocation.getORM_ResourceAllocations()) {
                ResourceAllocationDAO.save(ra);
            }

            Allocation_DAO.save(allocation);

            for(Resource resource: resources) {
                Resource newResource = ResourceDAO.getResourceByORMID(resource.getID());
                newResource.setORM_ResourceAllocations(resource.getORM_ResourceAllocations());
                ResourceDAO.save(newResource);
            }

            RequirementDAO.save(allocation.getRequirement());

            Notification projectManagerNotification = NotificationDAO.createNotification();
            projectManagerNotification .setContent("A resource manager responded to your requirement for "
                    + allocation.getRequirement().getResourceName() + ".");
            RequirementDAO.fetchProjectManager(allocation.getRequirement());
            allocation.getRequirement().getProjectManagement().addNotification(projectManagerNotification );

            NotificationDAO.save(projectManagerNotification);
            ProjectManagementDAO.save(allocation.getRequirement().getProjectManagement());

            Notification notification = NotificationDAO.createNotification();
            notification.setContent("The allocation has been registered successfully.");
            return notification;
        }
        catch (PersistentException ex) {
            ex.printStackTrace();
        }
        Notification notification = NotificationDAO.createNotification();
        notification.setContent("The allocation cannot be registered.");
        return notification;
    }

    @Override
    public Notification rejectResourceAllocation(int userID, int requirementID) {
        Notification notification = new Notification();

        Requirement requirement = null;
        try {
            requirement = RequirementDAO.getRequirementByORMID(requirementID);
            OODPersistentManager.instance().getSession().flush();
        } catch (PersistentException e) {
            e.printStackTrace();
            notification.setContent("Requirement not found.");
            return notification;
        }

        Notification projectManagerNotification = NotificationDAO.createNotification();
        projectManagerNotification .setContent("A resource manager rejected your requirement for "
                + requirement.getResourceName() + ".");
        
        RequirementDAO.fetchProjectManager(requirement);
        ProjectManagement pm = requirement.getProjectManagement();
        pm.addNotification(projectManagerNotification );

        try {
            NotificationDAO.save(projectManagerNotification);
            pm.removeRequirement(requirement);
            ProjectManagementDAO.save(pm);
            RequirementDAO.delete(requirement);
            OODPersistentManager.instance().getSession().flush();
        } catch (PersistentException e) {
            e.printStackTrace();
            notification.setContent("Cannot reject the requirement.");
            return notification;
        }

        notification.setContent("The requirement has been rejected.");
        return notification;
    }

    @Override
    public InformationResource[] getInformationResources(int userID) {
        try {
            PersistentSession session = OODPersistentManager.instance().getSession();
            List<InformationResource> informationResourceList= session
                    .createQuery("SELECT resource FROM Resource AS resource WHERE " +
                            "Discriminator IN ('Project','System','Subsystem', 'Module')").list();

            return informationResourceList.toArray(new InformationResource[informationResourceList.size()]);
        }
        catch(PersistentException ex) {
        }
        return null;
    }

    @Override
    public String[] getResourceNames(int userID, String resourceType) {
        try {
            StringBuffer condition = new StringBuffer("");
            condition.append("SELECT DISTINCT Name2 FROM Resource WHERE Discriminator = '").append(resourceType)
                    .append("'");
            PersistentSession session = OODPersistentManager.instance().getSession();
            List<String> resourceNameList = session
                    .createSQLQuery(condition.toString()).list();
            return resourceNameList.toArray(new String[resourceNameList.size()]);
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Requirement[] getRequirements(int userID) {
        try {
            PersistentSession session = OODPersistentManager.instance().getSession();

            List<Integer> requirementIDs= session
                    .createSQLQuery("SELECT ID FROM Requirement WHERE [Allocation ID] IS NULL").list();
            List<Requirement> requirementList = new ArrayList<>();
            for(int requirementID:requirementIDs) {
                requirementList.add(RequirementDAO.getRequirementByORMID(requirementID));
            }
            return requirementList.toArray(new Requirement[requirementList.size()]);
        }
        catch(PersistentException ex) {
        }
        return null;
    }

    @Override
    public Resource[] getResources(int userID, String resourceType, String resourceName) {
        try {
            StringBuffer condition = new StringBuffer("");
            condition.append("SELECT resource.ID2 FROM Resource AS resource WHERE resource.Discriminator = '")
                    .append(resourceType).append("' AND resource.Name2 = '").append(resourceName).append("'");

            PersistentSession session = OODPersistentManager.instance().getSession();
            List<Integer> idList= session
                    .createSQLQuery(condition.toString()).list();

            ArrayList<Resource> resourceList = new ArrayList<>();
            for(Integer id:idList) {
                resourceList.add(ResourceDAO.getResourceByORMID(id));
            }
            return resourceList.toArray(new Resource[resourceList.size()]);
        }
        catch(PersistentException ex) {
        }
        return null;
    }

    @Override
    public Notification registerNewResource(int userID, Resource newResource) {
        try {
            User user = UserDAO.getUserByORMID(userID);
            ResourceManagement rm = getResourceManagement(user);

            if(rm == null) {
                Notification notification = NotificationDAO.createNotification();
                notification.setContent("The user is not a resource manager.");
                return notification;
            }

            Resource[] duplicates = ResourceDAO.listResourceByQuery("uniqueIdentifier = '" +
                    newResource.getUniqueIdentifier() + "'", null);

            if(duplicates != null && duplicates.length > 0) {
                Notification notification = NotificationDAO.createNotification();
                notification.setContent("There is already a resource with this identifier.");
                return notification;
            }

            ResourceDAO.save(newResource);
            Notification notification = NotificationDAO.createNotification();
            notification.setContent("The resource has been registered successfully.");
            return notification;
        }
        catch (PersistentException ex) {
            ex.printStackTrace();
        }
        Notification notification = NotificationDAO.createNotification();
        notification.setContent("The resource cannot be registered.");
        return notification;

    }

    @Override
    public Table reportResources() {
        try {
            ResourceReport report = new ResourceReport();
            report.makeReport();
            return report.getTable();
        }
        catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Table reportFlowResourceAllocations(Resource resource, Date startDate, Date endDate) {
        try {
            FlowReport report = new FlowReport(resource, startDate, endDate);
            report.makeReport();
            return report.getTable();
        }
        catch (PersistentException ex) {
        }
        return null;
    }

    @Override
    public Table reportResourceRequirements(int informationResourceID) {
        try {
            ResourceRequirementReport report = new ResourceRequirementReport(informationResourceID);
            report.makeReport();
            return report.getTable();
        }
        catch (PersistentException ex) {
        }
        return null;
    }

    @Override
    public Project[] predictEssentialResourceAllocations(Project project) {
        Project[] allProjects = getAllProjectList();
        ResourceAllocationPrediction resourceAllocationPrediction = new ResourceAllocationPrediction(project, allProjects);
        resourceAllocationPrediction.search();
        return resourceAllocationPrediction.getResults();
    }

    @Override
    public Project[] getAllProjectList() {
        try {
            PersistentSession session = OODPersistentManager.instance().getSession();
            List<Project> projectsList = session
                    .createQuery("SELECT resource FROM Resource AS resource WHERE Discriminator = 'Project'").list();
            return projectsList.toArray(new Project[projectsList.size()]);
        }
        catch(PersistentException ex) {
        }
        return null;
    }

    private ResourceManagement getResourceManagement(User user) {
        ResourceManagement rm = null;
        UserDAO.fetchJobs(user);
        for(Job job:user.getJobs()) {
            if(job instanceof ResourceManagement) {
                rm = (ResourceManagement) job;
                return rm;
            }
        }
        return null;
    }
}
