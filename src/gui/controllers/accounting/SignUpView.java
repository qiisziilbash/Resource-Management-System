package gui.controllers.accounting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import businesslogic.ClientAccountingLogicFacade;
import businesslogic.accounting.job.Job;
import businesslogic.accounting.job.JobType;
import businesslogic.accounting.job.Programming;
import businesslogic.accounting.job.ProjectManagement;
import businesslogic.accounting.job.ResourceManagement;
import businesslogic.accounting.job.Specialty;
import businesslogic.accounting.user.Admin;
import businesslogic.accounting.user.Employee;
import businesslogic.accounting.user.HighLevelManager;
import businesslogic.accounting.user.MiddleLevelManager;
import businesslogic.accounting.user.User;
import businesslogic.accounting.user.UserType;
import businesslogic.distribution.resource.HumanResource;
import businesslogic.utility.Notification;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class SignUpView {

    private double animationTime = 700;

    private Stage stage;

    private AnchorPane onTheTopPane;

    private Alert alert;

    @FXML private AnchorPane signUpPane;
    @FXML private AnchorPane specialtyAdditionPane;
    @FXML private AnchorPane jobAdditionPane;


    @FXML private TextField usernameTextField;
    @FXML private TextField passwordTextField;
    @FXML private TextField PasswordConfirmationTextField;
    @FXML private TextField emailTextField;
    @FXML private ComboBox<String> userTypeCombo;
    @FXML private ListView<String> jobsListView;
    @FXML private ListView<String> specialtiesListView;

    private ArrayList<Specialty> specialties = new ArrayList<>();
    private ArrayList<String> jobTitles = new ArrayList<>();


    @FXML private ComboBox<String> jobTypeCombo;
    @FXML private ListView<String> jobsListViewInJobAddition;


    @FXML private TextField specialtyTitleTextField;
    @FXML private Slider proficiencyLevelSlider;
    @FXML private ListView<String> specialtiesListViewInSpecialtyAddition;
    @FXML private Button addSpecialtyButton;

    @FXML private void initialize(){

        onTheTopPane = signUpPane;

        for(JobType jobType : JobType.values())
            jobTypeCombo.getItems().add(jobType.getTitle());

        for(UserType userType : UserType.values())
            userTypeCombo.getItems().add(userType.getTitle());


        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));

        addSpecialtyButton.setDisable(true);
        specialtiesListView.setDisable(true);

    }

    @FXML private void registerButtonPressed(ActionEvent event) throws IOException, ClassNotFoundException {
        User user = null;

        ArrayList<Job> jobs = new ArrayList<>();

        String userType = userTypeCombo.getValue();

        if(userType == UserType.Admin.getTitle()){
            user = new Admin();
        }else if(userType == UserType.Emplpyee.getTitle()){
            user = new Employee();
        }else if(userType == UserType.HighLevelManager.getTitle()){
            user = new HighLevelManager();
        }else if(userType == UserType.MiddleLevelManager.getTitle()){
            user = new MiddleLevelManager();
        }else{
            PasswordConfirmationTextField.getScene().getRoot().setDisable(true);
            alert.setContentText("Please select user type.");
            alert.setTitle("User type is empty!");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                usernameTextField.getScene().getRoot().setDisable(false);
                return;
            }
        }

        user.setUsername(usernameTextField.getText());

        if(!passwordTextField.getText().equals(PasswordConfirmationTextField.getText())){

            PasswordConfirmationTextField.getScene().getRoot().setDisable(true);
            alert.setTitle("Password failure!");
            alert.setContentText("Passwords does not match!");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                usernameTextField.getScene().getRoot().setDisable(false);
                return;
            }

        }

        user.setPassword(passwordTextField.getText());
        user.setEmail(emailTextField.getText());

        HumanResource humanResource = new HumanResource();
        ArrayList<HumanResource> humanResources = new ArrayList<>();

        for(String job : jobTitles){
            if(job.equals(JobType.Programming.getTitle())){
                Programming programming = new Programming();
                jobs.add(programming);
                humanResource.setProgramming(programming);
                humanResource.setName(usernameTextField.getText());
                humanResource.setUniqueIdentifier("HumanResource_" + usernameTextField.getText());
                humanResources.add(humanResource);
                user.addJob(programming);
                for(Specialty specialty : specialties)
                    programming.addSpecialty(specialty);
            }else if(job.equals(JobType.ProjectManagement.getTitle())){
                ProjectManagement projectManagement = new ProjectManagement();
                jobs.add(projectManagement);
                user.addJob(projectManagement);
            }else if(job.equals(JobType.ResourceManagement.getTitle())){
                ResourceManagement resourceManagement = new ResourceManagement();
                jobs.add(resourceManagement);
                user.addJob(resourceManagement);
            }
        }


        if(usernameTextField.getText().equals("") || passwordTextField.getText().equals("")|| emailTextField.getText().equals(""))
        {
            PasswordConfirmationTextField.getScene().getRoot().setDisable(true);


            alert.setTitle("Wrong Inputs!");
            if(usernameTextField.getText().equals(""))
                alert.setContentText("Empty username!");
            else if( passwordTextField.getText().equals(""))
                alert.setContentText("Empty password");
            else
                alert.setContentText("Empty email address!");


            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                usernameTextField.getScene().getRoot().setDisable(false);
                return;
            }
        }

        Notification notification = ClientAccountingLogicFacade.getInstance().signup(user, jobs.toArray(new Job[jobs.size()]),
                specialties.toArray(new Specialty[specialties.size()]),
                humanResources.toArray(new HumanResource[humanResources.size()]));

        passwordTextField.getScene().getRoot().setDisable(true);


        alert.setTitle("Sign up notification");
        alert.setContentText(notification.getContent());

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK)
            usernameTextField.getScene().getRoot().setDisable(false);

        backFromSignupButtonPressed(null);


    }

    @FXML private void backFromSpecialtyAdditionPressed(Event event) {

        animatePaneChange(signUpPane,false);

        specialtiesListView.getItems().removeAll();

        for(String specialty : specialtiesListViewInSpecialtyAddition.getItems())
            specialtiesListView.getItems().add(specialty);


    }

    @FXML private void singleSpecialtyAddButtonPressed(ActionEvent event) {
        Specialty specialty = new Specialty();
        specialty.setTitle(specialtyTitleTextField.getText());
        specialty.setProficiencyLevel((int)(proficiencyLevelSlider.getValue() / proficiencyLevelSlider.getMax()*10));
        specialties.add(specialty);
        specialtiesListViewInSpecialtyAddition.getItems().add(specialty.getTitle());

    }

    @FXML private void backFromJobAdditionPressed(Event event) {
        animatePaneChange(signUpPane, false);
        jobsListView.getItems().removeAll(jobsListView.getItems());

        for(String job : jobsListViewInJobAddition.getItems())
            jobsListView.getItems().add(job);

        if(!jobsListView.getItems().contains(JobType.Programming.getTitle())){
            addSpecialtyButton.setDisable(true);
            specialtiesListView.setDisable(true);
            specialtiesListView.getItems().removeAll(specialtiesListView.getItems());
            specialties.removeAll(specialties);
        }else {
            addSpecialtyButton.setDisable(false);
            specialtiesListView.setDisable(false);
        }
    }

    @FXML private void singleJobAddButtonPressed(ActionEvent event) {
        if (jobTypeCombo.getValue() == JobType.Programming.getTitle() && !jobsListViewInJobAddition.getItems().contains(jobTypeCombo.getValue())) {
            jobTitles.add(jobTypeCombo.getValue());
            jobsListViewInJobAddition.getItems().add(jobTypeCombo.getValue());
        } else if (jobTypeCombo.getValue() == JobType.ProjectManagement.getTitle()  && !jobsListViewInJobAddition.getItems().contains(jobTypeCombo.getValue())) {
            jobTitles.add(jobTypeCombo.getValue());
            jobsListViewInJobAddition.getItems().add(jobTypeCombo.getValue());
        }else if (jobTypeCombo.getValue() == JobType.ResourceManagement.getTitle()  && !jobsListViewInJobAddition.getItems().contains(jobTypeCombo.getValue())) {
            jobTitles.add(jobTypeCombo.getValue());
            jobsListViewInJobAddition.getItems().add(jobTypeCombo.getValue());
        }
    }

    @FXML private void addSpecialtyButtonPressed(ActionEvent event) {
        animatePaneChange(specialtyAdditionPane,true);
    }

    @FXML private void singleJobRemoveButtonPressed(ActionEvent event) {
        String jobToRemove = null;
        for(String job : jobTitles)
            if(job == jobsListViewInJobAddition.getSelectionModel().getSelectedItem())
                jobToRemove = job;
        jobTitles.remove(jobToRemove);

        jobsListViewInJobAddition.getItems().remove(jobsListViewInJobAddition.getSelectionModel().getSelectedItem());
    }

    @FXML private void singleSpecialtyRemoveButtonPressed(ActionEvent event) {
        for(Specialty specialty : specialties)
            if(specialty.getTitle() == specialtiesListViewInSpecialtyAddition.getSelectionModel().getSelectedItem())
                specialties.remove(specialty.getTitle());
        specialtiesListViewInSpecialtyAddition.getItems().remove(specialtiesListViewInSpecialtyAddition.getSelectionModel().getSelectedItem());
    }

    @FXML private void addJobButtonPressed(ActionEvent event) {
        animatePaneChange(jobAdditionPane,true);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void animatePaneChange(AnchorPane anchorPane, boolean direction){

        double yPos1 = -600;
        double yPos2 = 600;

        if (!direction){
            yPos1 = 600;
            yPos2 = -600;
        }

        anchorPane.setLayoutX(0);
        anchorPane.setLayoutY(yPos1);

        Timeline timeline = new Timeline();

        timeline.getKeyFrames().add(
                new KeyFrame(Duration.millis(animationTime),
                        new KeyValue(anchorPane.layoutYProperty(),
                                0,
                                Interpolator.EASE_BOTH)));
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.millis(animationTime),
                        new KeyValue(onTheTopPane.layoutYProperty(),
                                yPos2,
                                Interpolator.EASE_BOTH)));



        timeline.setCycleCount(1);
        timeline.setAutoReverse(false);
        timeline.play();

        timeline.setOnFinished(event -> onTheTopPane = anchorPane);
    }

    @FXML private void backFromSignupButtonPressed(ActionEvent event) throws IOException {
        stage.hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../fxmls/accounting/LoginView.fxml"));
        Parent root = fxmlLoader.load();
        LoginView loginView = fxmlLoader.<LoginView>getController();
        loginView.setStage(stage);
        stage.setScene(new Scene(root, 400, 310));
        stage.setWidth(400);
        stage.setHeight(310);
        stage.show();
    }
}
