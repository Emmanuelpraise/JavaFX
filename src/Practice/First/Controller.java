package Practice.First;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller{

    @FXML
    private TextField newWord;

    @FXML
    private TextField oldWord;

    @FXML
    private TextArea textarea;

    @FXML
    void change(KeyEvent event) {

    }

    @FXML
    void replace(MouseEvent event) {
        String result = "";

        String oldText = oldWord.getText();
        String newText = newWord.getText();
        String textareaText = textarea.getText();
        if (!textareaText.equals("") && textareaText.contains(oldText) ) {
            String [] words = textarea.getText().split(" ");
            for (String word : words) {

                if (word.equals(oldText)){
                    word = newText;
                }
                result += " " + word;
            }
            textarea.setText(result.trim());
        }
        else {
            textarea.setText("THE SENTENCE IS EITHER EMPTY OR IT DOES NOT CONTAIN THE OLD WORD");
        }
        newWord.clear();
        oldWord.clear();
    }

}
