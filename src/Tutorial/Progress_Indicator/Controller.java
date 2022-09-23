package Tutorial.Progress_Indicator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Text loadingText;

    @FXML
    private ProgressIndicator progressIndicator;

    LoadingScreen loadingScreen;

    @FXML
    void restartProgress(ActionEvent event) {
        progressIndicator.setProgress(0);
        loadingText.setText("Loading...");
    }

    @FXML
    void startProgress(ActionEvent event) {
        Thread thread = new Thread(loadingScreen);
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadingScreen =  new LoadingScreen(progressIndicator, loadingText);
    }

    public class LoadingScreen implements Runnable{
        ProgressIndicator progressIndicator;
        Text loadingText;

        public  LoadingScreen(ProgressIndicator progressIndicator, Text loadingText){
            this.progressIndicator = progressIndicator;
            this.loadingText = loadingText;

        }
        public LoadingScreen(ProgressIndicator progressIndicator){
            this.progressIndicator = progressIndicator;
        }

        @Override
        public void run() {
            while(progressIndicator.getProgress() <= 1){
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        progressIndicator.setProgress(progressIndicator.getProgress() + 0.1);
                    }
                });
                synchronized (this){
                    try{
                        Thread.sleep(10000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            loadingText.setText("Done Loading!");
        }
    }
}
