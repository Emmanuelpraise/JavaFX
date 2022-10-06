package Tutorial.Transition_21;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    TranslateTransition transition;

    @FXML
    private Circle circle;

    @FXML
    void translate(ActionEvent event) {
        transition.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        transition = new TranslateTransition();
        transition.setNode(circle);
        transition.setByX(500);
        transition.setByY(300);
        transition.setDuration(Duration.seconds(3));
        transition.setAutoReverse(true);
        transition.setCycleCount(10);
//        transition.play();
    }
}
