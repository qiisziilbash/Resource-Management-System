package businesslogic.accounting.job;

/**
 * Created by qizilbash on 7/3/2016.
 */
public enum JobType {
    ProjectManagement("Project Management"),
    ResourceManagement("Resource Management"),
    Programming("Programming");



    private String title;

    JobType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
