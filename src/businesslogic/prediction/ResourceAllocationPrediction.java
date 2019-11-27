package businesslogic.prediction;

import java.util.ArrayList;

import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.resource.Project;

/**
 * Created by Esi on 7/6/2016.
 */
public class ResourceAllocationPrediction extends ResourceAllocationSearch {

    Project project;
    Project[] allProjects;

    public ResourceAllocationPrediction(Project project, Project[] allProjects) {
        super();
        this.project = project;
        this.allProjects = allProjects;
    }

    @Override
    public Project[] search() {

        Requirement[] requirements = project.getRequirementsRecursive();

        ArrayList<Project> resultList = new ArrayList<>();

        for(Project p:allProjects) {
            if(p.getID() == project.getID()) {
                continue;
            }
            Requirement [] rs = p.getRequirementsRecursive();
            boolean similar = false;
            for(Requirement r: rs) {
                for(Requirement requirement: requirements) {
                    if (r.getResourceType().equals(requirement.getResourceType()) &&
                            r.getResourceName().equals(requirement.getResourceName())) {
                        similar = true;
                        break;
                    }
                }
                if(similar) {
                    break;
                }
            }

            if(similar) {
                resultList.add(p);
            }
        }

        setResults(resultList.toArray(new Project[resultList.size()]));
        return getResults();
    }
}
