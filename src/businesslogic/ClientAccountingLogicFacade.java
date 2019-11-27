package businesslogic;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import network.ClientNetwork;
import network.NetworkRequest;
import businesslogic.accounting.AuthenticationResult;
import businesslogic.accounting.job.Job;
import businesslogic.accounting.job.Specialty;
import businesslogic.accounting.user.User;
import businesslogic.distribution.resource.HumanResource;
import businesslogic.utility.Notification;

/**
 * Created by Esi on 6/22/2016.
 */

public class ClientAccountingLogicFacade implements AccountingLogicInterface{


    private static ClientNetwork clientNetwork;

    private static ClientAccountingLogicFacade clientAccountingLogicFacade;

    public static ClientAccountingLogicFacade getInstance() throws IOException, ClassNotFoundException {
        if(clientAccountingLogicFacade == null) {
            clientAccountingLogicFacade = new ClientAccountingLogicFacade();
            clientNetwork = ClientNetwork.getInstance();
        }
        return clientAccountingLogicFacade;
    }

    @Override
    public AuthenticationResult login(String username, String password) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(username);
        params.add(password);
        return (AuthenticationResult)clientNetwork.sendRequest(new NetworkRequest("login", params)).getResponse();
    }

    @Override
    public Notification signup(User user, Job[] jobs, Specialty[] specialties, HumanResource[] humanResources) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(user);
        params.add(jobs);
        params.add(specialties);
        params.add(humanResources);
        return (Notification) clientNetwork.sendRequest(new NetworkRequest("signup", params)).getResponse();
    }

    @Override
    public boolean logout(int UserID) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(UserID);
        return (boolean) clientNetwork.sendRequest(new NetworkRequest("logout",params)).getResponse();
    }

    @Override
    public Notification recoverPassword(String username) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(username);
        return (Notification) clientNetwork.sendRequest(new NetworkRequest("recoverPassword", params)).getResponse();
    }


    @Override
    public Notification editProfile(User user, Job[] jobs, Specialty[] specialties, HumanResource[] humanResources) throws IOException, ClassNotFoundException {
        ArrayList<Serializable> params = new ArrayList<>();
        params.add(user);
        params.add(jobs);
        params.add(specialties);
        params.add(humanResources);
        return (Notification) clientNetwork.sendRequest(new NetworkRequest("editProfile", params)).getResponse();
    }

}
