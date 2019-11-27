package gui.controllers.programmer;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import businesslogic.ClientProgrammerLogicFacade;
import businesslogic.distribution.resource.Module;
import businesslogic.distribution.resource.ModuleChange;
import businesslogic.utility.Notification;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class ModuleMaintenanceView extends Controller {

    @FXML private AnchorPane moduleMaintenancePane;
    @FXML private ComboBox<String> modulesCombo;
    @FXML private TextArea changeDescriptionTextArea;
    @FXML private ListView<String> changesListView;

    private Alert alert;

    @FXML private DatePicker startDate;
    @FXML private DatePicker endDate;


    public void animate(){
        animatePaneChange(moduleMaintenancePane, Direction.RIGHT);
    }

    public void specialInit() throws IOException, ClassNotFoundException {
        Module[] modules = ClientProgrammerLogicFacade.getInstance().getModuleList(user.getID());
        if(modulesCombo.getItems().size() == 0)
            for (Module module : modules)
                modulesCombo.getItems().add(getModuleString(module));

        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));
    }

    @FXML private void registerButtonPressed(ActionEvent event) throws IOException, ClassNotFoundException {
        if (modulesCombo.getSelectionModel().getSelectedItem().isEmpty()) {
            alert.setContentText("Please select a module.");
            alert.setTitle("Empty module!");
            modulesCombo.getScene().getRoot().setDisable(true);
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                modulesCombo.getScene().getRoot().setDisable(false);
                return;
            }

        } else {

            Module selectedModule = null;
            String selectedItem = modulesCombo.getSelectionModel().getSelectedItem();

            for (Module module : ClientProgrammerLogicFacade.getInstance().getModuleList(user.getID()))
                if (selectedItem.equals(getModuleString(module)))
                    selectedModule = module;

            Date sDate = new Date(startDate.getValue().toEpochDay());
            Date eDate = new Date(endDate.getValue().toEpochDay());
            businesslogic.utility.Date stDate = new businesslogic.utility.Date(sDate);
            businesslogic.utility.Date edDate = new businesslogic.utility.Date(eDate);

            ArrayList<ModuleChange> moduleChanges = new ArrayList<>();

            for(String change : changesListView.getItems()) {
                ModuleChange moduleChange = new ModuleChange();
                moduleChange.setDescription(change);
                moduleChange.setStartDate(stDate.toString());
                moduleChange.setEndDate(edDate.toString());
                moduleChanges.add(moduleChange);
            }




            Notification notification = null;
            if (selectedModule != null)
                notification = ClientProgrammerLogicFacade.getInstance().registerModuleMaintenance(
                        user.getID(), selectedModule.getID(), moduleChanges.toArray(new ModuleChange[moduleChanges.size()]));

            alert.setTitle("Registration result");
            alert.setContentText(notification.getContent());
            modulesCombo.getScene().getRoot().setDisable(true);
            Optional<ButtonType> result = alert.showAndWait();
            if(result.get() == ButtonType.OK){
                modulesCombo.getScene().getRoot().setDisable(false);
                changesListView.getItems().removeAll(changesListView.getItems());
                changeDescriptionTextArea.setText("");
                return;
            }

        }
    }

    @FXML private void addChangePressed(ActionEvent event) {
        changesListView.getItems().add(changeDescriptionTextArea.getText());
    }

    private String getModuleString( Module module){
        return String.valueOf(module.getID()) + " : " + module.getName();
    }


    @FXML private void comboChanged(ActionEvent event) {
        changesListView.getItems().removeAll(changesListView.getItems());
    }
}
