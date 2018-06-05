package buttons;

import components.Button;


public class BackMovieButton extends Button {
	public BackMovieButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");
	}


	@Override
	public void onClicked() {
		m.children().addAll(m.chooseCharacterScreen.vBox(), m.nyxScreen.vBox(), m.visorScreen.vBox(), m.doomScreen.vBox(), m.anarkiScreen.vBox());
		m.nyxMovie.stop();
		m.visorMovie.stop();
		m.doomMovie.stop();
		m.anarkiMovie.stop();
	}


	@Override
	public void style() {

	}


	@Override
	public void transitions() {
		m.chooseCharacterScreen.transition(0.25, m.chooseCharacterScreen.getPos().x()).setOnFinished(event -> {
			m.children().removeAll(m.movieScreen.vBox(), m.nyxDescriptionScreen.vBox(), m.visDescriptionScreen.vBox(), m.doomDescriptionScreen.vBox(), m.anarDescriptionScreen.vBox(), m.nyxMovieScreen.vBox(), m.visMovieScreen.vBox(), m.doomMovieScreen.vBox(), m.anarkiMovieScreen.vBox(), m.startGameScreen.vBox());
		});
		m.nyxScreen.transition(0.5, m.nyxScreen.getPos().x());
		m.visorScreen.transition(0.5, m.visorScreen.getPos().x() + 425);
		m.doomScreen.transition(0.5, m.doomScreen.getPos().x() + 850);
		m.anarkiScreen.transition(0.5, m.anarkiScreen.getPos().x() + 1275);
		m.movieScreen.transition(0.5, m.movieScreen.getPos().x() - 650);
		m.nyxDescriptionScreen.transition(0.5, m.nyxDescriptionScreen.getPos().x() - 650);
		m.visDescriptionScreen.transition(0.5, m.visDescriptionScreen.getPos().x() - 650);
		m.doomDescriptionScreen.transition(0.5, m.doomDescriptionScreen.getPos().x() - 650);
		m.anarDescriptionScreen.transition(0.5, m.anarDescriptionScreen.getPos().x() - 650);
		m.nyxMovieScreen.transition(0.5, m.nyxMovieScreen.getPos().x() + 850);
		m.visMovieScreen.transition(0.5, m.visMovieScreen.getPos().x() + 850);
		m.doomMovieScreen.transition(0.5, m.doomMovieScreen.getPos().x() + 850);
		m.anarkiMovieScreen.transition(0.5, m.anarkiMovieScreen.getPos().x() + 850);
		m.startGameScreen.transition(0.5, m.startGameScreen.getPos().x() - 650);
		m.mainMenuScreen.transition(0.5, m.nyxScreen.getPos().x());
	}
}
