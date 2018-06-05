package buttons;

import components.Button;


public class OptionsButton extends Button {
	public OptionsButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");
	}


	@Override
	public void onClicked() {
		m.children().add(m.optionsScreen.vBox());
	}


	@Override
	public void style() {

	}


	@Override
	public void transitions() {
		m.mainMenuScreen.transition(0.25, m.mainMenuScreen.getPos().x() - offset).setOnFinished(event -> {
			m.children().remove(m.mainMenuScreen.vBox());
		});
		m.optionsScreen.transition(0.5, m.mainMenuScreen.getPos().x());
	}
}
