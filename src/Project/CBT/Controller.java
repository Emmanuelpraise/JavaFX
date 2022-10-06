package Project.CBT;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
//    char option;
    int que = 0;
    int score = 0;

    @FXML
    private ToggleButton A;

    @FXML
    private ToggleButton B;

    @FXML
    private ToggleButton C;

    @FXML
    private ToggleButton D;

    @FXML
    private Button btn;

    @FXML
    private ToggleGroup options;

    @FXML
    private Text question;

    @FXML
    private Text text;

    @FXML
    void Option_A(MouseEvent event) {

    }

    @FXML
    void Option_B(MouseEvent event) {

    }

    @FXML
    void Option_C(MouseEvent event) {

    }

    @FXML
    void Option_D(MouseEvent event) {

    }

    @FXML
    void next(MouseEvent event) {
        if (que == 1) {
            question.setText("1. Which of the following is not a programing Language?");
            A.setText("A. JAVA");
            B.setText("B. Python");
            C.setText("C. Boolean");
            D.setText("D. C++");
        }if (que == 2) {
            question.setText("2. What does SQL stand for: ");
            A.setText("A. Structured Query Language");
            B.setText("B. Sent Query Language");
            C.setText("C. Sterilized Question Language");
            D.setText("D. Squeezed Query Language");
        }if (que == 3) {
            question.setText("3. Who is the Father of Computer?");
            A.setText("A. Edie Murphy");
            B.setText("B. Dwayne Johnson");
            C.setText("C. Charles Murphy");
            D.setText("D. Charles Babbage");
        }if (que == 4) {
            question.setText("4. What was the former Name JAVA was Called Before it was renamed?");
            A.setText("A. Python");
            B.setText("B. Polygon");
            C.setText("C. Olk");
            D.setText("D. JAVA");
        }if (que == 5) {
            question.setText("5. HTTP stands for: ");
            A.setText("A. Hello Telephone Typewriter Printer");
            B.setText("B. Hyper Text Transfer Protocol");
            C.setText("C. Hat Telephone Typewriter Print");
            D.setText("D. Hen Television Type Postman");
        }if (que == 6) {
            question.setText("6. What does HTML Stand for?");
            A.setText("A. Hyper Text Markup Language");
            B.setText("B. Hyper Text Mark Language");
            C.setText("C. Hyper Text Makeup Language");
            D.setText("D. Hyper Text Markup Luggage");
        }
        que++;

        if (que == 2 && options.getSelectedToggle().equals(A)) {
            score++;
            text.setText(String.valueOf(score));
            text.setVisible(true);
        }if (que == 6 && options.getSelectedToggle().equals(A)) {
            score++;
            text.setText(String.valueOf(score));
            text.setVisible(true);
        }if (que == 5 && options.getSelectedToggle().equals(B)) {
            score++;
            text.setText(String.valueOf(score));
            text.setVisible(true);
        }if (que == 1 && options.getSelectedToggle().equals(C)) {
            score++;
            text.setText(String.valueOf(score));
            text.setVisible(true);
        }if (que == 4 && options.getSelectedToggle().equals(C)) {
            score++;
            text.setText(String.valueOf(score));
            text.setVisible(true);
        }if (que == 3 && options.getSelectedToggle().equals(D)) {
            score++;
            text.setText(String.valueOf(score));
            text.setVisible(true);
        }
    }
}