package BroCode.Stage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button btn;

    @FXML
    private Button btn2;

    @FXML
    void getScene1(ActionEvent event) throws Exception{
        Stage stage = (Stage) btn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Stage2.fxml"));
        stage.setTitle("Stage 2");
        stage.setScene(new Scene(root));
    }

    @FXML
    void getScene2(ActionEvent event) throws Exception{
        Stage stage = (Stage) btn2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Stage1.fxml"));
        stage.setTitle("Stage 1");
        stage.setScene(new Scene(root));
    }

}
