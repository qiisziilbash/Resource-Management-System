package businesslogic;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import network.ClientNetwork;
import network.NetworkRequest;
import network.NetworkResponse;
import businesslogic.distribution.Allocation;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.distribution.resource.Project;
import businesslogic.distribution.resource.Resource;
import businesslogic.utility.Date;
import businesslogic.utility.Notification;
import businesslogic.utility.Table;

/**
 * Created by Esi on 6/22/2016.
 */
public class ClientResourceManagerLogicFacade implements ResourceManagerLogicInterface{

    private static ClientResourceManagerLogicFacade instance;

    private static ClientNetwork clientNetwork;

    private ClientResourceManagerLogicFacade() {
    }

    public static ClientResourceManagerLogicFacade getInstance() throws IOException {
        if(instance == null) {
            instance = new ClientResourceManagerLogicFacade();
            clientNetwork = ClientNetwork.getInstance();
        }
        return instance;
    }

    @Override
    public Notification registerResourceAllocation(int userID, Allocation allocation, Resource[] resources) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(allocation);
        params.add(resources);
        return (Notification)clientNetwork.sendRequest(new NetworkRequest("registerResourceAllocation",params)).getResponse();
    }

    @Override
    public Notification rejectResourceAllocation(int userID, int requirementID) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(requirementID);
        return (Notification)clientNetwork.sendRequest(new NetworkRequest("rejectResourceAllocation",params)).getResponse();
    }

    @Override
    public InformationResource[] getInformationResources(int uesrID) throws IOException, ClassNotFoundException {

        ArrayList<Serializable> params = new ArrayList<>();
        params.add(uesrID);
        return (InformationResource[])clientNetwork.sendRequest(new NetworkRequest("getInformationResourcesForResourceManager",params)).getResponse();
    }

    @Override
    public String[] getResourceNames(int userID, String resourceType) throws IOException, ClassNotFoundException {

        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(resourceType);
        return (String[])clientNetwork.sendRequest(new NetworkRequest("getResourceNamesForResourceManager",params)).getResponse();
    }

    @Override
    public Requirement[] getRequirements(int userID) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        return (Requirement[])clientNetwork.sendRequest(new NetworkRequest("getRequirements",params)).getResponse();
    }

    @Override
    public Resource[] getResources(int userID, String resourceType, String resourceName) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(resourceType);
        params.add(resourceName);

        return (Resource[])clientNetwork.sendRequest(new NetworkRequest("getResources",params)).getResponse();
    }

    @Override
    public Notification registerNewResource(int userID, Resource newResource) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(newResource);
        return (Notification)clientNetwork.sendRequest(new NetworkRequest("registerNewResource",params)).getResponse();
    }

    @Override
    public Table reportResources() throws IOException, ClassNotFoundException {

        NetworkResponse networkResponse = clientNetwork.sendRequest(new NetworkRequest("reportResources",null));


        return (Table)networkResponse.getResponse();
    }

    @Override
    public Table reportFlowResourceAllocations(Resource resource, Date startDate, Date endDate) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(resource);
        params.add(startDate);
        params.add(endDate);
        return (Table)clientNetwork.sendRequest(new NetworkRequest("reportFlowResourceAllocations",params)).getResponse();
    }

    @Override
    public Table reportResourceRequirements(int informationResourceID) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(informationResourceID);
        return (Table)clientNetwork.sendRequest(new NetworkRequest("reportResourceRequirements",params)).getResponse();
    }

    @Override
    public Project[] predictEssentialResourceAllocations(Project project) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(project);
        return (Project[])clientNetwork.sendRequest(new NetworkRequest("predictEssentialResourceAllocations",params)).getResponse();
    }

    @Override
    public Project[] getAllProjectList() throws IOException, ClassNotFoundException {
        return (Project[])clientNetwork.sendRequest(new NetworkRequest("getAllProjectList",null)).getResponse();
    }
}
