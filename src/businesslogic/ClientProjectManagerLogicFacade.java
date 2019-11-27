package businesslogic;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import network.ClientNetwork;
import network.NetworkRequest;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.resource.HumanResource;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.distribution.resource.Module;
import businesslogic.distribution.resource.Project;
import businesslogic.utility.Date;
import businesslogic.utility.Notification;

/**
 * Created by Esi on 6/22/2016.
 */
public class ClientProjectManagerLogicFacade implements ProjectManagerLogicInterface{

    private static ClientProjectManagerLogicFacade instance;

    private static ClientNetwork clientNetwork;

    private ClientProjectManagerLogicFacade() {
    }

    public static ClientProjectManagerLogicFacade getInstance() throws IOException {
        if(instance == null) {
            instance = new ClientProjectManagerLogicFacade();
            clientNetwork = ClientNetwork.getInstance();
        }
        return instance;
    }

    @Override
    public Notification assignModules(HashMap<HumanResource, Module> assignments) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(assignments);
        return (Notification)clientNetwork.sendRequest(new NetworkRequest("assignModules",params)).getResponse();
    }

    @Override
    public Notification registerProjectScale(int UserID, Project newProject) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(UserID);
        params.add(newProject);
        return (Notification)clientNetwork.sendRequest(new NetworkRequest("registerProjectScale",params)).getResponse();
    }

    @Override
    public Project[] estimateResourceAllocations(String[] technologies, Date startDate, Date endDate, int budget) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(technologies);
        params.add(startDate);
        params.add(endDate);
        params.add(budget);
        return (Project[]) clientNetwork.sendRequest(new NetworkRequest("estimateResourceAllocations",params)).getResponse();
    }

    @Override
    public Notification registerRequirement(int userID, Requirement newRequirement, InformationResource resource) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(newRequirement);
        params.add(resource);
        return (Notification)clientNetwork.sendRequest(new NetworkRequest("registerRequirement",params)).getResponse();
    }

    @Override
    public Project[] getProjectList(int userID) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        return (Project[])clientNetwork.sendRequest(new NetworkRequest("getProjectList",params)).getResponse();
    }

    @Override
    public HumanResource[] getProgrammers(Project project) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(project);

        return (HumanResource[])clientNetwork.sendRequest(new NetworkRequest("getProgrammers",params)).getResponse();
    }

    @Override
    public Module[] getModules(Project project) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(project);
        return (Module[])clientNetwork.sendRequest(new NetworkRequest("getModules",params)).getResponse();
    }

    @Override
    public InformationResource[] getInformationResources(int userID) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        return (InformationResource[])clientNetwork.sendRequest(new NetworkRequest("getInformationResources",params)).getResponse();
    }

    @Override
    public String[] getResourceNames(int userID, String resourceType) throws IOException, ClassNotFoundException {

        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(resourceType);

        return (String[])clientNetwork.sendRequest(new NetworkRequest("getResourceNames",params)).getResponse();
    }
}
