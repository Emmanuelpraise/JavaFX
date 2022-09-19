package Tutorial.MultiDate_13;

import javafx.fxml.FXML;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.util.Callback;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<LocalDate> selectedDates = FXCollections.observableArrayList();

    @FXML
    private DatePicker datePicker;

    @FXML
    private Text text;

    @FXML
    void getDate(MouseEvent event) {
        for (LocalDate date : selectedDates){
            System.out.println(date);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        datePicker.setOnAction(event -> {
            if(selectedDates.size() > 4){
                selectedDates.clear();
            }
            selectedDates.add(datePicker.getValue());
        } );

        datePicker.setDayCellFactory(new Callback<DatePicker, DateCell>() {
            @Override
            public DateCell call(DatePicker param) {
                return new DateCell(){
                    @Override
                    public void updateItem(LocalDate item, boolean empty){
                        super.updateItem(item, empty);
                        boolean alreadySelected = selectedDates.contains(item);
                        setDisable(alreadySelected);
                        setStyle(alreadySelected ? "-fx-background-color: #C06C84;" : "");
                    }
                };
            }
        });
    }
}
