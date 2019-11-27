package gui.controllers;

import gui.StartMenu;

import java.io.IOException;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import businesslogic.ClientAccountingLogicFacade;
import businesslogic.accounting.PermissionTitles;
import businesslogic.accounting.user.User;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class MainMenuView {

    private User user;
    private Stage stage;
    private Alert alert;
    private FXMLLoader fxmlLoader;
    private AnchorPane root;

    @FXML private AnchorPane mainPane;

    @FXML private MenuBar menuBar;
    private Menu profileMenu;
    private MenuItem viewProfile;
    private MenuItem editProfile;
    private MenuItem signOut;

    private Menu permissionMenu;

    private Menu reportMenu;

    private Menu helpMenu;
    private MenuItem about;




    public void setUser(User user) {
        this.user = user;
    }


    public void initializeView() {
        initializeProfileMenu();
        initializePermissionMenu();
        initializeReportMenu();
        initializeHelpMenu();

        alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../resources/erp.png").toString()));

    }

    private void initializeReportMenu() {

        PermissionTitles[] permissions = user.getPermissions();

        boolean isReportMenu = false;


        for( PermissionTitles permission : permissions)
            if(permission.getTitleText().equals(PermissionTitles.RESOURCE_ALLOCATION_FLOW_REPORT.getTitleText()) ||
                    permission.getTitleText().equals(PermissionTitles.RESOURCE_REQUIREMENTS_REPORT.getTitleText()) ||
                    permission.getTitleText().equals(PermissionTitles.RESOURCES_REPORT.getTitleText()))
                isReportMenu = true;

        if(isReportMenu){
            reportMenu = new Menu("Report");

            for(PermissionTitles permission : permissions )
                switch (permission.getTitleText()) {
                    case "Resource Allocation Flow Report":
                        MenuItem reportResourceAllocationMenuItem = new MenuItem(permission.getTitleText());
                        reportResourceAllocationMenuItem.setOnAction(event -> {
                            try {
                                loadFXML("../fxmls/resourcemanager/FlowReportView.fxml");
                            } catch (IOException e) {
                                e.printStackTrace();
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                        });
                        reportMenu.getItems().add(reportResourceAllocationMenuItem);
                        break;
                    case "Resource Requirements Report":
                        MenuItem reportResourceRequirementMenuItem = new MenuItem(permission.getTitleText());
                        reportResourceRequirementMenuItem.setOnAction(event -> {
                            try {
                                loadFXML("../fxmls/resourcemanager/ResourceRequirementsReportView.fxml");
                            } catch (IOException e) {
                                e.printStackTrace();
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                        });
                        reportMenu.getItems().add(reportResourceRequirementMenuItem);
                        break;
                    case "Resources Report":
                        MenuItem reportResourcesMenuItem = new MenuItem(permission.getTitleText());
                        reportResourcesMenuItem.setOnAction(event -> {
                            try {
                                loadFXML("../fxmls/resourcemanager/ResourceReportView.fxml");
                            } catch (IOException e) {
                                e.printStackTrace();
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                        });
                        reportMenu.getItems().add(reportResourcesMenuItem);
                        break;
                }

            menuBar.getMenus().add(reportMenu);
        }else
            return;

    }

    private void initializePermissionMenu() {
        permissionMenu = new Menu("Permissions");


        PermissionTitles[] permissions = user.getPermissions();


        for(PermissionTitles permission : permissions )
            switch (permission.getTitleText()) {
                case "Configure System":
                    MenuItem configureSystemMenuItem = new MenuItem(permission.getTitleText());
                    configureSystemMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/admin/SystemConfigurationView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });

                    permissionMenu.getItems().add(configureSystemMenuItem);
                    break;
                case "Register Module Creation":
                    MenuItem createModuleMenuItem = new MenuItem(permission.getTitleText());
                    createModuleMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/programmer/ModuleCreationView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(createModuleMenuItem);
                    break;
                case "Register Module Maintenance":
                    MenuItem maintaneModuleMenuItem = new MenuItem(permission.getTitleText());
                    maintaneModuleMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/programmer/ModuleMaintenanceView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(maintaneModuleMenuItem);
                    break;
                case "Register Requirement":
                    MenuItem registerRequirementMenuItem = new MenuItem(permission.getTitleText());
                    registerRequirementMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/projectmanager/RegisterRequirementView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(registerRequirementMenuItem);
                    break;
                case "Assign Module":
                    MenuItem assignModuleMenuItem = new MenuItem(permission.getTitleText());
                    assignModuleMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/projectmanager/AssignModuleView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(assignModuleMenuItem);
                    break;
                case "Register Project Scale":
                    MenuItem registerProjectScaleMenuItem = new MenuItem(permission.getTitleText());
                    registerProjectScaleMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/projectmanager/RegisterProjectScaleView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(registerProjectScaleMenuItem);
                    break;
                case "Estimate Resource Allocations":
                    MenuItem estimateResourceAllocationsMenuItem = new MenuItem(permission.getTitleText());
                    estimateResourceAllocationsMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/projectmanager/EstimateResourceAllocationView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(estimateResourceAllocationsMenuItem);
                    break;
                case "Predict Essential Resource Allocation":
                    MenuItem predictEssentialResourceAllocationMenuItem = new MenuItem(permission.getTitleText());
                    predictEssentialResourceAllocationMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/resourcemanager/PredictEssentialResourceAllocationsView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(predictEssentialResourceAllocationMenuItem);
                    break;
                case "Register New Resource":
                    MenuItem registerNewResourceMenuItem = new MenuItem(permission.getTitleText());
                    registerNewResourceMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/resourcemanager/RegisterNewResourceView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(registerNewResourceMenuItem);
                    break;
                case "Register Resource Allocation":
                    MenuItem registerResourceAllocationMenuItem = new MenuItem(permission.getTitleText());
                    registerResourceAllocationMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/resourcemanager/ResourceAllocationView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(registerResourceAllocationMenuItem);
                    break;
                case "Accounting Requests":
                    MenuItem accountingRequestsMenuItem = new MenuItem(permission.getTitleText());
                    accountingRequestsMenuItem.setOnAction(event -> {
                        try {
                            loadFXML("../fxmls/manager/AccountingRequestsView.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                    permissionMenu.getItems().add(accountingRequestsMenuItem);
                    break;

            }

        menuBar.getMenus().add(permissionMenu);

    }

    private void initializeHelpMenu() {
        helpMenu = new Menu("Help");


        about = new MenuItem("About");
        helpMenu.getItems().add(about);
        about.setOnAction(event -> {
            try {
                showAbout();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        menuBar.getMenus().add(helpMenu);
    }


    private void showAbout() throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("../fxmls/HelpView.fxml"));
        Pane root = fxmlLoader.load();
        fxmlLoader.<AboutView>getController().animate();
        mainPane.getChildren().removeAll(mainPane.getChildren());
        mainPane.getChildren().add(root);
    }

    private void initializeProfileMenu() {
        profileMenu = new Menu("Profile");
        viewProfile = new MenuItem("View Profile");
        viewProfile.setOnAction(event -> {
            try {
                loadFXML("../fxmls/accounting/ViewProfileView.fxml");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

        editProfile = new MenuItem("Edit Profile");
        editProfile.setOnAction(event -> {
            try {
                loadFXML("../fxmls/accounting/EditProfileView.fxml");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

        signOut = new MenuItem("Sign Out");
        signOut.setOnAction(event -> {
            try {
                signOut();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        profileMenu.getItems().addAll(viewProfile,editProfile,signOut);

        menuBar.getMenus().add(profileMenu);
    }

    private void signOut() throws Exception {
        mainPane.setDisable(true);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Warning!");
        alert.setContentText("Are you sure?");

        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../resources/erp.png").toString()));


        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            stage = (Stage) mainPane.getScene().getWindow();
            stage.close();
            ClientAccountingLogicFacade.getInstance().logout(user.getID());
            new StartMenu().start(stage);
        } else {
           mainPane.setDisable(false);
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    private void loadFXML(String address) throws IOException, ClassNotFoundException {
        fxmlLoader = new FXMLLoader(getClass().getResource(address));
        root = fxmlLoader.load();
        fxmlLoader.<Controller>getController().init(stage, user);
        fxmlLoader.<Controller>getController().animate();
        mainPane.getChildren().removeAll(mainPane.getChildren());
        mainPane.getChildren().add(root);
    }
}
