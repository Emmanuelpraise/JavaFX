package Tutorial.Color_11;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Button button;

    @FXML
    private ColorPicker color;

    @FXML
    void pick(MouseEvent event) {
        Color col = color.getValue();
        button.setTextFill(col);
    }

}
