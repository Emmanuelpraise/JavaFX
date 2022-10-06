package Tutorial.Toggle_20;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text text;

    @FXML
    private ToggleButton ToggleButton_1;

    @FXML
    private ToggleGroup btn;

    @FXML
    private ToggleButton ToggleButton_2;

    @FXML
    void toggle(ActionEvent event) {
        if(event.getSource() == ToggleButton_1){
            text.setText("ToggleButton_1");
        }

        if(event.getSource() == ToggleButton_2){
            text.setText("ToggleButton_2");
        }
    }

}
