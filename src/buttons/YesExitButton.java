package buttons;

import javafx.application.Platform;
import components.Button;


public class YesExitButton extends Button {
	public YesExitButton(int x, int y, String text, int width, int height) {
		super(x, y, text, width, height, "");
	}


	@Override
	public void onClicked() {
		Platform.exit();
		System.exit(0);
	}


	@Override
	public void style() {

	}

	@Override
	public void transitions() {

	}
}
