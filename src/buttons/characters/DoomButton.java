package buttons.characters;

import buttons.multiTransitions.CharacterClick;
import components.Button;
import engine.Menu;


public class DoomButton extends Button {
	public DoomButton(int x, int y, String text, int width, int height, String imagePath) {
		super(x, y, text, width, height, imagePath);
	}


	@Override
	public void onClicked() {
		m.doomMovie.play();
		m.children().addAll(m.movieScreen.vBox(), m.doomDescriptionScreen.vBox(), m.doomMovieScreen.vBox(), m.startGameScreen.vBox());
		Menu.characterId = 2;
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
