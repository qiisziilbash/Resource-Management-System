package businesslogic;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import network.ClientNetwork;
import network.NetworkRequest;
import businesslogic.distribution.resource.Module;
import businesslogic.distribution.resource.ModuleChange;
import businesslogic.utility.Date;
import businesslogic.utility.Notification;

/**
 * Created by Esi on 6/22/2016.
 */
public class ClientProgrammerLogicFacade implements ProgrammerLogicInterface{


    private static ClientNetwork clientNetwork;

    private static ClientProgrammerLogicFacade programmerLogicFacade;

    public static ClientProgrammerLogicFacade getInstance() throws IOException, ClassNotFoundException {
        if(programmerLogicFacade== null) {
            programmerLogicFacade= new ClientProgrammerLogicFacade();
            clientNetwork = ClientNetwork.getInstance();
        }
        return programmerLogicFacade;
    }


    @Override
    public Notification registerModuleCreation(int userID, int moduleID, String description, Date startDate, Date endDate) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(moduleID);
        params.add(description);
        params.add(startDate);
        params.add(endDate);

        return (Notification)clientNetwork.sendRequest(new NetworkRequest("registerModuleCreation",params)).getResponse();
    }

    @Override
    public Notification registerModuleMaintenance(int userID, int moduleID, ModuleChange[] changes) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(moduleID);
        params.add(changes);
        return (Notification)clientNetwork.sendRequest(new NetworkRequest("registerModuleMaintenance",params)).getResponse();
    }

    @Override
    public Module[] getModuleList(int userID)  throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        return (Module[]) clientNetwork.sendRequest(new NetworkRequest("getModuleList",params)).getResponse();
    }
}
