package Tutorial.ProgressBar_18;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Text text;

    double points =0;

    @FXML
    void minus(MouseEvent event) {
        points -= 0.1;
        text.setText(Double.toString(points));
        progressBar.setProgress(points);
    }

    @FXML
    void plus(MouseEvent event) {
        points += 0.1;
        text.setText(Double.toString(Math.round(points*100.0)/100.0));
        progressBar.setProgress(points);
    }

}
