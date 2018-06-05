package library;

import components.Window;
import engine.Main;
import engine.Menu;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;

import java.io.File;


public class Library {
	public static void getScreenResolution() {
		Main.screenWidth = Screen.getPrimary().getBounds().getWidth();
		Main.screenHeight = Screen.getPrimary().getBounds().getHeight();
	}


	public static MediaPlayer createSoundtrackMediaPlayer(String path) {
		Media soundtrackFile = new Media(new File(path).toURI().toString());
		return new MediaPlayer(soundtrackFile);
	}


	public static ImageView getImageView(String path) {
		File f = new File(path);
		Image img = new Image(f.toURI().toString());
		return new ImageView(img);
	}


	public static Image getImage(String path) {
		File f = new File(path);
		return new Image(f.toURI().toString());
	}



	public static MediaView getMediaView(String path) {
		Media NyxRLfilm1 = new Media(new File(path).toURI().toString());
		MediaPlayer mediaPlayerNRL = new MediaPlayer(NyxRLfilm1);
		return new MediaView(mediaPlayerNRL);
	}


	public static void addWindows(Window... windows) {
		for (int i = 0; i < windows.length; i++) {
			VBox vBox = windows[i].vBox;
			Menu.menu.children().add(vBox);
		}
	}


	public static void removeWindows(Window... windows) {
		for (int i = 0; i < windows.length; i++) {
			VBox vBox = windows[i].vBox;
			Menu.menu.children().remove(vBox);
		}
	}


	public static void changeWeapon(Node... nodes) {
		Menu.weaponStatus++;
		if (Menu.weaponStatus >= 3)
			Menu.weaponStatus = 0;
		Menu.menu.children().clear();
		for (Node node : nodes)
			Menu.menu.children().add(node);
	}
}
