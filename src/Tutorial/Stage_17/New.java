package Tutorial.Stage_17;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class New extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("New.fxml"));
        primaryStage.setTitle("Stage 1");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    //     primaryStage.setOnCloseRequest(event -> {
    //         event.consume();
    //         logout(primaryStage);
    // });
    }

    //  public void logout(Stage primaryStage){
    //     Alert alert = new Alert(AlertType.CONFIRMATION)
    //     alert.setTitle("Logout");
    //     alert.setHeaderText("You're about to Logout!");
    //     alert.setContentText("Do you want to save before exiting?: ");
    // if (alert.showAndWait().get() == ButtonType.OK) {
    //     System.out.println("You Successfully logged out!");
    //     stage.close();
    // }
    // }


    public static void main(String[] args) {
        launch(args);
    }
}
