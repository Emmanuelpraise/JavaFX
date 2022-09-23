package Tutorial.Alert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Controller {

    @FXML
    void showDialog(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alert!");
        alert.setContentText("This is an Alert");
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isEmpty()){
            System.out.println("Alert closed!");
        }else if(result.get() == ButtonType.OK){
            System.out.println("OK!");
        }else if(result.get() == ButtonType.CANCEL){
            System.out.println("Never!");
        }
    }
}
