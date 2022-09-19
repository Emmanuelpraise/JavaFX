package Practice.Confirm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

public class Controller{

    @FXML
    private Button btn2;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    private PasswordField password;

    @FXML
    private Text text;

    @FXML
    private Text text2;


    @FXML
    void check(MouseEvent event) {

         if(password.getText().equals("")&&confirmPassword.getText().equals("")){
             text2.setVisible(true);
             text.setVisible(false);
             text2.setText("Error! An Input Is Missing");
             text2.setFill(Paint.valueOf("RED"));
             btn2.setDisable(true);
         }

        if (!password.getText().equals(confirmPassword.getText())||password.getText().equals("")&&confirmPassword.getText().equals("")){
            text.setVisible(true);
            text.setText("Error! Passwords Don\'t Match");
            text.setFill(Paint.valueOf("RED"));
            btn2.setDisable(true);
        }

        if (password.getText().length()>=6 && password.getText().equals(confirmPassword.getText())){
            text.setVisible(true);
            text2.setVisible(false);
            text.setText("Nice! Passwords Matched");
            text.setFill(Paint.valueOf("GREEN"));
            System.out.println(password.getText());
            System.out.println(confirmPassword.getText());
            btn2.setDisable(false);
        }else{
            text2.setVisible(true);
            text2.setText("Error! Passwords Must Contain Atleast 6 Characters");
            text2.setFill(Paint.valueOf("RED"));
        }
    }

    @FXML
    void next(MouseEvent event) {

    }
}
