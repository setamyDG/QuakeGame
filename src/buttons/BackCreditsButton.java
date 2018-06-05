package buttons;

import components.Button;


public class BackCreditsButton extends Button {
	public BackCreditsButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");
	}


	@Override
	public void onClicked() {
		m.children().add(m.mainMenuScreen.vBox());
	}


	@Override
	public void style() {

	}


	@Override
	public void transitions() {
		m.creditsScreen.transition(0.25, m.creditsScreen.getPos().x() + 400).setOnFinished(event -> {
			m.children().remove(m.creditsScreen.vBox());
		});
		m.mainMenuScreen.transition(0.5, m.creditsScreen.getPos().x());
	}
}
