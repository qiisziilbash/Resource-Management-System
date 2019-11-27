package gui.controllers.accounting;

import gui.Direction;
import gui.controllers.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import businesslogic.accounting.job.JobType;
import businesslogic.utility.Tree;


/**
 * Created by qizilbash on 7/4/2016.
 */
public class ViewProfileView extends Controller{

    @FXML private AnchorPane profileViewPane;

    @FXML private Label usernameLabel;
    @FXML private Label emailLabel;

    @FXML private TreeView<String> jobsInfoTreeView;

    public void animate(){
        animatePaneChange(profileViewPane, Direction.RIGHT);
    }

    public void specialInit(){
        usernameLabel.setText(user.getUsername());
        emailLabel.setText(user.getEmail());

        Tree<String> jobsInfo = user.getJobInfo();

        TreeItem<String> rootItem = new TreeItem<>("Jobs");

        for(Tree<String> child : jobsInfo.getChildren()){
            TreeItem<String> item = new TreeItem<>(child.getData());

            if(child.getData().equals(JobType.Programming.getTitle())){
                for(Tree<String> i : child.getChildren()){
                    item.getChildren().add(new TreeItem<>(i.getData()));
                }
            }
            rootItem.getChildren().add(item);
        }

        jobsInfoTreeView.setRoot(rootItem);

    }


}
