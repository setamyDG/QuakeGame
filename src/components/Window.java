package components;

import javafx.animation.TranslateTransition;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import library.Dc;


public class Window {
	protected int spacing;
	protected Dc position;
	public VBox vBox;


	public Window(int x, int y, int spacing) {
		position = new Dc(x, y);
		new Label("", Color.RED, 25, (int) position.x(), (int) position.y());
		this.spacing = spacing;
		vBox = new VBox(spacing);
		applyPositionChange();
	}


	public Window(int x, int y) {
		position = new Dc(x, y);
		vBox = new VBox();
	}


	public VBox vBox() {
		return vBox;
	}


	private void applyPositionChange() {
		vBox.setTranslateX(position.x());
		vBox.setTranslateY(position.y());
	}


	public Dc getPos()
	{
		return position;
	}


	public void transition(double duration, double x, double y) {
		TranslateTransition tt = new TranslateTransition(Duration.seconds(duration), vBox);
		if (x != -9999d)
			tt.setToX(x);
		tt.setToY(y);
		tt.play();
	}


	public TranslateTransition transition(double duration, double x) {
		TranslateTransition tt = new TranslateTransition(Duration.seconds(duration), vBox);
		tt.setToX(x);
		tt.play();
		return tt;
	}
}
