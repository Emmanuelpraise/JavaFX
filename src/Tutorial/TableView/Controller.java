package Tutorial.TableView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableColumn<User, String> dob;

    @FXML
    private TableColumn<User, String> email;

    @FXML
    private TableColumn<User, String> firstname;

    @FXML
    private TableColumn<User, String> lastname;

    @FXML
    private TableView<User> table;

    ObservableList<User> list = FXCollections.observableArrayList(
            new User("Praise","Ayelabola","28-12-2004","emmanuelpraise36@gmail.com"),
            new User("Emmanuel","Adeniyi","18-10-2006","adeniyiemmanuel@gmail.com"),
            new User("Taofeek","Olabode","06-09-2002","olabodetaofeek@gmail.com"),
            new User("Olabisi","Onabanjo","15-02-2005","olabisionabanjo@gmail.com"),
            new User("Precious","Fashola","22-11-2004","preciousfashola@gmail.com"),
            new User("Tolulope","Onifade","23-07-2008","onifadetolulope@gmail.com"),
            new User("Faith","Salisu","31-01-2005","faithsalisu@gmail.com"),
            new User("Emmanuel","Aba","16-08-2006","emmanuelaba@gmail.com"),
            new User("Asekun","Tomisin","13-12-2004","asekuntosin@gmail.com"),
            new User("Hassan","Mudashiru","16-07-2005","hassanmudashiru@gmail.com")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstname.setCellValueFactory(new PropertyValueFactory<User, String>("firstname"));
        lastname.setCellValueFactory(new PropertyValueFactory<User, String>("lastname"));
        dob.setCellValueFactory(new PropertyValueFactory<User, String>("dateOfBirth"));
        email.setCellValueFactory(new PropertyValueFactory<User, String>("email"));

        table.setItems(list);
    }
}
