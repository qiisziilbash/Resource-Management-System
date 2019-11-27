package businesslogic;

import java.io.IOException;

import businesslogic.support.SystemConfiguration;

/**
 * Created by Esi on 6/22/2016.
 */
public interface AdminLogicInterface {
    boolean configureSystem(int userID, SystemConfiguration configureSystem) throws IOException, ClassNotFoundException;
}
