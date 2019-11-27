package gui.controllers;

import gui.Direction;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * Created by qizilbash on 7/4/2016.
 */
public class AboutView {

    private double animationTime = 1500;

    @FXML private AnchorPane helpPane;
    private AnchorPane onTheTopPane;

    public void animate() {
        onTheTopPane = new AnchorPane();
        animatePaneChange(helpPane,Direction.DOWN);
    }

    private void animatePaneChange(AnchorPane anchorPane, Direction direction){
        Timeline timeline = new Timeline();

        if(direction == Direction.TOP)
        {
            anchorPane.setLayoutX(0);
            anchorPane.setLayoutY(-1000);

            timeline.getKeyFrames().add(
                    new KeyFrame(Duration.millis(animationTime),
                            new KeyValue(anchorPane.layoutYProperty(),
                                    0,
                                    Interpolator.EASE_BOTH)));
            if(!(onTheTopPane == anchorPane))
                timeline.getKeyFrames().add(
                        new KeyFrame(Duration.millis(animationTime),
                                new KeyValue(onTheTopPane.layoutYProperty(),
                                        1000,
                                        Interpolator.EASE_BOTH)));
        } else if(direction == Direction.RIGHT){
            anchorPane.setLayoutX(1000);
            anchorPane.setLayoutY(0);

            timeline.getKeyFrames().add(
                    new KeyFrame(Duration.millis(animationTime),
                            new KeyValue(anchorPane.layoutXProperty(),
                                    0,
                                    Interpolator.EASE_BOTH)));
            if(!(onTheTopPane == anchorPane))
                timeline.getKeyFrames().add(
                        new KeyFrame(Duration.millis(animationTime),
                                new KeyValue(onTheTopPane.layoutYProperty(),
                                        1000,
                                        Interpolator.EASE_BOTH)));
        } else if(direction == Direction.DOWN){
            anchorPane.setLayoutX(0);
            anchorPane.setLayoutY(1000);

            timeline.getKeyFrames().add(
                    new KeyFrame(Duration.millis(animationTime),
                            new KeyValue(anchorPane.layoutYProperty(),
                                    0,
                                    Interpolator.EASE_BOTH)));
            if(!(onTheTopPane == anchorPane))
                timeline.getKeyFrames().add(
                        new KeyFrame(Duration.millis(animationTime),
                                new KeyValue(onTheTopPane.layoutYProperty(),
                                        -1000,
                                        Interpolator.EASE_BOTH)));
        } else {
            anchorPane.setLayoutX(-1000);
            anchorPane.setLayoutY(0);

            timeline.getKeyFrames().add(
                    new KeyFrame(Duration.millis(animationTime),
                            new KeyValue(anchorPane.layoutXProperty(),
                                    0,
                                    Interpolator.EASE_BOTH)));
            if(!(onTheTopPane == anchorPane))
                timeline.getKeyFrames().add(
                        new KeyFrame(Duration.millis(animationTime),
                                new KeyValue(onTheTopPane.layoutXProperty(),
                                        1000,
                                        Interpolator.EASE_BOTH)));
        }

        timeline.setCycleCount(1);
        timeline.setAutoReverse(false);
        timeline.play();

        timeline.setOnFinished(event -> onTheTopPane = anchorPane);
    }
}
