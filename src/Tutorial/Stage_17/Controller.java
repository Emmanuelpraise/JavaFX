package Tutorial.Stage_17;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button button;

    @FXML
    void getNext(MouseEvent event)  throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("New2.fxml"));
        stage.setTitle("Stage 2");
        stage.setScene(new Scene(root));
    }

}
