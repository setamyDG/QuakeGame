package buttons;

import components.Button;


public class BackOptionsButton extends Button {
	public BackOptionsButton(int x, int y, String text, int width, int height) {
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
		m.optionsScreen.transition(0.25, m.optionsScreen.getPos().x() + offset).setOnFinished(event -> {
			m.children().remove(m.optionsScreen.vBox());
		});
		m.mainMenuScreen.transition(0.5, m.mainMenuScreen.getPos().x());
	}
}
