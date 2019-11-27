package gui.controllers.projectmanager;


import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import businesslogic.ClientProjectManagerLogicFacade;
import businesslogic.distribution.resource.HumanResource;
import businesslogic.distribution.resource.Module;
import businesslogic.distribution.resource.Project;
import businesslogic.utility.Notification;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class AssignModuleView extends Controller {


    @FXML private AnchorPane assignPane;
    @FXML private AnchorPane moduleAssignmentPane;

    @FXML private ListView<String> projectsListView;
    @FXML private ListView<String> modulesListView;
    @FXML private ListView<String> programmersListView;

    private Alert alert;


    private Project[] projects;
    private Project selectedProject;

    Module[] modules;
    HumanResource[] humanResources;
    HumanResource selectedHumanResource;
    Module selectedModule;


    public void specialInit() throws IOException, ClassNotFoundException {
        projects = ClientProjectManagerLogicFacade.getInstance().getProjectList(user.getID());

        for (Project project : projects)
            projectsListView.getItems().add(getProjectString(project));

        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));

    }

    public void animate(){
        animatePaneChange(moduleAssignmentPane, Direction.RIGHT);
    }

    public void getModulesAndProgrammersPressed(ActionEvent event) throws IOException, ClassNotFoundException {
        if(projectsListView.getSelectionModel().getSelectedItems().size() !=1){
            projectsListView.getScene().getRoot().setDisable(true);
            alert.setTitle("Empty selection!");
            alert.setContentText("Please select a project.");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                projectsListView.getScene().getRoot().setDisable(false);
                return;
            }
        }else {

            for (Project project : projects)
                if(projectsListView.getSelectionModel().getSelectedItem().equals(getProjectString(project)))
                    selectedProject = project;

            humanResources = ClientProjectManagerLogicFacade.getInstance().getProgrammers(selectedProject);

            modules = ClientProjectManagerLogicFacade.getInstance().getModules(selectedProject);

            modulesListView.getItems().clear();

            for(Module module : modules)
                modulesListView.getItems().add(getModuleString(module));

            programmersListView.getItems().clear();
            for (HumanResource humanResource : humanResources)
                programmersListView.getItems().add(getProgrammerString(humanResource));

            animatePaneChange(assignPane,Direction.RIGHT);

        }
    }

    public void assignModulePressed(ActionEvent event) throws IOException, ClassNotFoundException {
        if(programmersListView.getSelectionModel().getSelectedItems().size() !=1 && modulesListView.getSelectionModel().getSelectedItems().size() != 1){
            alert.setTitle("Invalid Selection");
            alert.setContentText("Please Select a Programmer and a module.");

            programmersListView.getScene().getRoot().setDisable(true);

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                programmersListView.getScene().getRoot().setDisable(false);
                return;
            }

        } else {
            for(Module module : modules)
                if(modulesListView.getSelectionModel().getSelectedItem().equals(getModuleString(module)))
                    selectedModule = module;
            for(HumanResource humanResource : humanResources)
                if(programmersListView.getSelectionModel().getSelectedItem().equals(getProgrammerString(humanResource)))
                    selectedHumanResource = humanResource;

            HashMap<HumanResource, Module> assignment = new HashMap<>();
            assignment.put(selectedHumanResource,selectedModule);

            Notification notification = ClientProjectManagerLogicFacade.getInstance().assignModules(assignment);

            programmersListView.getScene().getRoot().setDisable(true);
            alert.setTitle("Result");
            if(notification!=null)
                alert.setContentText(notification.getContent());
            else
                alert.setContentText("Null Result");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                programmersListView.getScene().getRoot().setDisable(false);
                return;
            }

        }
    }

    private String getProjectString(Project project){
        return project.getID() +  " : " + project.getName();
    }

    private String getProgrammerString(HumanResource humanResource){
        return humanResource.getID()  + " : " + humanResource.getName();
    }

    private String getModuleString(Module module){
        return module.getID() + " : " + module.getName();
    }
}
