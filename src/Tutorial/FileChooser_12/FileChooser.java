package Tutorial.FileChooser_12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class FileChooser extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FileChooser.fxml"));
        primaryStage.setTitle("FileChooser");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        File file = new File("src\\sample\\text.txt");
        try{
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        launch(args);
    }
}
