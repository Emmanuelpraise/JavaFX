package Tutorial.Add_5;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ListView<String> listOfNames;

    @FXML
    private TextField name;

    @FXML
    void addName(MouseEvent event) {
        listOfNames.getItems().add(name.getText());
    }

    @FXML
    void removeName(MouseEvent event) {
        int selectedId = listOfNames.getSelectionModel().getSelectedIndex();
        listOfNames.getItems().remove(selectedId);
    }

}
