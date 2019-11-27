package gui.controllers.manager;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import businesslogic.ClientManagerLogicFacade;
import businesslogic.accounting.user.User;

/**
 * Created by qizilbash on 7/5/2016.
 */


public class AccountingRequestsView extends Controller{

    @FXML private AnchorPane accountingRequestsViewPane;
    @FXML private ListView<String> unApprovedUsersListView;

    private Alert alert;
    private User[] unApprovedUsers;


    public void animate(){
        animatePaneChange(accountingRequestsViewPane, Direction.RIGHT);
    }

    public void specialInit() throws IOException, ClassNotFoundException {
        unApprovedUsers =  ClientManagerLogicFacade.getInstance().getUnapprovedUsers();

        for(User user : unApprovedUsers)
            unApprovedUsersListView.getItems().add(getUserString(user));

        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));

    }

    private String getUserString(User user){

        return user.getUsername() + " : " +  user.getPassword() ;
    }

    @FXML private void approveButtonPressed(ActionEvent event) throws IOException, ClassNotFoundException {

        if(unApprovedUsersListView.getSelectionModel().getSelectedItems().isEmpty()){
            alert.setTitle("No selected user!");
            alert.setTitle("Please select at leas one user to approve!");

            unApprovedUsersListView.getScene().getRoot().setDisable(true);

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK)
                unApprovedUsersListView.getScene().getRoot().setDisable(false);
        }else{
            ArrayList<String> processedItems = new ArrayList<>();
            for(String item : unApprovedUsersListView.getSelectionModel().getSelectedItems())
                for (User user : unApprovedUsers)
                    if(item.equals(getUserString(user)))
                        if(ClientManagerLogicFacade.getInstance().approveUser(user, true))
                            processedItems.add(getUserString(user));

            unApprovedUsersListView.getItems().removeAll(processedItems);
        }
    }

    @FXML private void rejectButtonPressed(ActionEvent event) throws IOException, ClassNotFoundException {
        ArrayList<String> processedItems = new ArrayList<>();
        if(unApprovedUsersListView.getSelectionModel().getSelectedItems().isEmpty()){
            alert.setTitle("No selected user!");
            alert.setTitle("Please select at leas one user to approve!");
            unApprovedUsersListView.getScene().getRoot().setDisable(true);
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK)
                unApprovedUsersListView.getScene().getRoot().setDisable(false);
        }else{
            for(String item : unApprovedUsersListView.getSelectionModel().getSelectedItems())
                for (User user : unApprovedUsers)
                    if(item.equals(getUserString(user)))
                        if(ClientManagerLogicFacade.getInstance().approveUser(user, false)) {
                            unApprovedUsersListView.getItems().remove(getUserString(user));
                        }


        }
    }
}
