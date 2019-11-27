package gui.controllers.projectmanager;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import businesslogic.ClientProjectManagerLogicFacade;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.resource.InformationResource;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class EstimateResourceAllocationView extends Controller {

    @FXML private AnchorPane estimateResourceAllocationPane;
    @FXML private AnchorPane estimationPane;

    @FXML private DatePicker startDate;
    @FXML private DatePicker endDate;

    @FXML private TextField budgetTextField;
    @FXML private TextField technologyTextField;

    @FXML private ListView<String> technologiesListView;

    @FXML private TreeView infornationResourcesTreeView;

    private InformationResource[] informationResources;
    private ArrayList<String> technologies= new ArrayList<>();

    private Alert alert;


    public void animate(){
        animatePaneChange(estimateResourceAllocationPane, Direction.RIGHT);
    }

    public void specialInit(){
        technologies.clear();
        technologiesListView.getItems().clear();

        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));
    }



    @FXML private void estimatePressed(ActionEvent event) throws IOException, ClassNotFoundException {

        technologies.clear();
        for(String technology : technologiesListView.getItems())
            technologies.add(technology);


        int budget;
        try{
            budget = Integer.parseInt(budgetTextField.getText());
        }catch (Exception e){
            technologiesListView.getScene().getRoot().setDisable(true);

            alert.setTitle("Invalid Entry");
            alert.setContentText("Please enter an integer value for budget.");

            technologiesListView.getScene().getRoot().setDisable(false);
            return;
        }


        java.util.Date sDate = new java.util.Date(startDate.getValue().toEpochDay());
        java.util.Date eDate = new java.util.Date(endDate.getValue().toEpochDay());

        businesslogic.utility.Date stDate = new businesslogic.utility.Date(sDate);
        businesslogic.utility.Date edDate = new businesslogic.utility.Date(eDate);



        informationResources = ClientProjectManagerLogicFacade.getInstance().estimateResourceAllocations(
                technologies.toArray(new String[technologies.size()]),stDate,edDate, budget);



        TreeItem<String> rootItem = new TreeItem<>("Estimated Projects");

        for (InformationResource informationResource : informationResources){
            TreeItem<String> item = new TreeItem<>(informationResource.getName());
            item.getChildren().add(new TreeItem<>("ID : " + informationResource.getID()));
            rootItem.getChildren().addAll(item);



            for(Requirement requirement : informationResource.getRequirementsRecursive()){
                TreeItem<String> req = new TreeItem<>("Requirements");
                req.getChildren().clear();
                req.getChildren().addAll(
                        new TreeItem<>("ID : " + requirement.getID()),
                        new TreeItem<>("Resource Name :" + requirement.getResourceName()),
                        new TreeItem<>("Resource type : " + requirement.getResourceType()));
                rootItem.getChildren().addAll(req);
            }

        }

        infornationResourcesTreeView.setRoot(rootItem);

        animatePaneChange(estimationPane, Direction.RIGHT);

    }

    @FXML private void backFromEstimationResultPressed(Event event) {
        animatePaneChange(estimateResourceAllocationPane,Direction.LEFT);
    }

    @FXML private void addTechnologyPressed(ActionEvent event) {
        if(technologyTextField.getText()!=""){
            technologiesListView.getItems().addAll(technologyTextField.getText());
        }
    }
}
