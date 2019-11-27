package gui.controllers.resourcemanager;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import businesslogic.ClientResourceManagerLogicFacade;
import businesslogic.distribution.resource.Resource;
import businesslogic.distribution.resource.ResourceType;
import businesslogic.utility.Table;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class FlowReportview extends Controller {


    @FXML private AnchorPane resourceFlowReportPane;
    @FXML private AnchorPane diagramPane;
    @FXML private DatePicker fromDate;
    @FXML private DatePicker toDate;

    @FXML private ComboBox<String> resourceNameCombo;
    @FXML private ComboBox<String> resourceTypeCombo;
    @FXML private ComboBox<String> resourcesCombo;

    @FXML private TableView resultTable;

    @FXML private Table table;

    private Resource[] resources;
    private Resource selectedResource;

    private Alert alert;

    @FXML private Line sampleLine;
    @FXML private Rectangle sampleRect;
    @FXML private Label endLabel;
    @FXML private Label startLabel;





    public void animate(){
        animatePaneChange(resourceFlowReportPane, Direction.RIGHT);
    }
    public void specialInit(){


        for (ResourceType type : ResourceType.values())
            resourceTypeCombo.getItems().add(type.getTitle());



        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));
    }

    private void fillTheResourceNames() throws IOException, ClassNotFoundException {
        resourceNameCombo.getItems().clear();
        String[] names = ClientResourceManagerLogicFacade.getInstance().getResourceNames(user.getID(), resourceTypeCombo.getSelectionModel().getSelectedItem());
        for(String name : names)
            resourceNameCombo.getItems().add(name);
    }

    public void getFlowReportPressed(ActionEvent event) throws IOException, ClassNotFoundException {

        if(resourcesCombo.getSelectionModel().getSelectedItem() != null && resourceTypeCombo.getSelectionModel().getSelectedItem() != null){
            for(Resource resource : resources)
                if(resourcesCombo.getSelectionModel().getSelectedItem().equals(getResourceString(resource)))
                    selectedResource = resource;

            Date sDate = new Date(fromDate.getValue().toEpochDay());
            Date eDate = new Date(toDate.getValue().toEpochDay());
            businesslogic.utility.Date startDate = new businesslogic.utility.Date(sDate);
            businesslogic.utility.Date endDate = new businesslogic.utility.Date(eDate);

            table = ClientResourceManagerLogicFacade.getInstance().reportFlowResourceAllocations(selectedResource,
                    startDate,endDate);
            showReport();
        }else {
            resultTable.getScene().getRoot().setDisable(true);
            alert.setTitle("Empty selection!");
            alert.setContentText("Please select a resource type and/or resource name.");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                resultTable.getScene().getRoot().setDisable(false);
                return;
            }
        }

    }

    private void showReport() {

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


    public void viewDiagramPressed(ActionEvent event) {
        animatePaneChange(diagramPane, Direction.RIGHT);
        plot();
    }

    private void plot() {

        sampleRect.setVisible(false);

       String[][] contents = table.getContents();

        /*
        String[][] contents = new String[2][3];
        contents[0][0] = "info1";
        contents[0][1] = "22/06/12";
        contents[0][2] = "26/06/12";

        contents[1][0] = "info2";
        contents[1][1] = "29/06/12";
        contents[1][2] = "1/07/12";

*/
        int[][] lengths = new int[contents.length][2];





        for(int i = 0; i<contents.length;i++){
            lengths[i][0] = getdays(contents[i][1]);
            lengths[i][1] = getdays(contents[i][2]);
        }

        double min = Integer.MAX_VALUE;

        double max = Integer.MIN_VALUE;

        for(int i = 0; i< lengths.length;i++){
            if(lengths[i][1] > max){
                max = lengths[i][1];
                endLabel.setText(contents[i][2]);
            }
            if(lengths[i][0] < min){
                min = lengths[i][0];
                startLabel.setText(contents[i][1]);
            }
        }




        max -= min;


        for(int i = 0 ; i < lengths.length; i++){
            lengths[i][0] -= min;
            lengths[i][1] -= min;


            double x = (lengths[i][0] / max) * 650.0;
            double y = ((lengths[i][1]-lengths[i][0])/max) * 650.0;



            Rectangle rectangle = copyRect(sampleRect, x,y );

            Text text = new Text(contents[i][0]);




            text.setStyle(startLabel.getStyle());

            text.setFill(Color.WHITE);
            text.setFont(startLabel.getFont());
            text.setLayoutX(50 + x + y / 2 - text.getLayoutBounds().getWidth()/2);
            text.setLayoutY(250 + 5 );

            int daysCount = (lengths[i][1]-lengths[i][0]);

            Text days = new Text(String.valueOf(daysCount));
            days.setStyle(startLabel.getStyle());
            days.setFont(startLabel.getFont());
            days.setLayoutY(230);
            days.setFill(startLabel.getTextFill());
            days.setLayoutX(50 + x + y / 2 - days.getLayoutBounds().getWidth()/2);
            days.setEffect(startLabel.getEffect());

            diagramPane.getChildren().addAll(rectangle,text,days);

        }


    }

    private int getdays(String date){
        String[] parts = date.split("/");
        return Integer.parseInt(parts[2]) *365 + Integer.parseInt(parts[1])*30 + Integer.parseInt(parts[0]);
    }

    private Rectangle copyRect(Rectangle rectangle,double x, double w){
        Rectangle rect = new Rectangle();
        rect.setLayoutX(x+50);
        rect.setLayoutY(250-rectangle.getHeight()/2);
        rect.setWidth(w);
        rect.setHeight(rectangle.getHeight());
        rect.setEffect(rectangle.getEffect());
        rect.setArcWidth(rectangle.getArcWidth());
        rect.setArcHeight(rectangle.getArcHeight());
        return rect;
    }

    public void backFromDiagram(Event event) {
        animatePaneChange(resourceFlowReportPane, Direction.LEFT);
    }


    public void resourceNameComboChanged(ActionEvent event) throws IOException, ClassNotFoundException {
        resourcesCombo.getItems().clear();
        resources = ClientResourceManagerLogicFacade.getInstance().getResources(user.getID(),
                resourceTypeCombo.getSelectionModel().getSelectedItem(),resourceNameCombo.getSelectionModel().getSelectedItem());
        for(Resource resource : resources)
            resourcesCombo.getItems().add(getResourceString(resource));
    }



    public void resourceTypeComboChanged(ActionEvent event) throws IOException, ClassNotFoundException {
        fillTheResourceNames();
    }

    private String getResourceString(Resource resource){
        return resource.getUniqueIdentifier() + " : " + resource.getName();
    }
}
