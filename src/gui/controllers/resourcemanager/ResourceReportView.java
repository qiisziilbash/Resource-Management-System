package gui.controllers.resourcemanager;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.Arrays;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;
import businesslogic.ClientResourceManagerLogicFacade;
import businesslogic.utility.Table;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class ResourceReportView extends Controller{

    @FXML private AnchorPane resourcesReportPane;
    @FXML private TableView<String[]> resultTable;

    public void animate(){
        animatePaneChange(resourcesReportPane, Direction.RIGHT);
    }

    @FXML private void getResourceReportPressed(ActionEvent event) throws IOException, ClassNotFoundException {
        showReport(ClientResourceManagerLogicFacade.getInstance().reportResources());
    }

    private void showReport(Table table) {
        //Table table = resourceReport.getTable();

        String[] headers = table.getHeaders();
        String[][] contents = table.getContents();



        ObservableList<String[]> data = FXCollections.observableArrayList();
        data.addAll(Arrays.asList(contents));



        for (int i = 0; i < headers.length; i++) {
            TableColumn tc = new TableColumn(headers[i]);
            final int colNo = i;
            tc.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(TableColumn.CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[colNo]));
                }
            });
            tc.setPrefWidth(resultTable.getPrefWidth()/headers.length);
            resultTable.getColumns().add(tc);
        }

        resultTable.setItems(data);

    }
}
