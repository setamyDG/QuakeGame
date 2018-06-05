package buttons;

import components.Button;


public class NoExitButton extends Button {
	public NoExitButton(int x, int y, String text, int width, int height) {
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
		m.exitScreen.transition(0.25, m.exitScreen.getPos().x() - 400).setOnFinished(event -> {
			m.children().remove(m.exitScreen.vBox());
		});
		m.mainMenuScreen.transition(0.5, m.exitScreen.getPos().x());
	}
}
