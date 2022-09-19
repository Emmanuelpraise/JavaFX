package Tutorial.Radio_3;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ToggleGroup animal;

    @FXML
    private RadioButton cat;

    @FXML
    private RadioButton dog;

    @FXML
    private Text text;

    @FXML
    void getAnimal(MouseEvent event) {
        if (animal.getSelectedToggle().equals(cat)){
            text.setText("Cat");
        }else if (animal.getSelectedToggle().equals(dog)){
            text.setText("Dog");
        }
    }

}
