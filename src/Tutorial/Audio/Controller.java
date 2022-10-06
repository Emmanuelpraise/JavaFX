package Tutorial.Audio;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;

import javax.print.attribute.standard.Media;
import java.io.File;

public class Controller {

    MediaPlayer mediaPlayer;

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
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
    }

}
