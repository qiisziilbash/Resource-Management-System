package gui.controllers.resourcemanager;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import businesslogic.ClientResourceManagerLogicFacade;
import businesslogic.distribution.resource.FinancialResource;
import businesslogic.distribution.resource.PhysicalResource;
import businesslogic.distribution.resource.Resource;
import businesslogic.distribution.resource.ResourceType;
import businesslogic.utility.Notification;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class RegisterNewResourceView extends Controller{


    @FXML private AnchorPane registerNewResourcePane;
    @FXML private ComboBox<String> resourceTypeCombo;

    @FXML private TextField resourceNameTextField;
    @FXML private TextField idTextField;
    @FXML private TextField specificationTextField;
    @FXML private TextField valueTextField;

    @FXML private ListView<String> specListView;
    @FXML private Label specificationLabel;
    @FXML private Label valueLabel;

    @FXML private Label creditLabel;
    @FXML private TextField creditTestField;

    @FXML private Button addSpecificationButton;

    private Alert alert;

    private ArrayList<ArrayList<String>> specValue = new ArrayList<>();




    public void animate(){
        animatePaneChange(registerNewResourcePane, Direction.RIGHT);
    }

    public void specialInit(){
        for(ResourceType type : ResourceType.values())
            if(!type.equals(ResourceType.INFORMATION) && !type.equals(ResourceType.HUMAN) )
                resourceTypeCombo.getItems().add(type.getTitle());
        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));
    }


    @FXML private void addSpecification(ActionEvent event) {
        specListView.getItems().addAll(specificationTextField.getText() + " : " + valueTextField.getText());
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(specificationTextField.getText());
        arrayList.add(valueTextField.getText());
        specValue.add(arrayList);
    }

    @FXML private void registerResource(ActionEvent event) throws IOException, ClassNotFoundException {

        if(resourceTypeCombo.getSelectionModel().getSelectedItem() == null){
            resourceTypeCombo.getScene().getRoot().setDisable(true);
            alert.setContentText("Please select a resource type");
            alert.setTitle("Invalid Selection");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                resourceTypeCombo.getScene().getRoot().setDisable(false);
                return;
            }
        }else{

            Resource resource;

            if(resourceTypeCombo.getSelectionModel().getSelectedItem().equals(ResourceType.FINANCIAL.getTitle())){
                FinancialResource financialResource = new FinancialResource();
                financialResource.setName(resourceNameTextField.getText());
                financialResource.setUniqueIdentifier(idTextField.getText());
                try {
                    financialResource.setFinancialValue(Integer.parseInt(creditTestField.getText()));
                }catch (Exception e){
                    alert.setContentText("Please enter an integer value for credit.");
                    alert.setTitle("Invalid Entry");
                    Optional<ButtonType> result = alert.showAndWait();

                    if (result.get() == ButtonType.OK) {
                        resourceTypeCombo.getScene().getRoot().setDisable(false);
                        return;
                    }
                }
                resource = financialResource;


            }else{
                PhysicalResource physicalResource = new PhysicalResource();

                physicalResource.setName(resourceNameTextField.getText());
                physicalResource.setUniqueIdentifier(idTextField.getText());
                for(ArrayList<String> arrayList : specValue)
                    physicalResource.addSpec(arrayList.get(0),arrayList.get(1));


                resource = physicalResource;

            }



            Notification notification = ClientResourceManagerLogicFacade.getInstance().registerNewResource(user.getID(), resource);

            resourceTypeCombo.setDisable(true);
            alert.setTitle("Result");
            if(notification!=null)
                alert.setContentText(notification.getContent());
            else
                alert.setContentText("Null Result");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                resourceTypeCombo.setDisable(false);
                return;
            }
        }


    }

    @FXML private void resourceTypeChanged(ActionEvent event) {
        if(resourceTypeCombo.getSelectionModel().getSelectedItem().equals(ResourceType.FINANCIAL.getTitle())){


            specListView.setDisable(true);
            specificationLabel.setDisable(true);
            valueLabel.setDisable(true);
            valueTextField.setDisable(true);
            specificationTextField.setDisable(true);

            specListView.setVisible(false);
            specificationLabel.setVisible(false);
            valueLabel.setVisible(false);
            valueTextField.setVisible(false);
            specificationTextField.setVisible(false);

            creditLabel.setDisable(false);
            creditLabel.setVisible(true);

            creditTestField.setDisable(false);
            creditTestField.setVisible(true);

            addSpecificationButton.setDisable(true);
            addSpecificationButton.setVisible(false);



        }else{
            specListView.setDisable(false);
            specificationLabel.setDisable(false);
            valueLabel.setDisable(false);
            valueTextField.setDisable(false);
            specificationTextField.setDisable(false);

            specListView.setVisible(true);
            specificationLabel.setVisible(true);
            valueLabel.setVisible(true);
            valueTextField.setVisible(true);
            specificationTextField.setVisible(true);

            creditLabel.setDisable(true);
            creditLabel.setVisible(false);

            creditTestField.setDisable(true);
            creditTestField.setVisible(false);

            addSpecificationButton.setDisable(false);
            addSpecificationButton.setVisible(true);
            specListView.getItems().removeAll(specListView.getItems());
            specValue.clear();
        }
    }
}
