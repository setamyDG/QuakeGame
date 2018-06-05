package buttons.characters;

import buttons.multiTransitions.CharacterClick;
import components.Button;
import engine.Menu;


public class VisorButton extends Button {
	public VisorButton(int x, int y, String text, int width, int height, String imagePath) {
		super(x, y, text, width, height, imagePath);
	}


	@Override
	public void onClicked() {
		m.visorMovie.play();
		m.children().addAll(m.movieScreen.vBox(), m.visDescriptionScreen.vBox(), m.visMovieScreen.vBox(), m.startGameScreen.vBox());
		Menu.characterId = 1;
	}


	@Override
	public void style() {
		championStyle = true;
	}


	@Override
	public void transitions() {
		CharacterClick.characterTransition();
	}
}
