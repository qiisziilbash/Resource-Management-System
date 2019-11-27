package businesslogic;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import network.ClientNetwork;
import network.NetworkRequest;
import businesslogic.accounting.user.User;

/**
 * Created by Esi on 6/22/2016.
 */
public class ClientManagerLogicFacade implements ManagerLogicInterface {


    private static ClientNetwork clientNetwork;

    private static ClientManagerLogicFacade clientManagerLogicFacade;

    public static ClientManagerLogicFacade getInstance() throws IOException, ClassNotFoundException {
        if(clientManagerLogicFacade == null) {
            clientManagerLogicFacade = new ClientManagerLogicFacade();
            clientNetwork = ClientNetwork.getInstance();
        }
        return clientManagerLogicFacade;
    }


    @Override
    public User[] getUnapprovedUsers() throws IOException, ClassNotFoundException {
        return (User[])clientNetwork.sendRequest(new NetworkRequest("getUnapprovedUsers",null)).getResponse();
    }

    @Override
    public boolean approveUser(User user, boolean accepted) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(user);
        params.add(accepted);
        return (boolean) clientNetwork.sendRequest(new NetworkRequest("approveUser",params)).getResponse();
    }
}
