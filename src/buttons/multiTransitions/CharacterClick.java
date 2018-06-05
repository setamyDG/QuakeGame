package buttons.multiTransitions;

import components.Button;
import engine.Menu;


public class CharacterClick {
	public static void characterTransition(){
		Menu m = Menu.menu;
		m.chooseCharacterScreen.transition(0.25, m.chooseCharacterScreen.getPos().x() + Button.offset).setOnFinished(event -> {
			m.children().removeAll(m.chooseCharacterScreen.vBox(), m.nyxScreen.vBox(), m.visorScreen.vBox(), m.doomScreen.vBox(), m.anarkiScreen.vBox());
		});
		m.nyxScreen.transition(0.25, m.nyxScreen.getPos().x() + Button.offset);
		m.visorScreen.transition(0.25, m.visorScreen.getPos().x() + 850);
		m.doomScreen.transition(0.25, m.doomScreen.getPos().x() + 1700);
		m.anarkiScreen.transition(0.25, m.anarkiScreen.getPos().x() + 2550);
		m.movieScreen.transition(0.25, m.movieScreen.getPos().x() + 650);
		m.nyxDescriptionScreen.transition(0.25, m.nyxDescriptionScreen.getPos().x() + 650);
		m.visDescriptionScreen.transition(0.25, m.visDescriptionScreen.getPos().x() + 650);
		m.doomDescriptionScreen.transition(0.25, m.doomDescriptionScreen.getPos().x() + 650);
		m.anarDescriptionScreen.transition(0.25, m.anarDescriptionScreen.getPos().x() + 650);
		m.nyxMovieScreen.transition(0.25, m.nyxMovieScreen.getPos().x() - 850);
		m.visMovieScreen.transition(0.25, m.visMovieScreen.getPos().x() - 850);
		m.doomMovieScreen.transition(0.25, m.doomMovieScreen.getPos().x() - 850);
		m.anarkiMovieScreen.transition(0.25, m.anarkiMovieScreen.getPos().x() - 850);
		m.startGameScreen.transition(0.25, m.startGameScreen.getPos().x() + 650);
		m.mainMenuScreen.transition(0.5, m.movieScreen.getPos().x());
	}
}
