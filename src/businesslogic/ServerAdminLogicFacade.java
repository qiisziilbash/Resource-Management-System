package businesslogic;

import org.orm.PersistentException;

import businesslogic.accounting.user.Admin;
import businesslogic.accounting.user.AdminDAO;
import businesslogic.support.SystemConfiguration;
import businesslogic.support.SystemConfigurationDAO;

/**
 * Created by Esi on 6/22/2016.
 */
public class ServerAdminLogicFacade implements AdminLogicInterface{

    private static ServerAdminLogicFacade instance;

    private ServerAdminLogicFacade() {
    }

    public static ServerAdminLogicFacade getInstance() {
        if(instance == null) {
            instance = new ServerAdminLogicFacade();
        }
        return instance;
    }

    @Override
    public boolean configureSystem(int userID, SystemConfiguration configureSystem) {
        Admin admin = null;
        try {
            admin = AdminDAO.getAdminByORMID(userID);
        } catch (PersistentException e) {
            e.printStackTrace();
            return false;
        }

        SystemConfiguration oldConfiguration = null;
        try {
            oldConfiguration = SystemConfigurationDAO.getSystemConfigurationByORMID(1);
            admin.getORM_SystemConfigurations().remove(oldConfiguration);
            SystemConfigurationDAO.delete(oldConfiguration);
        } catch (PersistentException e) {
        }

        try {

            admin.getORM_SystemConfigurations().add(configureSystem);
            AdminDAO.save(admin);
            SystemConfigurationDAO.save(configureSystem);

        } catch (PersistentException e) {
            e.printStackTrace();
            if(oldConfiguration != null) {
                try {
                    SystemConfigurationDAO.save(oldConfiguration);
                } catch (PersistentException e1) {
                    e1.printStackTrace();
                }
            }
        }

        //TODO notification
        System.out.println("sending notification...");
        return true;
    }
}
