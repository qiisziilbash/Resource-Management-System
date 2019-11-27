package businesslogic;

import java.io.IOException;
import java.util.HashMap;

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
public interface ProjectManagerLogicInterface {

    Notification assignModules(HashMap<HumanResource, Module> assignments) throws IOException, ClassNotFoundException;

    Notification registerProjectScale(int UserID, Project newProject) throws IOException, ClassNotFoundException;

    Project[] estimateResourceAllocations(String[] technologies, Date startDate, Date endDate, int budget) throws IOException, ClassNotFoundException;

    Notification registerRequirement(int userID, Requirement newRequirement, InformationResource resource) throws IOException, ClassNotFoundException;

    Project[] getProjectList(int userID) throws IOException, ClassNotFoundException;

    HumanResource[] getProgrammers(Project project) throws IOException, ClassNotFoundException;

    Module[] getModules(Project project) throws IOException, ClassNotFoundException;

    InformationResource[] getInformationResources(int userID) throws IOException, ClassNotFoundException;

    String[] getResourceNames(int userID, String resourceType) throws IOException, ClassNotFoundException;
}
