package buttons.characters;

import buttons.multiTransitions.CharacterClick;
import components.Button;
import engine.Menu;


public class AnarkiButton extends Button {
	public AnarkiButton(int x, int y, String text, int width, int height, String imagePath) {
		super(x, y, text, width, height, imagePath);
	}


	@Override
	public void onClicked() {
		m.anarkiMovie.play();
		m.children().addAll(m.movieScreen.vBox(), m.anarDescriptionScreen.vBox(), m.anarkiMovieScreen.vBox(), m.startGameScreen.vBox());
		Menu.characterId = 3;
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
