package components;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;


public class Movie {
	private MediaPlayer mediaPlayer;
	private MediaView mediaView;

	public Movie(String path) {
		Media media = new Media(new File(path).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView = new MediaView(mediaPlayer);
		setSize(960, 840);
	}


	private void setSize(int width, int height) {
		mediaView.setFitHeight(width);
		mediaView.setFitWidth(height);
	}


	public void play() {
		mediaPlayer.play();
	}


	public void stop() {
		mediaPlayer.stop();
	}


	public MediaView getMediaView() {
		return mediaView;
	}
}
