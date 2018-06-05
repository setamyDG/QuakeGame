package buttons;

import engine.Main;
import engine.Menu;
import javafx.scene.media.MediaView;
import components.Button;
import library.Library;


public class ShotButton extends Button{
	public ShotButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");
	}


	@Override
	public void onClicked() {
		int decisionId = 100 * Menu.characterId + Menu.weaponStatus;
		MediaView view = Library.getMediaView("res/NyxHUD/NyxLGfilm.mp4");
		view.setFitWidth(Main.screenWidth);
		view.setFitHeight(Main.screenHeight);
		switch (decisionId){
			case 0:
				view = Library.getMediaView("res/NyxHUD/NyxRLfilm.mp4");
				break;
			case 1:
				view = Library.getMediaView("res/NyxHUD/NyxRGfilm.mp4");
				break;
			case 2:
				view = Library.getMediaView("res/NyxHUD/NyxLGfilm.mp4");
				break;
			case 100:
				view = Library.getMediaView("res/visorHUD/VisorRLfilm.mp4");
				break;
			case 101:
				view = Library.getMediaView("res/visorHUD/VisorRGfilm.mp4");
				break;
			case 102:
				view = Library.getMediaView("res/visorHUD/VisorLGfilm.mp4");
				break;
			case 200:
				view = Library.getMediaView("res/doomHUD/DoomRLfilm.mp4");
				break;
			case 201:
				view = Library.getMediaView("res/doomHUD/DoomRGfilm.mp4");
				break;
			case 202:
				view = Library.getMediaView("res/doomHUD/DoomLGfilm.mp4");
				break;
			case 300:
				view = Library.getMediaView("res/anarkiHUD/AnarkiRLfilm.mp4");
				break;
			case 301:
				view = Library.getMediaView("res/anarkiHUD/AnarkiRGfilm.mp4");
				break;
			case 302:
				view = Library.getMediaView("res/anarkiHUD/AnarkiLGfilm.mp4");
				break;
		}

		view.setFitWidth(Main.screenWidth);
		view.setFitHeight(Main.screenHeight);
		view.getMediaPlayer().play();
		Library.removeWindows(m.backGameScreen, m.changeWeaponScreen, m.shotScreen);
		m.children().add(view);
		Library.addWindows(m.backGameScreen, m.changeWeaponScreen, m.shotScreen);
	}



	@Override
	public void style() {

	}


	@Override
	public void transitions() {
	}
}
