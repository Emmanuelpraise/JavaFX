package Tutorial.FileChooser_12;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Control implements Initializable {

    FileChooser fileChooser = new FileChooser();

    @FXML
    private TextArea textarea;

    @FXML
    void getText(MouseEvent event) {
        File file = fileChooser.showOpenDialog(new Stage());
    }

    @FXML
    void openFile(MouseEvent event) {
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        Scanner scanner = null;
        try{
            scanner = new Scanner(selectedFile);
            while(scanner.hasNextLine()){
                textarea.appendText(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            assert scanner != null;
            scanner.close();
        }
    }

    @FXML
    void save(MouseEvent event) {
        File file = fileChooser.showSaveDialog(new Stage());
        if(file != null){
            saveSystem(file, textarea.getText());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File("C:\\Users\\UNIABK-104\\JavaFX\\src\\sample"));
    }

    public void saveSystem(File file, String content){
        try{
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(content);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
