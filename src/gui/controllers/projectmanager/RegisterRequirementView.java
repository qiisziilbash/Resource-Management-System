package gui.controllers.projectmanager;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import org.orm.PersistentException;

import businesslogic.ClientProjectManagerLogicFacade;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.requirement.RequirementPriorityEnum;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.distribution.resource.ResourceType;
import businesslogic.utility.Notification;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class RegisterRequirementView extends Controller {

    @FXML private AnchorPane registerRequirementPane;
    @FXML private AnchorPane selectInformationResourcePane;
    @FXML private ListView<String> informationResourcesListView;
    @FXML private ComboBox<String> resourceTypeCombo;
    @FXML private ComboBox<String> priorityCombo;
    @FXML private ListView<String> resourceNamesListView;

    @FXML private DatePicker endDatePicker;
    @FXML private DatePicker startDatePicker;

    @FXML private TextField quantityTextField;

    private InformationResource[] informationResources;

    private InformationResource selectedInformationResource;


    private Alert alert ;

    public void animate(){
        animatePaneChange(selectInformationResourcePane, Direction.RIGHT);
    }

    public void specialInit() throws IOException, ClassNotFoundException {
        informationResources = ClientProjectManagerLogicFacade.getInstance().getInformationResources(user.getID());
        informationResourcesListView.getItems().removeAll(informationResourcesListView.getItems());
        for(InformationResource informationResource : informationResources)
            informationResourcesListView.getItems().add(getInfoString(informationResource));

        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));
    }

    @FXML private void RegisterARequirementPressed(ActionEvent event) {
        if(informationResourcesListView.getSelectionModel().getSelectedItems().size() !=1)
        {
            informationResourcesListView.getScene().getRoot().setDisable(true);

            alert.setContentText("Please select a information resource");
            alert.setTitle("Invalid Selection");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                informationResourcesListView.getScene().getRoot().setDisable(false);
                return;
            }
        }else{
            for (InformationResource informationResource : informationResources)
                if(informationResourcesListView.getSelectionModel().getSelectedItem().equals(getInfoString(informationResource)))
                    selectedInformationResource = informationResource;

            if(resourceTypeCombo.getItems().size() == 0)
                for(ResourceType resourceType : ResourceType.values())
                    resourceTypeCombo.getItems().add(resourceType.getTitle());

            if(priorityCombo.getItems().size() ==0)
                for(RequirementPriorityEnum resourcePriority : RequirementPriorityEnum.values())
                    priorityCombo.getItems().add(resourcePriority.toString());


            animatePaneChange(registerRequirementPane,Direction.RIGHT);
        }

    }

    @FXML private void RegisterRequirementPressed(ActionEvent event) throws PersistentException, IOException, ClassNotFoundException {

        Requirement requirement = new Requirement();

        Date sDate = new Date(startDatePicker.getValue().toEpochDay());
        Date eDate = new Date(endDatePicker.getValue().toEpochDay());
        businesslogic.utility.Date startDate = new businesslogic.utility.Date(sDate);
        businesslogic.utility.Date endDate = new businesslogic.utility.Date(eDate);

        requirement.setStartDate(startDate.toString());
        requirement.setEndDate(endDate.toString());
        requirement.setQuantity(Integer.parseInt(quantityTextField.getText()));
        requirement.setResourceName(resourceNamesListView.getSelectionModel().getSelectedItem());
        requirement.setResourceType(resourceTypeCombo.getSelectionModel().getSelectedItem());
        requirement.setRequirementPriority(RequirementPriorityEnum.valueOf(priorityCombo.getSelectionModel().getSelectedItem()).ordinal());
        requirement.setInformationResource(selectedInformationResource);


        Notification notification = ClientProjectManagerLogicFacade.getInstance().registerRequirement(user.getID(), requirement, selectedInformationResource);
        quantityTextField.setDisable(true);
        alert.setTitle("Result");
        if(notification!=null)
            alert.setContentText(notification.getContent());
        else
            alert.setContentText("Null Result");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            quantityTextField.setDisable(false);
            return;
        }

    }

    private String getInfoString(InformationResource informationResource) {
        return informationResource.getID() + " : " + informationResource.getName();
    }

    @FXML private void resourceTypeChanged(ActionEvent event) throws IOException, ClassNotFoundException {
        String[] resourceNames = ClientProjectManagerLogicFacade.getInstance().getResourceNames(user.getID(), resourceTypeCombo.getSelectionModel().getSelectedItem());
        resourceNamesListView.getItems().removeAll(resourceNamesListView.getItems());
        for(String resource : resourceNames)
            resourceNamesListView.getItems().add(resource);
    }

    public void backFromRequirementRegister(Event event) {
        animatePaneChange(selectInformationResourcePane,Direction.LEFT);
    }
}
