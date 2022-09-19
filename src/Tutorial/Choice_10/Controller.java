package Tutorial.Choice_10;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    void choice(MouseEvent event) {
        String country = choiceBox.getSelectionModel().getSelectedItem();
        System.out.println(country);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll("Nigeria","China", "United States", "United Nations", "Algeria", "Lebanon", "France", "Paris");
    }
}
