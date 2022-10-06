package Tutorial.Timeline_22;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    int i = 0;

    @FXML
    private Text text;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        text.setText(String.valueOf(i));

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e ->{
            i++;
            text.setText(String.valueOf(i));
        }));

        timeline.setCycleCount(60);
        timeline.play();
    }
}
