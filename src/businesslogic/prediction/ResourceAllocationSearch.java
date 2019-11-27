package businesslogic.prediction;

import businesslogic.distribution.resource.Project;

/**
 * Created by Esi on 6/23/2016.
 */
public abstract class ResourceAllocationSearch {
    private Project[] results;

    public ResourceAllocationSearch() {
    }

    public Project[] getResults() {
        return results;
    }

    public void setResults(Project[] results) {
        this.results = results;
    }

    public abstract Project[] search();

}
