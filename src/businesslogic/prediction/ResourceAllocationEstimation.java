package businesslogic.prediction;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.distribution.resource.InformationResourceDAO;
import businesslogic.distribution.resource.Project;
import businesslogic.distribution.resource.ProjectDAO;
import businesslogic.distribution.resource.System;
import businesslogic.utility.Date;

/**
 * Created by Esi on 7/6/2016.
 */
public class ResourceAllocationEstimation extends ResourceAllocationSearch {
    String[] technologies;
    Date startDate;
    Date endDate;
    int budget;

    public ResourceAllocationEstimation(String[] technologies, Date startDate, Date endDate, int budget) {
        super();
        this.technologies = technologies;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
    }

    @Override
    public Project[] search() {
        try {
            if(technologies.length < 1) {
                return null;
            }

            StringBuffer condition = new StringBuffer("");
            condition.append("SELECT ID2 FROM Resource WHERE Technologies IN ('").append(technologies[0]);
            for(int i = 1;i < technologies.length; i++) {
                condition.append("','").append(technologies[i]);
            }
            condition.append("')");

            condition.append(" OR budget = ").append(budget);

            PersistentSession session = OODPersistentManager.instance().getSession();
            List<Integer> resultIDs = session.createSQLQuery(condition.toString()).list();

            ArrayList<Project> projects = new ArrayList<>();
            for(Integer id:resultIDs) {
                InformationResource informationResource = InformationResourceDAO.getInformationResourceByORMID(id);
                if(informationResource instanceof System) {
                    int projectID = (int) session.createSQLQuery("SELECT ResourceID2 FROM Resource WHERE ID2 = "
                            + informationResource.getID()).uniqueResult();
                    Project project = ProjectDAO.getProjectByORMID(projectID);
                    projects.add(project);
                } else if(informationResource instanceof Project) {
                    projects.add((Project) informationResource);
                }
            }

            ArrayList<Project> result = new ArrayList<>();

            for(Project project: projects) {
                result.add(project);
            }


            setResults(result.toArray(new Project[result.size()]));
            return getResults();
        }
        catch(PersistentException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
