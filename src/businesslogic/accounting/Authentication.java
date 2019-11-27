package businesslogic.accounting;

import java.util.ArrayList;

import org.orm.PersistentException;

import businesslogic.accounting.user.User;
import businesslogic.accounting.user.UserDAO;
import businesslogic.utility.Notification;

/**
 * Created by Esi on 6/24/2016.
 */
public class Authentication {

    private static Authentication instance;

    private ArrayList<User> onlineUsersInformation;

    private Authentication() {
        onlineUsersInformation = new ArrayList<User>();
    }

    public static Authentication getInstance() {
        if(instance == null) {
            instance = new Authentication();
        }
        return instance;
    }

    public ArrayList<User> getOnlineUsersInformation() {
        return onlineUsersInformation;
    }

    public AuthenticationResult authenticate(String username, String password) {
        String hashedPassword = hash(password);
        StringBuffer condition = new StringBuffer("");
        condition.append("username = '").append(username).append("'");
        condition.append("and password = '").append(hashedPassword).append("'");
        User[] queryResults = null;
        try {
            queryResults = UserDAO.listUserByQuery(condition.toString(), null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }

        if(queryResults == null) {
            Notification notification = new Notification("Invalid username and/or password!");
            return new AuthenticationResult(null, notification);
        } else {
            for(User user:queryResults) {
                if (user.getApproved()) {
                    UserDAO.fetchJobs(user);
                    onlineUsersInformation.add(user);
                    Notification notification = new Notification("Logged in successfully!");
                    return new AuthenticationResult(user, notification);
                }
            }
            Notification notification = new Notification("Your request is pending manager's approval!");
            return new AuthenticationResult(null, notification);
        }
    }

    public boolean logout(int userID) {
        StringBuffer condition = new StringBuffer("");
        condition.append("ID = ").append(userID);
        User[] queryResults = null;
        try {
            queryResults = UserDAO.listUserByQuery(condition.toString(), null);
        } catch (PersistentException e) {
            return false;
        }

        if(queryResults != null && queryResults.length == 1) {
            User user = queryResults[0];
            onlineUsersInformation.remove(user);
            return true;
        }
        return false;
    }

    private String hash(String input) {
        return input; //TODO really hash
    }
}
