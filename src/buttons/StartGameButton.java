package buttons;

import engine.Menu;
import javafx.scene.image.ImageView;
import components.Button;
import library.Library;


public class StartGameButton extends Button {
	public StartGameButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");
	}


	@Override
	public void onClicked() {
		m.children().clear();

		m.nyxMovie.stop();
		m.visorMovie.stop();
		m.doomMovie.stop();
		m.anarkiMovie.stop();

		ImageView imgView = null;
		switch (Menu.characterId) {
			case 0:
				imgView = Library.getImageView("res/nyxHUD/NyxRL.png");
				break;
			case 1:
				imgView = Library.getImageView("res/visorHUD/VisorRL.png");
				break;
			case 2:
				imgView = Library.getImageView("res/doomHUD/DoomRL.png");
				break;
			case 3:
				imgView = Library.getImageView("res/anarkiHUD/AnarkiRL.png");
				break;
		}
		m.children().addAll(imgView, m.backGameScreen.vBox(), m.changeWeaponScreen.vBox(), m.shotScreen.vBox());
	}


	@Override
	public void style() {

	}


	@Override
	public void transitions() {
		m.movieScreen.transition(0.25, m.movieScreen.getPos().x() + 650).setOnFinished(event -> {
			m.children().remove(m.movieScreen.vBox());
		});
		m.backGameScreen.transition(0.5, 1425);
		m.changeWeaponScreen.transition(0.5, 925);
		m.shotScreen.transition(0.5, 425);
	}
}
