package gui.controllers.admin;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import businesslogic.ClientAdminLogicFacade;
import businesslogic.support.BackupFormat;
import businesslogic.support.SystemConfiguration;


/**
 * Created by qizilbash on 7/4/2016.
 */
public class SystemConfigurationView extends Controller {

    @FXML private AnchorPane systemConfigurationPane;
    @FXML private TextField backupPeriodDays;

    @FXML private ComboBox<String> backupTeypesCombo;
    private Alert alert;

    public void animate(){
        animatePaneChange(systemConfigurationPane, Direction.RIGHT);
    }

    public void specialInit(){
        for(BackupFormat backupFormat : BackupFormat.values())
            backupTeypesCombo.getItems().add(backupFormat.toString());
        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));
    }
    @FXML private void configure(ActionEvent event) throws IOException, ClassNotFoundException {
        if (backupTeypesCombo.getSelectionModel().getSelectedItem().isEmpty()) {

            backupTeypesCombo.getScene().getRoot().setDisable(true);
            alert.setTitle("Empty selection!");
            alert.setContentText("Please select a backup format.");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                backupTeypesCombo.getScene().getRoot().setDisable(false);
                return;
            }
        } else{
            SystemConfiguration systemConfiguration = new SystemConfiguration();
            systemConfiguration.setBackupFormat(BackupFormat.valueOf(backupTeypesCombo.getSelectionModel().getSelectedItem()));
            systemConfiguration.setBackupPreiodDays(Integer.parseInt(backupPeriodDays.getText()));
            ClientAdminLogicFacade.getInstance().configureSystem(user.getID(), systemConfiguration);
            backupTeypesCombo.getScene().getRoot().setDisable(true);
            alert.setTitle("Result");
            alert.setContentText("System configured.");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                backupTeypesCombo.getScene().getRoot().setDisable(false);
                return;
            }
        }
    }
}
