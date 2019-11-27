package gui.controllers.resourcemanager;

import gui.Direction;
import gui.controllers.Controller;

import java.io.IOException;
import java.util.Arrays;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import businesslogic.ClientResourceManagerLogicFacade;
import businesslogic.distribution.resource.InformationResource;
import businesslogic.utility.Table;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class ResourceRequirementsReportView extends Controller {

    @FXML private AnchorPane reqPane1;
    @FXML private AnchorPane reqPane2;
    @FXML private AnchorPane reqPane3;

    @FXML private Label startLabel;
    @FXML private Label endLabel;
    @FXML private Rectangle sampleRect;

    @FXML private Label reqLabel1;
    @FXML private Label reqLabel2;
    @FXML private Label reqLabel3;



    @FXML private AnchorPane resourceRequirementReportPane;
    @FXML private AnchorPane diagramPane;
    @FXML private ComboBox<String> informationResourceCombo;
    @FXML private TableView resultTable;
    private InformationResource[] informationResources;
    private InformationResource selectedInformationResource;

    private Alert alert;


    private Table table;

    public void animate(){
        animatePaneChange(resourceRequirementReportPane, Direction.RIGHT);
    }
    public void specialInit() throws IOException, ClassNotFoundException {
        informationResources = ClientResourceManagerLogicFacade.getInstance().getInformationResources(user.getID());
        for(InformationResource informationResource : informationResources)
            informationResourceCombo.getItems().add(getInfoResourceString(informationResource));
        alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("../../resources/erp.png").toString()));
    }

    @FXML private void getRequirementReportPressed(ActionEvent event) throws IOException, ClassNotFoundException {
        if(!informationResourceCombo.getSelectionModel().getSelectedItem().isEmpty()){
            for(InformationResource informationResource : informationResources)
                if(getInfoResourceString(informationResource).equals(informationResourceCombo.getSelectionModel().getSelectedItem()))
                    selectedInformationResource = informationResource;

            table =ClientResourceManagerLogicFacade.getInstance().reportResourceRequirements(selectedInformationResource.getID());
            showReport();
        }else {
            resultTable.getScene().getRoot().setDisable(true);
            alert.setTitle("Empty selection!");
            alert.setContentText("Please select an information resource");
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

    private String getInfoResourceString(InformationResource informationResource){
        return informationResource.getID() + informationResource.getName();
    }

    private int getdays(String date){
        String[] parts = date.split("/");
        return Integer.parseInt(parts[2]) *365 + Integer.parseInt(parts[1])*30 + Integer.parseInt(parts[0]);
    }

    private Rectangle copyRect(Rectangle rectangle,double x, double w){
        Rectangle rect = new Rectangle();
        rect.setLayoutX(x+200);
        rect.setLayoutY(20);
        rect.setWidth(w);
        rect.setHeight(rectangle.getHeight());
        rect.setEffect(rectangle.getEffect());
        rect.setArcWidth(rectangle.getArcWidth());
        rect.setArcHeight(rectangle.getArcHeight());
        return rect;
    }

    private void plot() {

        String[][] contents = table.getContents();
        /*
        String[][] contents = new String[2][5];
        contents[0][0] = "PC";
        contents[0][1] = "5";
        contents[0][2] = "22/06/12";
        contents[0][3] = "28/06/12";
        contents[0][4] = "Essential";

        contents[1][0] = "Printer";
        contents[1][1] = "5";
        contents[1][2] = "2/07/12";
        contents[1][3] = "9/07/12";
        contents[1][4] = "Ordinary";
*/

        if(contents.length <3)
            reqPane3.setVisible(false);
        if(contents.length<2)
            reqPane2.setVisible(false);
        if (contents.length<1)
            reqPane1.setVisible(false);

        int reqNum = contents.length;
        if (reqNum > 3 )
            reqNum = 3;



            int[][] lengths = new int[reqNum][2];

            for (int i = 0; i < reqNum; i++) {
                lengths[i][0] = getdays(contents[i][2]);
                lengths[i][1] = getdays(contents[i][3]);

            }

            double min = Integer.MAX_VALUE;

            double max = Integer.MIN_VALUE;

            for (int i = 0; i < lengths.length; i++) {
                if (lengths[i][1] > max) {
                    max = lengths[i][1];
                    endLabel.setText(contents[i][3]);
                }
                if (lengths[i][0] < min) {
                    min = lengths[i][0];
                    startLabel.setText(contents[i][2]);
                }
            }


            max -= min;


            for (int i = 0; i < lengths.length; i++) {
                lengths[i][0] -= min;
                lengths[i][1] -= min;

                double x = (lengths[i][0] / max) * 500.0;
                double y = ((lengths[i][1] - lengths[i][0]) / max) * 500.0;




                Rectangle rectangle = copyRect(sampleRect, x, y);

                Text text = new Text(contents[i][0]);
                text.setStyle(startLabel.getStyle());
                text.setFill(Color.WHITE);
                text.setFont(startLabel.getFont());
                text.setLayoutX(200 + x + y/2 - text.getLayoutBounds().getWidth()/2);
                text.setLayoutY(35);

                int daysCount = (lengths[i][1] - lengths[i][0]);
                Text days = new Text(String.valueOf(daysCount));
                days.setStyle(startLabel.getStyle());
                days.setFont(startLabel.getFont());
                days.setFill(startLabel.getTextFill());
                days.setEffect(startLabel.getEffect());
                days.setLayoutX(200 + x + y/2 - days.getLayoutBounds().getWidth()/2);
                days.setLayoutY(15);



                switch (i){
                    case 0:
                        reqPane1.getChildren().addAll(rectangle, text, days);
                        reqLabel1.setText("Requirement 1");
                        break;
                    case 1:
                        reqPane2.getChildren().addAll(rectangle, text, days);
                        reqLabel2.setText("Requirement 2");
                        break;
                    case 2:
                        reqPane3.getChildren().addAll(rectangle, text, days);
                        reqLabel3.setText("Requirement 3");
                        break;
                }


            }


    }

    public void backFromDiagram(Event event) {
        animatePaneChange(resourceRequirementReportPane, Direction.LEFT);
    }

    public void viewDigram(ActionEvent event) {
        animatePaneChange(diagramPane, Direction.RIGHT);
        plot();
    }
}
