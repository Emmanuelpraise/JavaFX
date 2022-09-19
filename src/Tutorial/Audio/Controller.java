package Tutorial.Audio;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import javax.print.attribute.standard.Media;
import java.io.File;

//MediaPlayer mediaplayer;

public class Controller {

    @FXML
    void play(MouseEvent event) {
        String fileName = "FLOROCKA  TWALE.mp3";
        playHitSound(fileName);
    }

    private void playHitSound(String fileName){
        String path = getClass().getResource(fileName).getPath();
        System.out.println(path);
//        Media media = new Media(new File(path).toURI().toString());
//        mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.setCycleCount(MediaPlayer.1);
//        mediaPlayer.play();
    }

}
