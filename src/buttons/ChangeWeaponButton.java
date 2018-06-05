package buttons;

import engine.Menu;
import javafx.scene.image.ImageView;
import components.Button;
import library.Library;


public class ChangeWeaponButton extends Button {
	public ChangeWeaponButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");
	}


	@Override
	public void onClicked() {
		int decisionId = 100 * Menu.characterId + Menu.weaponStatus;
		ImageView imgView = null;
		switch (decisionId) {
			case 0:
				imgView = Library.getImageView("res/nyxHUD/NyxRG.png");
				break;
			case 1:
				imgView = Library.getImageView("res/nyxHUD/NyxLG.png");
				break;
			case 2:
				imgView = Library.getImageView("res/nyxHUD/NyxRL.png");
				break;
			case 100:
				imgView = Library.getImageView("res/visorHUD/VisorRG.png");
				break;
			case 101:
				imgView = Library.getImageView("res/visorHUD/VisorLG.png");
				break;
			case 102:
				imgView = Library.getImageView("res/visorHUD/VisorRL.png");
				break;
			case 200:
				imgView = Library.getImageView("res/doomHUD/DoomRG.png");
				break;
			case 201:
				imgView = Library.getImageView("res/doomHUD/DoomLG.png");
				break;
			case 202:
				imgView = Library.getImageView("res/doomHUD/DoomRL.png");
				break;
			case 300:
				imgView = Library.getImageView("res/AnarkiHUD/AnarkiRG.png");
				break;
			case 301:
				imgView = Library.getImageView("res/AnarkiHUD/AnarkiLG.png");
				break;
			case 302:
				imgView = Library.getImageView("res/AnarkiHUD/AnarkiRL.png");
				break;
		}
		Library.changeWeapon(imgView, m.backGameScreen.vBox(), m.changeWeaponScreen.vBox(), m.shotScreen.vBox());
	}


	@Override
	public void style() {

	}


	@Override
	public void transitions() {
	}
}
