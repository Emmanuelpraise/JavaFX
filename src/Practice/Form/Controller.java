package Practice.Form;

//import com.gluonhq.charm.glisten.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField firstname;

    @FXML
    private TextField surname;

    @FXML
    private Text text;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;

    @FXML
    private ToggleGroup gender;

    @FXML
    void getDetail(KeyEvent event) {

        if(event.getCode()== KeyCode.ENTER){
            text.setText("Hello "+surname.getText()+" "+firstname.getText()+"!");
        }
        if (gender.getSelectedToggle().equals(male)){
            text.setText("You are Male");
        }else if (gender.getSelectedToggle().equals(female)){
            text.setText("You are Female");
        }

    }

    @FXML
    void getDetails(MouseEvent event) {
    	text.setText("Hello "+surname.getText()+" "+firstname.getText()+"!");

        if (gender.getSelectedToggle().equals(male)){
            text.setText("You are Male");
        }else if (gender.getSelectedToggle().equals(female)){
            text.setText("You are Female");
        }
    }

}
