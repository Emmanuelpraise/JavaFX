package Tutorial.Spinner_14;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Spinner<Integer> number;

    SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,1);

    @FXML
    private Text text;

    @FXML
    void getNumber(MouseEvent event) {
        int num = number.getValue();
        text.setText(String.valueOf(num));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        number.setValueFactory(svf);
    }
}
