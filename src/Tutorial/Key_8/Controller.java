package Tutorial.Key_8;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text text;

    @FXML
    void show(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            System.out.println("Enter Pressed");
            text.setVisible(false);
        }
        if(event.getCode()== KeyCode.SPACE){
            System.out.println("Space Pressed");
            text.setVisible(true);
        }
    }

}
