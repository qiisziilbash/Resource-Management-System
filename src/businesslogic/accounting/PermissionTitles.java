package businesslogic.accounting;

/**
 * Created by qizilbash on 7/2/2016.
 */
public enum PermissionTitles {

    SYSTEM_CONFIGURATION("Configure System"),

    MODULE_CREATION ("Register Module Creation"),
    MODULE_MAINTAINE("Register Module Maintenance"),

    REQUIREMENT_REGISTRATION("Register Requirement"),
    MODULE_ASSIGNMENT("Assign Module"),
    PROJECT_SCALE_REGISTRATION("Register Project Scale"),
    RESOURCE_ALLOCATION_ESTIMATION("Estimate Resource Allocations"),

    ESSENTIAL_RESOURCE_ALLOCATION_PREDICTION("Predict Essential Resource Allocation"),
    NEW_RESOURCE_REGISTRATION("Register New Resource"),
    RESOURCE_ALLOCATION_REGISTRATION("Register Resource Allocation"),

    RESOURCE_ALLOCATION_FLOW_REPORT("Resource Allocation Flow Report"),
    RESOURCE_REQUIREMENTS_REPORT("Resource Requirements Report"),
    RESOURCES_REPORT("Resources Report"),

    USER_APPROVAL("Accounting Requests");


    private String titleText;

    PermissionTitles(String titleText) {
        this.setTitleText(titleText);
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }
}
