package Tutorial.Date_9;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class Controller {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Text text;

    @FXML
    void get(KeyEvent event) {

    }

    @FXML
    void getDate(MouseEvent event) {
        LocalDate time = datePicker.getValue();
        System.out.println(time);
//        text.setText(String.valueOf(datePicker.getValue())); same as below
        text.setText(String.valueOf(time));
    }

}
