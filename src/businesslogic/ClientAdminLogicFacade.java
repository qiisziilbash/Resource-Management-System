package businesslogic;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import network.ClientNetwork;
import network.NetworkRequest;
import businesslogic.support.SystemConfiguration;

/**
 * Created by Esi on 6/22/2016.
 */
public class ClientAdminLogicFacade implements AdminLogicInterface{

    private static ClientNetwork clientNetwork;

    private static ClientAdminLogicFacade clientAdminLogicFacade;

    public static ClientAdminLogicFacade getInstance() throws IOException, ClassNotFoundException {
        if(clientAdminLogicFacade == null) {
            clientAdminLogicFacade = new ClientAdminLogicFacade();
            clientNetwork = ClientNetwork.getInstance();
        }
        return clientAdminLogicFacade;
    }

    @Override
    public boolean configureSystem(int userID, SystemConfiguration configureSystem) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(userID);
        params.add(configureSystem);

        return (boolean)clientNetwork.sendRequest(new NetworkRequest("configureSystem",params)).getResponse();
    }
}
