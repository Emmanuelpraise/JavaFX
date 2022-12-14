package Tutorial.SearchBar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class Controller implements Initializable {

    ArrayList<String> words = new ArrayList<>(
            Arrays.asList("test","dog", "Human", "Days of our life", "The best day",
            "Friends", "Animal", "Human", "Humans", "Bear", "Life", "This is some text",
            "words", "222", "Bird", "Dog", "A few words", "Subscribe!", "Software Engineering Student",
            "You got this!!", "Super Human", "Super", "Like")
    );

    @FXML
    private ListView<String> listView;

    @FXML
    private TextField searchBar;

    @FXML
    void search(ActionEvent event) {
        listView.getItems().clear();
        listView.getItems().addAll(searchList(searchBar.getText(),words));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(words);
    }

    private List<String> searchList(String searchWords, List<String> listOfStrings){
        List<String> searchWordsArray = Arrays.asList(searchWords.trim().split(" "));

        return listOfStrings.stream().filter(input ->{
            return searchWordsArray.stream().allMatch(word ->
                    input.toLowerCase().contains(word.toLowerCase()));
        }).collect(Collectors.toList());
    }
}
