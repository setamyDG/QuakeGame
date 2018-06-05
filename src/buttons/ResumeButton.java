package buttons;

import javafx.scene.image.ImageView;
import components.Button;
import library.Library;


public class ResumeButton extends Button {
	public ResumeButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");
	}


	@Override
	public void onClicked() {
		ImageView imgView = Library.getImageView("res/images/quakechampions.jpg");
		m.children().addAll(imgView, m.chooseCharacterScreen.vBox(), m.nyxScreen.vBox(), m.visorScreen.vBox(), m.doomScreen.vBox(), m.anarkiScreen.vBox());
		transitions();

	}


	@Override
	public void style() {

	}


	@Override
	public void transitions() {
		m.mainMenuScreen.transition(0.5, m.mainMenuScreen.getPos().x() + offset).setOnFinished(event -> {
			m.children().remove(m.mainMenuScreen.vBox());
		});
		m.chooseCharacterScreen.transition(0.5, m.mainMenuScreen.getPos().x());
		m.nyxScreen.transition(0.5, m.mainMenuScreen.getPos().x());
		m.visorScreen.transition(0.5, m.mainMenuScreen.getPos().x() + 425);
		m.doomScreen.transition(0.5, m.mainMenuScreen.getPos().x() + 850);
		m.anarkiScreen.transition(0.5, m.mainMenuScreen.getPos().x() + 1275);
	}
}
