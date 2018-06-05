package buttons.characters;

import buttons.multiTransitions.CharacterClick;
import engine.Menu;
import components.Button;


public class NyxButton extends Button {
	public NyxButton(int x, int y, String text, int width, int height, String imagePath) {
		super(x, y, text, width, height, imagePath);
	}


	@Override
	public void onClicked() {
		m.nyxMovie.play();
		m.children().addAll(m.movieScreen.vBox(), m.nyxDescriptionScreen.vBox(), m.nyxMovieScreen.vBox(), m.startGameScreen.vBox());
		Menu.characterId = 0;
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
