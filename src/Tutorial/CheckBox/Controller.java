package Tutorial.CheckBox;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ChoiceBox<String> choicebox;

    @FXML
    private Text text;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choicebox.getItems().add("ONE");
        choicebox.getItems().add("TWO");
        choicebox.getItems().add("THREE");
        choicebox.getItems().add("FOUR");

//        choicebox.setOnAction(actionEvent -> System.out.println(choicebox.getValue()));
        choicebox.setOnAction(actionEvent -> text.setText(choicebox.getValue()));

//        the bellow ex. is for trigger
        choicebox.setOnAction(actionEvent -> {
            text.setText(choicebox.getValue());
            System.out.println("A value was selected!");
        });
    }
}
