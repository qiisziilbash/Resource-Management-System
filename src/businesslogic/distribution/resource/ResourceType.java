package businesslogic.distribution.resource;

/**
 * Created by qizilbash on 7/4/2016.
 */
public enum ResourceType {
    PHYSICAL("PhysicalResource"),
    FINANCIAL("FinancialResource"),
    HUMAN("HumanResource"),
    INFORMATION("InformationResource");

    private String title;

    public String getTitle() {
        return title;
    }

    ResourceType(String title) {
        this.title = title;
    }
}
