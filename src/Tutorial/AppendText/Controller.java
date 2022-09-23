package Tutorial.AppendText;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private TextField textField;

    @FXML
    void keyInput(KeyEvent event) {
        if(event.getCode() == KeyCode.A){
            textField.appendText("A");
        } else if (event.getCode() == KeyCode.B){
            textField.appendText("B");
        }else if (event.getCode() == KeyCode.C){
            textField.appendText("C");
        }else if (event.getCode() == KeyCode.D){
            textField.appendText("D");
        }else if (event.getCode() == KeyCode.E){
            textField.appendText("E");
        }else if (event.getCode() == KeyCode.F){
            textField.appendText("F");
        }else if (event.getCode() == KeyCode.G){
            textField.appendText("G");
        }else if (event.getCode() == KeyCode.H){
            textField.appendText("H");
        }else if (event.getCode() == KeyCode.I){
            textField.appendText("I");
        }else if (event.getCode() == KeyCode.J){
            textField.appendText("J");
        }else if (event.getCode() == KeyCode.K){
            textField.appendText("K");
        }else if (event.getCode() == KeyCode.L){
            textField.appendText("L");
        }else if (event.getCode() == KeyCode.M){
            textField.appendText("M");
        }else if (event.getCode() == KeyCode.N){
            textField.appendText("N");
        }else if (event.getCode() == KeyCode.O){
            textField.appendText("O");
        }else if (event.getCode() == KeyCode.P){
            textField.appendText("P");
        }else if (event.getCode() == KeyCode.Q){
            textField.appendText("Q");
        }else if (event.getCode() == KeyCode.R){
            textField.appendText("R");
        }else if (event.getCode() == KeyCode.S){
            textField.appendText("S");
        }else if (event.getCode() == KeyCode.T){
            textField.appendText("T");
        }else if (event.getCode() == KeyCode.U){
            textField.appendText("U");
        }else if (event.getCode() == KeyCode.V){
            textField.appendText("V");
        }else if (event.getCode() == KeyCode.W){
            textField.appendText("W");
        }else if (event.getCode() == KeyCode.X){
            textField.appendText("X");
        }else if (event.getCode() == KeyCode.Y){
            textField.appendText("Y");
        }else if (event.getCode() == KeyCode.Z){
            textField.appendText("Z");
        }else if (event.getCode() == KeyCode.SPACE){
            textField.appendText(" ");
        }
//        else if (event.getCode() == KeyCode.BACK_SPACE){
//            textField.appendText("B ");
//        }
    }

}
