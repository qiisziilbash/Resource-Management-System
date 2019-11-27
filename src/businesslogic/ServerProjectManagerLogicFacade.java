package businesslogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.accounting.job.Job;
import businesslogic.accounting.job.ProjectManagement;
import businesslogic.accounting.job.ProjectManagementDAO;
import businesslogic.accounting.user.User;
import businesslogic.accounting.user.UserDAO;
import businesslogic.distribution.Allocation;
import businesslogic.distribution.Allocation_DAO;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.requirement.RequirementDAO;
import businesslogic.distribution.resource.HumanResource;
import businesslogic.distribution.resource.HumanResourceDAO;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.distribution.resource.InformationResourceDAO;
import businesslogic.distribution.resource.Module;
import businesslogic.distribution.resource.ModuleDAO;
import businesslogic.distribution.resource.Project;
import businesslogic.distribution.resource.ProjectDAO;
import businesslogic.distribution.resource.Resource;
import businesslogic.distribution.resource.Subsystem;
import businesslogic.distribution.resource.SubsystemDAO;
import businesslogic.distribution.resource.System;
import businesslogic.distribution.resource.SystemDAO;
import businesslogic.prediction.ResourceAllocationEstimation;
import businesslogic.utility.Date;
import businesslogic.utility.Notification;
import businesslogic.utility.NotificationDAO;

/**
 * Created by Esi on 6/22/2016.
 */
public class ServerProjectManagerLogicFacade implements ProjectManagerLogicInterface{

    private static ServerProjectManagerLogicFacade instance;

    private ServerProjectManagerLogicFacade() {
    }

    public static ServerProjectManagerLogicFacade getInstance() {
        if(instance == null) {
            instance = new ServerProjectManagerLogicFacade();
        }
        return instance;
    }

    @Override
    public Notification assignModules(HashMap<HumanResource, Module> assignments) {
        StringBuffer msg = new StringBuffer("");
        for(HumanResource humanResource: assignments.keySet()) {
            try {
                HumanResource newHumanResource = HumanResourceDAO.getHumanResourceByORMID(humanResource.getID());
                Module newModule = ModuleDAO.getModuleByORMID(assignments.get(humanResource).getID());
                newHumanResource.getProgramming().addModule(newModule);
                HumanResourceDAO.save(newHumanResource);
                OODPersistentManager.instance().getSession().flush();
            }
            catch (PersistentException ex) {
                ex.printStackTrace();
                msg.append("Cannot assign module to programmer " + humanResource.getName());
            }
        }
        Notification notification = NotificationDAO.createNotification();
        if(msg.length() > 0) {
            notification.setContent(msg.toString());
        }
        else {
            notification.setContent("Modules were assigned.");
        }
        return notification;
    }

    @Override
    public Notification registerProjectScale(int UserID, Project newProject) {

        try {

            User user = UserDAO.getUserByORMID(UserID);

            ProjectManagement pm = getProjectManagement(user);

            if(pm == null) {
                Notification notification = NotificationDAO.createNotification();
                notification.setContent("The user is not animate project manager.");
                return notification;
            }

            newProject.setProjectManagement(pm);

            Set<System> systems = newProject.getORM_Systems();
            for (System system : systems) {
                system.setProjectManagement(pm);
                Set<Subsystem> subsystems = system.getORM_Subsystems();
                for (Subsystem subsystem : subsystems) {
                    subsystem.setProjectManagement(pm);
                    Set<Module> modules = subsystem.getORM_Modules();
                    for (Module module : modules) {
                        module.setProjectManagement(pm);
                        ModuleDAO.save(module);
                    }
                    SubsystemDAO.save(subsystem);
                }
                SystemDAO.save(system);
            }
            ProjectDAO.save(newProject);

            ProjectManagementDAO.save(pm);
            OODPersistentManager.instance().getSession().flush();
        }
        catch(PersistentException ex) {
            ex.printStackTrace();
            Notification notification = NotificationDAO.createNotification();
            notification.setContent("Cannot save the project.");
            return notification;
        }
        Notification notification = NotificationDAO.createNotification();
        notification.setContent("The project has been registered successfully.");
        return notification;
    }

    @Override
    public Project[] estimateResourceAllocations(String[] technologies, Date startDate, Date endDate, int budget) {
        ResourceAllocationEstimation resourceAllocationEstimation =
                new ResourceAllocationEstimation(technologies, startDate, endDate, budget);
        resourceAllocationEstimation.search();
        return resourceAllocationEstimation.getResults();
    }

    @Override
    public Notification registerRequirement(int userID, Requirement newRequirement, InformationResource resource) {
        try {
        	User user = UserDAO.getUserByORMID(userID);
        	newRequirement.setProjectManager(getProjectManagement(user));
            RequirementDAO.save(newRequirement);

            InformationResource oldResource = InformationResourceDAO.getInformationResourceByORMID(resource.getID());
            oldResource.addRequirement(newRequirement);
            InformationResourceDAO.save(oldResource);
            OODPersistentManager.instance().getSession().flush();
            Notification notification = NotificationDAO.createNotification();
            notification.setContent("The requirement has been registered successfully.");
            return notification;
        }
        catch(PersistentException ex) {
            ex.printStackTrace();
        }
        Notification notification = NotificationDAO.createNotification();
        notification.setContent("Cannot save the requirement.");
        return notification;
    }

    @Override
    public Project[] getProjectList(int userID) {
        try {
            User user = UserDAO.getUserByORMID(userID);
            ProjectManagement pm = getProjectManagement(user);
            InformationResource[] informationResources = pm.getInformationResources();

            ArrayList<Project> projects = new ArrayList<>();
            for(InformationResource informationResource:informationResources) {
                if(informationResource instanceof Project) {
                    projects.add((Project) informationResource);
                }
            }
            return projects.toArray(new Project[projects.size()]);
        }
        catch(PersistentException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public HumanResource[] getProgrammers(Project project) {
        Set<Allocation> allAllocations = new HashSet<>();

        allAllocations.addAll(Arrays.asList(project.getAllocations()));
        for(System system : (Set<System>) project.getORM_Systems()) {

            allAllocations.addAll(Arrays.asList(system.getAllocations()));
            for(Subsystem subsystem : (Set<Subsystem>) system.getORM_Subsystems()) {

                allAllocations.addAll(Arrays.asList(subsystem.getAllocations()));
                for(Module module : (Set<Module>)subsystem.getORM_Modules()) {
                    allAllocations.addAll(Arrays.asList(module.getAllocations()));
                }
            }
        }

        ArrayList<HumanResource> programmers = new ArrayList();
        for(Allocation allocation : allAllocations) {
        	Allocation_DAO.fetchResources(allocation);
            for (Resource resource: allocation.getResources())
                if(resource instanceof HumanResource)
                    programmers.add((HumanResource)resource);
        }


        return programmers.toArray(new HumanResource[programmers.size()]);
    }

    @Override
    public Module[] getModules(Project project) {
        Set<Module> allModules = new HashSet<>();

        for(System system : (Set<System>) project.getORM_Systems()) {
            for(Subsystem subsystem : (Set<Subsystem>) system.getORM_Subsystems()) {
                for(Module module : (Set<Module>)subsystem.getORM_Modules()) {
                    allModules.add(module);
                }
            }
        }
        return allModules.toArray(new Module[allModules.size()]);
    }

    @Override
    public InformationResource[] getInformationResources(int userID) {
        try {
            ProjectManagement pm = getProjectManagement(UserDAO.getUserByORMID(userID));
            return pm.getInformationResources();
        }
        catch(PersistentException | NullPointerException  ex) {
            ex.printStackTrace();
        }
        return null;

    }

    @Override
    public String[] getResourceNames(int userID, String ResourceType ) {
        try {
            PersistentSession session = OODPersistentManager.instance().getSession();
            StringBuffer condition = new StringBuffer("");
            condition.append("SELECT resource.name FROM Resource AS resource WHERE Discriminator = '")
                    .append(ResourceType).append("'");
            List<String> results = session.createQuery(condition.toString()).list();
            return results.toArray(new String[results.size()]);
        }
        catch(PersistentException | NullPointerException  ex) {
            ex.printStackTrace();
        }
        return null;

    }

    private ProjectManagement getProjectManagement(User user) {
        ProjectManagement pm = null;
        UserDAO.fetchJobs(user);
        for(Job job:user.getJobs()) {
            if(job instanceof ProjectManagement) {
                pm = (ProjectManagement) job;
                return pm;
            }
        }
        return null;
    }
}
