package businesslogic;

import java.math.BigInteger;
import java.security.SecureRandom;

import javax.mail.MessagingException;

import network.Email;

import org.orm.PersistentException;

import orm.OODPersistentManager;
import businesslogic.accounting.Authentication;
import businesslogic.accounting.AuthenticationResult;
import businesslogic.accounting.job.Job;
import businesslogic.accounting.job.JobDAO;
import businesslogic.accounting.job.Specialty;
import businesslogic.accounting.job.SpecialtyDAO;
import businesslogic.accounting.job.UserJob;
import businesslogic.accounting.job.UserJobDAO;
import businesslogic.accounting.user.User;
import businesslogic.accounting.user.UserDAO;
import businesslogic.distribution.resource.HumanResource;
import businesslogic.distribution.resource.HumanResourceDAO;
import businesslogic.utility.Notification;

/**
 * Created by Esi on 6/22/2016.
 */
public class ServerAccountingLogicFacade implements AccountingLogicInterface{

    private static ServerAccountingLogicFacade instance;

    private ServerAccountingLogicFacade() {
    }

    public static ServerAccountingLogicFacade getInstance() {
        if(instance == null) {
            instance = new ServerAccountingLogicFacade();
        }
        return instance;
    }

    @Override
    public AuthenticationResult login(String username, String password) {
        AuthenticationResult result = Authentication.getInstance().authenticate(username, password);
        return result;
    }

    @Override
    public Notification signup(User user, Job[] jobs, Specialty[] specialties, HumanResource[] humanResources) {

        try {

            UserDAO.updateJobs(user);

            for(Object ujObject: user.getORM_UserJobs()) {
                UserJob uj = (UserJob) ujObject;
                UserJobDAO.save(uj);
            }

            for(Job job: jobs) {
                JobDAO.save(job);
            }

            for(Specialty specialty: specialties) {
                SpecialtyDAO.save(specialty);
            }

            for(HumanResource hr: humanResources) {
                HumanResourceDAO.save(hr);
            }

            UserDAO.save(user);
            OODPersistentManager.instance().getSession().flush();

            Notification notification = new Notification();
            notification.setContent("Your request has been submitted.");
            return notification;
        } catch (PersistentException e) {
        }

        Notification notification = new Notification();
        notification.setContent("Signup was not successful.");
        return notification;
    }

    @Override
    public boolean logout(int UserID) {
        return Authentication.getInstance().logout(UserID);
    }

    @Override
    public Notification recoverPassword(String username) {
        StringBuffer condition = new StringBuffer();
        condition.append("username = '").append(username).append("'");
        User[] users = null;

        Notification notification = new Notification();
        StringBuffer msg = new StringBuffer("");
        try {
            users = UserDAO.listUserByQuery(condition.toString(),null);
        } catch (PersistentException e) {
            msg.append("User was not found.");
            notification.setContent(msg.toString());
            return notification;
        }

        if(users != null && users.length == 1) {
            User user = users[0];

            SecureRandom random = new SecureRandom();
            String randomPassword = new BigInteger(130, random).toString(32);

            user.setPassword(randomPassword);

            try {
                Email email = new Email(randomPassword, user.getEmail());
                email.send();
            } catch (MessagingException e) {
                msg.append("Cannot send the new password.");
                notification.setContent(msg.toString());
                return notification;
            }

            try {
                UserDAO.save(user);
            } catch (PersistentException e) {
                msg.append("Cannot save the changes.");
                notification.setContent(msg.toString());
                return notification;
            }

            msg.append("The new password has been sent.");
            notification.setContent(msg.toString());
            return notification;
        }

        msg.append("User was not found.");
        notification.setContent(msg.toString());
        return notification;
    }

    @Override
    public Notification editProfile(User user, Job[] jobs, Specialty[] specialties, HumanResource[] humanResources) {
        try {

            UserDAO.updateJobs(user);

            for(Object ujObject: user.getORM_UserJobs()) {
                UserJob uj = (UserJob) ujObject;
                UserJobDAO.save(uj);
            }

            for(Specialty specialty: specialties) {
                if(SpecialtyDAO.getSpecialtyByORMID(specialty.getID()) == null)
                    SpecialtyDAO.save(specialty);
            }

            for(Job job: user.getJobs()) {
                if(JobDAO.getJobByORMID(job.getID()) == null) {
                    JobDAO.save(job);
                }else {
                    Job newJob = JobDAO.getJobByORMID(job.getID());
                    newJob.setORM_UserJobs(job.getORM_UserJobs());
                    JobDAO.save(newJob);
                }
            }

            for(HumanResource hr: humanResources) {
                if(HumanResourceDAO.getHumanResourceByORMID(hr.getID()) == null) {
                    HumanResourceDAO.save(hr);
                }
            }

            User creatorUser = UserDAO.getUserByORMID(user.getCreatorUser().getID());
            user.setCreatorUser(creatorUser);
            UserDAO.save(user);
            OODPersistentManager.instance().getSession().flush();

            Notification notification = new Notification();
            notification.setContent("Your request has been submitted.");
            return notification;
        } catch (PersistentException e) {
        }
        Notification notification = new Notification();
        notification.setContent("Cannot save the changes.");
        return notification;
    }
}
