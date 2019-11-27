package gui.controllers.resourcemanager;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import businesslogic.ClientResourceManagerLogicFacade;
import businesslogic.distribution.Allocation;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.resource.Resource;
import businesslogic.utility.Notification;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class ResourceAllocationView extends Controller{

    private Alert alert;

    private Requirement[] requirements;
    private Requirement selectedRequirement;

    @FXML private AnchorPane resourceAllocationPane;
    @FXML private AnchorPane requirementViewPane;

    @FXML private ListView<String> requirementsListView;
    @FXML private ListView<String> requirementSpecificationListView;
    @FXML private ListView<String> relatedResourcesNamesListView;

    private Resource[] resources;

    public void animate(){
        animatePaneChange(resourceAllocationPane,Direction.RIGHT);
    }
    public void specialInit() throws IOException, ClassNotFoundException {

        requirements = ClientResourceManagerLogicFacade.getInstance().getRequirements(user.getID());

        for(Requirement item : requirements)
            requirementsListView.getItems().add(getRequirementString(item));

        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));
    }



    @FXML private void acceptAllocationButtonPressed(ActionEvent event) throws IOException, ClassNotFoundException {
        if(relatedResourcesNamesListView.getSelectionModel().getSelectedItems().size() == 0){
            resourceAllocationPane.setDisable(true);
            alert.setTitle("Invalid selection");
            alert.setContentText("Please select at least one resource to allocation");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                resourceAllocationPane.setDisable(false);
                return;
            }
        }

        ArrayList<Resource> allocatedResources = new ArrayList<>();


        for(String item : relatedResourcesNamesListView.getSelectionModel().getSelectedItems())
            for (Resource resource : resources)
                if(getResourceString(resource).equals(item))
                    allocatedResources.add(resource);

        Allocation allocation = new Allocation();
        allocation.setRequirement(selectedRequirement);
        allocation.addResources(allocatedResources.toArray(new Resource[allocatedResources.size()]));


        Notification notification = ClientResourceManagerLogicFacade.getInstance().registerResourceAllocation(
                user.getID(), allocation, allocatedResources.toArray(new Resource[allocatedResources.size()]));

        resourceAllocationPane.setDisable(true);
        alert.setTitle("Result");
        if(notification!=null)
            alert.setContentText(notification.getContent());
        else
            alert.setContentText("Null Result");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            resourceAllocationPane.setDisable(false);
            return;
        }


    }

    @FXML private void rejectAllocationButtonPressed(ActionEvent event) throws IOException, ClassNotFoundException {
        Notification notification = ClientResourceManagerLogicFacade.getInstance().rejectResourceAllocation(
                user.getID(), selectedRequirement.getID());

        resourceAllocationPane.setDisable(true);

        alert.setTitle("Result");
        if(notification!=null)
            alert.setContentText(notification.getContent());
        else
            alert.setContentText("Null Result");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            resourceAllocationPane.setDisable(false);
            return;
        }
    }

    @FXML private void backFromRequirmentView(Event event) {
        animatePaneChange(resourceAllocationPane, Direction.LEFT);
    }

    @FXML private void viewRequirementPressed(ActionEvent event) throws IOException, ClassNotFoundException {

        if(requirementsListView.getSelectionModel().getSelectedItem().isEmpty()){
            requirementViewPane.setDisable(true);
            alert.setTitle("Invalid Selection");
            alert.setContentText("Please select a requirement");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                requirementViewPane.setDisable(false);
                return;
            }
        }

        String requirement = requirementsListView.getSelectionModel().getSelectedItem();
        for ( Requirement item : requirements)
            if(requirement.equals(getRequirementString(item)))
                selectedRequirement = item;




        requirementSpecificationListView.getItems().clear();

        requirementSpecificationListView.getItems().addAll(
                "ID : " + String.valueOf(selectedRequirement.getID()),
                "Name : " + String.valueOf(selectedRequirement.getResourceName()),
                "Resource Type : " + String.valueOf(selectedRequirement.getResourceType()),
                "Start Date : " + String.valueOf(selectedRequirement.getStartDate()),
                "End Date : " + String.valueOf(selectedRequirement.getEndDate()),
                "Quantity : " + selectedRequirement.getQuantity(),
                "Information Resource : " + selectedRequirement.getInformationResource().getName()
        );


        resources = ClientResourceManagerLogicFacade.getInstance().getResources(user.getID(),selectedRequirement.getResourceType(),selectedRequirement.getResourceName());
        relatedResourcesNamesListView.getItems().removeAll(relatedResourcesNamesListView.getItems());
        for (Resource resource : resources)
            relatedResourcesNamesListView.getItems().add(getResourceString(resource));

        animatePaneChange(requirementViewPane, Direction.RIGHT);
    }


    private String getRequirementString(Requirement requirement){
        String result = "";
        result += "Name : " + requirement.getResourceName() + " --> Project : " ;
        result +=  requirement.getInformationResource().getName();
        return result;
    }

    private String getResourceString(Resource resource) {
        String result = "";
        result += resource.getName() + " : " + resource.getResourceState();
        return result;
    }


}
