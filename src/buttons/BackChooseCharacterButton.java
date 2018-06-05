package buttons;

import javafx.scene.image.ImageView;
import components.Button;
import library.Library;


public class BackChooseCharacterButton extends Button {
	public BackChooseCharacterButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");

	}


	@Override
	public void onClicked() {

	}


	@Override
	public void style() {

	}


	@Override
	public void transitions() {
		m.chooseCharacterScreen.transition(0.25, m.chooseCharacterScreen.getPos().x() + offset).setOnFinished(event -> {
			ImageView imgView = Library.getImageView("res/images/qc11.jpg");
			m.children().removeAll(m.chooseCharacterScreen.vBox(), m.nyxScreen.vBox(), m.visorScreen.vBox(), m.doomScreen.vBox(), m.anarkiScreen.vBox());
			m.children().addAll(imgView, m.mainMenuScreen.vBox());
		});
		m.nyxScreen.transition(0.25, m.nyxScreen.getPos().x() + offset);
		m.visorScreen.transition(0.25, m.visorScreen.getPos().x() + 850);
		m.doomScreen.transition(0.25, m.doomScreen.getPos().x() + 1250);
		m.anarkiScreen.transition(0.25, m.anarkiScreen.getPos().x() + 1650);
		m.mainMenuScreen.transition(0.5, m.nyxScreen.getPos().x());
	}
}
