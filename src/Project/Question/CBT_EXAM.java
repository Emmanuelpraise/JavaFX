/**
 *
 * @author emmanuelpraise36@gmail.com
 */

package Project.Question;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class CBT_EXAM extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));
        primaryStage.setTitle("COMPUTER BASED TEST");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();

             primaryStage.setOnCloseRequest(event -> {
                 event.consume();
                 exit(primaryStage);
         });
    }

      public void exit(Stage primaryStage){
         Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
         alert.setTitle("EXIT");
         alert.setHeaderText("You're about to EXIT!");
         alert.setContentText("Do you want exit?: ");
     if (alert.showAndWait().get() == ButtonType.OK) {
         System.out.println("You Successfully logged out!");
         primaryStage.close();
     }
     }

    public static void main(String[] args) {
        launch(args);
    }
}
