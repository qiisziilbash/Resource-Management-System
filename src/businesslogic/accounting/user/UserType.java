package businesslogic.accounting.user;

/**
 * Created by qizilbash on 7/3/2016.
 */
public enum UserType {
    Emplpyee("Employee"),
    Admin("Admin"),
    MiddleLevelManager("Middle Lveel Manager"),
    HighLevelManager("High Level Manager");

    public String getTitle() {
        return title;
    }

    private  String title;

    UserType(String title) {
        this.title = title;
    }
}
