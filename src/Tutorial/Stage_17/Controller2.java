package Tutorial.Stage_17;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller2 {

    @FXML
    private Button button;

    @FXML
    void getBack(MouseEvent event) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("New.fxml"));
        stage.setTitle("Stage 1");
        stage.setScene(new Scene(root));
    }

    // public void logout(ActionEvent event){
    //     Alert alert = new Alert(AlertType.CONFIRMATION)
    //     alert.setTitle("Logout");
    //     alert.setHeaderText("You're about to Logout!");
    //     alert.setContentText("Do you want to save before exiting?: ");
    // if (alert.showAndWait().get() == ButtonType.OK) {
    //     stage = (Stage) anchorPane.getScene().getWindow();
    //     System.out.println("You Successfully logged out!");
    //     stage.close();
    // }
    // }
        
}
