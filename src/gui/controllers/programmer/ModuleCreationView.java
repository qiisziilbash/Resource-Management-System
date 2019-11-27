package gui.controllers.programmer;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import businesslogic.ClientProgrammerLogicFacade;
import businesslogic.distribution.resource.Module;
import businesslogic.utility.Notification;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class ModuleCreationView extends Controller {


    @FXML private AnchorPane moduleCreationPane;
    @FXML private ComboBox<String> modulesCombo;
    @FXML private TextArea moduleDescriptionTextArea;

    @FXML private DatePicker startDate;
    @FXML private DatePicker endDate;

    private Alert alert;



    public void animate(){
        animatePaneChange(moduleCreationPane, Direction.RIGHT);
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
    @FXML private void createModulePressed(ActionEvent event) throws IOException, ClassNotFoundException {
        Module selectedModule = null;
        String selectedItem = modulesCombo.getSelectionModel().getSelectedItem();

        for(Module module : ClientProgrammerLogicFacade.getInstance().getModuleList(user.getID()))
            if(selectedItem.equals(getModuleString(module)))
                selectedModule = module;

        Date sDate = new Date(startDate.getValue().toEpochDay());
        Date eDate = new Date(endDate.getValue().toEpochDay());
        businesslogic.utility.Date stDate = new businesslogic.utility.Date(sDate);
        businesslogic.utility.Date edDate = new businesslogic.utility.Date(eDate);

        Notification notification = null;
        if( selectedModule !=null)
            notification = ClientProgrammerLogicFacade.getInstance().registerModuleCreation(user.getID(),selectedModule.getID(),
                    moduleDescriptionTextArea.getText(),stDate,edDate);

        modulesCombo.getScene().getRoot().setDisable(true);
        alert.setTitle("Result");
        alert.setContentText(notification.getContent());
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            modulesCombo.getScene().getRoot().setDisable(false);
            return;
        }



    }

    private String getModuleString( Module module){
        return String.valueOf(module.getID()) + " : " + module.getName();
    }
}
