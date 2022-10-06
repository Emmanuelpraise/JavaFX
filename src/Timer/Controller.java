package Timer;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    int i,j,k = 0;
    Timeline timeline;
    Timeline timeline2;

    @FXML
    private Text text;

    @FXML
    void start(MouseEvent event) {
        timeline.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        text.setText(String.valueOf(i+"hr "+j+"min "+k+"sec"));

        timeline = new Timeline(new KeyFrame(Duration.hours(1), e ->{
            i++;
            text.setText(String.valueOf(i+"hr "+j+"min "+k+"sec"));
        }));
//        timeline2 = new Timeline(new KeyFrame(Duration.minutes(30), e ->{
//            j++;
//            text.setText(String.valueOf(i+"hr "+j+"min "+k+"sec"));
//        }));
//        timeline = new Timeline(new KeyFrame(Duration.seconds(59), e ->{
//            k++;
//            text.setText(String.valueOf(i+"hr "+j+"min "+k+"sec"));
//        }));

        timeline.setCycleCount(2);
        timeline2.setCycleCount(30);

    }
}
