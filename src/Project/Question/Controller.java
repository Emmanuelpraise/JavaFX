/**
 *
 * @author emmanuelpraise36@gmail.com
 */

package Project.Question;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    int score = 0;
    int index = -1;


    @FXML
    private Button btn;

    @FXML
    private ToggleButton A;

    @FXML
    private ToggleButton B;

    @FXML
    private ToggleButton C;

    @FXML
    private ToggleButton D;

    @FXML
    private ToggleGroup q1;

    @FXML
    private Text scoreRec;

    @FXML
    private Text questions;

    @FXML
    private Button next;

    @FXML
    private Button previous;

    @FXML
    void next(MouseEvent event) {
        index++;
        ArrayList <String> Question = new ArrayList<String>();
        Question.add("1. Which of the following is not a programing Language?");
        Question.add("2. What does SQL stand for: ");
        Question.add("3. Who is the Father of Computer?");
        Question.add("4. What was the former Name JAVA was Called Before it was renamed?");
        Question.add("5. HTTP stands for: ");
        Question.add("6. What does HTML Stand for?");
        questions.setText(Question.get(index));

        ArrayList <String> Option_A = new ArrayList<String>();
        Option_A.add("A. JAVA");
        Option_A.add("A. Sterilized Question Language");
        Option_A.add("A. Edie Murphy");
        Option_A.add("A. Python");
        Option_A.add("A. Hello Telephone Typewriter Printer");
        Option_A.add("A. Hyper Text Markup Language");
        A.setText(Option_A.get(index));

        ArrayList <String> Option_B = new ArrayList<String>();
        Option_B.add("B. Python");
        Option_B.add("B. Structured Query Language");
        Option_B.add("B. Dwayne Johnson");
        Option_B.add("B. Polygon");
        Option_B.add("B. Hyper Text Transfer Protocol");
        Option_B.add("B. Hyper Text Mark Language");
        B.setText(Option_B.get(index));

        ArrayList <String> Option_C = new ArrayList<String>();
        Option_C.add("C. Football");
        Option_C.add("C. Sent Query Language");
        Option_C.add("C. Charles Murphy");
        Option_C.add("C. Oak");
        Option_C.add("C. Hat Telephone Typewriter Print");
        Option_C.add("C. Hyper Text Makeup Language");
        C.setText(Option_C.get(index));

        ArrayList <String> Option_D = new ArrayList<String>();
        Option_D.add("D. C++");
        Option_D.add("D. Squeezed Query Language");
        Option_D.add("D. Charles Babbage");
        Option_D.add("D. Macron");
        Option_D.add("D. Hen Television Type Postman");
        Option_D.add("D. Hyper Text Markup Luggage");
        D.setText(Option_D.get(index));

//        System.out.println(Question.get(index));


//        if(q1.getSelectedToggle().equals(C) && index == 0){
//            score++;
//            scoreRec.setVisible(false);
//            scoreRec.setText("Score: "+String.valueOf(score));
//        }
//
//        if(q1.getSelectedToggle().equals(B) && index == 1){
//            score++;
//            scoreRec.setVisible(false);
//            scoreRec.setText("Score: "+String.valueOf(score));
//        }
//        if(q1.getSelectedToggle().equals(D) && index == 2){
//            score++;
//            scoreRec.setVisible(false);
//            scoreRec.setText("Score: "+String.valueOf(score));
//        }if(q1.getSelectedToggle().equals(C) && index == 3){
//            score++;
//            scoreRec.setVisible(false);
//            scoreRec.setText("Score: "+String.valueOf(score));
//        }if(q1.getSelectedToggle().equals(B) && index == 4){
//            score++;
//            scoreRec.setVisible(false);
//            scoreRec.setText("Score: "+String.valueOf(score));
//        }
//        if(q1.getSelectedToggle().equals(A) && index == 5){
//            score++;
//            scoreRec.setVisible(true);
//            scoreRec.setText("Score: "+String.valueOf(score));
//        }

//        A.setText(Option_A.get(index));

        if(index == 5){
            next.setDisable(true);
            previous.setDisable(false);
        }
    }

    @FXML
    void previous(MouseEvent event) {
        index--;
        ArrayList <String> Question = new ArrayList<String>();
        Question.add("1. Which of the following is not a programing Language?");
        Question.add("2. What does SQL stand for: ");
        Question.add("3. Who is the Father of Computer?");
        Question.add("4. What was the former Name JAVA was Called Before it was renamed?");
        Question.add("5. HTTP stands for: ");
        Question.add("6. What does HTML Stand for?");
        questions.setText(Question.get(index));

        ArrayList <String> Option_A = new ArrayList<String>();
        Option_A.add("A. JAVA");
        Option_A.add("A. Sterilized Question Language");
        Option_A.add("A. Edie Murphy");
        Option_A.add("A. Python");
        Option_A.add("A. Hello Telephone Typewriter Printer");
        Option_A.add("A. Hyper Text Markup Language");
        A.setText(Option_A.get(index));

        ArrayList <String> Option_B = new ArrayList<String>();
        Option_B.add("B. Python");
        Option_B.add("B. Structured Query Language");
        Option_B.add("B. Dwayne Johnson");
        Option_B.add("B. Polygon");
        Option_B.add("B. Hyper Text Transfer Protocol");
        Option_B.add("B. Hyper Text Mark Language");
        B.setText(Option_B.get(index));

        ArrayList <String> Option_C = new ArrayList<String>();
        Option_C.add("C. Football");
        Option_C.add("C. Sent Query Language");
        Option_C.add("C. Charles Murphy");
        Option_C.add("C. Oak");
        Option_C.add("C. Hat Telephone Typewriter Print");
        Option_C.add("C. Hyper Text Makeup Language");
        C.setText(Option_C.get(index));

        ArrayList <String> Option_D = new ArrayList<String>();
        Option_D.add("D. C++");
        Option_D.add("D. Squeezed Query Language");
        Option_D.add("D. Charles Babbage");
        Option_D.add("D. Macron");
        Option_D.add("D. Hen Television Type Postman");
        Option_D.add("D. Hyper Text Markup Luggage");
        D.setText(Option_D.get(index));

        if(index == 0){
            previous.setDisable(true);
            next.setDisable(false);
        }
    }

    @FXML
    void submit(MouseEvent event) throws IOException{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
             alert.setTitle("Submit");
             alert.setHeaderText("You're about to Submit!");
             alert.setContentText("Are you sure you want to Submit?: ");
         if (alert.showAndWait().get() == ButtonType.OK) {
             System.out.println("You Successfully Submitted!");
             scoreRec.setVisible(true);
             scoreRec.setText("Score: "+String.valueOf(score));

             Stage stage = (Stage) btn.getScene().getWindow();
             Parent root = FXMLLoader.load(getClass().getResource("End.fxml"));
             stage.setTitle("COMPUTER BASED TEST");
             stage.setScene(new Scene(root));
         }

    }

    @FXML
    void Start(MouseEvent event) throws IOException {
        Stage stage = (Stage) btn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Rules.fxml"));
        stage.setTitle("COMPUTER BASED TEST");
        stage.setScene(new Scene(root));
    }


    @FXML
    private Button Cont;

    @FXML
    private Button exit;

    @FXML
    void exit(MouseEvent event) throws IOException {
        Stage stage = (Stage) exit.getScene().getWindow();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText("You're about to Exit!");
        alert.setContentText("Do you want to exit?: ");
        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You Successfully logged out!");
            stage.close();
        }
    }

    @FXML
    void nxt(MouseEvent event) throws Exception {
        Stage stage = (Stage) Cont.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("CBT_EXAM.fxml"));
        stage.setTitle("COMPUTER BASED TEST");
        stage.setScene(new Scene(root));
    }

    @FXML
    private Button retry;

    @FXML
    void retry(MouseEvent event) throws IOException{
        Stage stage = (Stage) retry.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));
        stage.setTitle("COMPUTER BASED TEST");
        stage.setScene(new Scene(root));
    }
}
