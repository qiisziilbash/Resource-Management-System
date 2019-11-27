package businesslogic;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.accounting.job.Job;
import businesslogic.accounting.job.Programming;
import businesslogic.accounting.job.ProgrammingDAO;
import businesslogic.accounting.user.User;
import businesslogic.accounting.user.UserDAO;
import businesslogic.distribution.resource.Module;
import businesslogic.distribution.resource.ModuleChange;
import businesslogic.distribution.resource.ModuleChangeDAO;
import businesslogic.distribution.resource.ModuleDAO;
import businesslogic.utility.Date;
import businesslogic.utility.Notification;

/**
 * Created by Esi on 6/22/2016.
 */
public class ServerProgrammerLogicFacade implements ProgrammerLogicInterface{

    private static ServerProgrammerLogicFacade instance;

    private ServerProgrammerLogicFacade() {
    }

    public static ServerProgrammerLogicFacade getInstance() {
        if(instance == null) {
            instance = new ServerProgrammerLogicFacade();
        }
        return instance;
    }

    @Override
    public Notification registerModuleCreation(int userID, int moduleID, String description, Date startDate, Date endDate) {
        Notification notification = new Notification();

        Module module = null;
        try {
            module = ModuleDAO.getModuleByORMID(moduleID);
        } catch (PersistentException e) {
            notification.setContent("Module not found.");
            return notification;
        }

        module.setDescription(description);
        module.setStartDate(startDate.toString());
        module.setEndDate(endDate.toString());

        try {
            ModuleDAO.save(module);
            OODPersistentManager.instance().getSession().flush();
        } catch (PersistentException e) {
            notification.setContent("Cannot save the changes.");
            return notification;
        }

        notification.setContent("Module creation has been saved.");
        return notification;
    }

    @Override
    public Notification registerModuleMaintenance(int userID, int moduleID, ModuleChange[] changes) {
        Notification notification = new Notification();
        Programming programming = getProgramming(userID);

        if(programming == null) {
            notification.setContent("User is not a programmer.");
            return notification;
        }

        Module module = null;
        try {
            module = ModuleDAO.getModuleByORMID(moduleID);
        } catch (PersistentException e) {
            notification.setContent("Module not found.");
            return notification;
        }

        try {
            for (ModuleChange change : changes) {
                module.addModuleChange(change);
                programming.getORM_ModuleChanges().add(change);
                ModuleChangeDAO.save(change);
            }
            ModuleDAO.save(module);
            ProgrammingDAO.save(programming);
            OODPersistentManager.instance().getSession().flush();
        } catch(PersistentException e) {
            e.printStackTrace();
            notification.setContent("Cannot save the changes.");
            return notification;
        }

        notification.setContent("Module changes have been saved.");
        return notification;
    }

    @Override
    public Module[] getModuleList(int userID) {
        Programming programming = getProgramming(userID);
        return programming.getModules();
    }

    private Programming getProgramming(int userID) {
        try {
            PersistentSession session = OODPersistentManager.instance().getSession();
            User user = UserDAO.getUserByORMID(userID);
            UserDAO.fetchJobs(user);
            for(Job job:user.getJobs()) {
                if(job instanceof Programming) {
                    return (Programming) job;
                }
            }
        } catch (PersistentException e) {
        }
        return null;
    }
}
