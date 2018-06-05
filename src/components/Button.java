package components;

import engine.Menu;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import library.Dc;
import library.Library;


public abstract class Button extends Window {
	public Color backgroundColor = Color.BLACK;
	public Color textColor = Color.WHITE;
	public double opacity = 0.6d;
	public double gaussianBlur = 4.5d;
	public Pos alignment = Pos.CENTER_LEFT;
	public double rotation = -0.5d;
	public boolean pressAnimation = true;
	public boolean championStyle = false;
	public Image image;
	public int fontSize = 25;
	public static int offset = 400;
	public int width, height;
	protected Menu m;
	private StackPane stackPane;
	private Rectangle background;
	private Text textComponent;
	private MediaPlayer buttonClick;
	private String text;


	public Button(int x, int y, String text, int width, int height, String imagePath) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.text = text;
		if (!imagePath.equals(""))
			image = Library.getImage(imagePath);
		m = Menu.menu;
		stackPane = new StackPane();

		position = new Dc(x, y);
		style();
		if (championStyle)
			championStyle();
		createButton();
		applyStyle();
	}


	private void createButton() {
		textComponent = new Text(text);
		background = new Rectangle(width, height);
		stackPane.getChildren().addAll(background, textComponent);
		stackPane.setOnMouseClicked(event -> {
			transitions();
			onClicked();
		});
		stackPane.setOnMouseEntered(event -> {
			if (championStyle)
				championMouseEnter();
			else mouseEnter();
			buttonClick();
		});
		stackPane.setOnMouseExited(event -> {
			if (championStyle)
				championMouseExit();
			else mouseExit();
		});
		if (pressAnimation)
			pressAnimation();
	}


	public void buttonClick() {
		buttonClick = Library.createSoundtrackMediaPlayer("res/sounds/buttonClick.mp3");
		buttonClick.setVolume(0.3);
		buttonClick.play();
	}


	public void championStyle() {
		opacity = 0.8;
		gaussianBlur = 0;
		alignment = Pos.BOTTOM_CENTER;
	}


	public void championMouseEnter() {
		background.setTranslateX(10);
		background.setFill(new ImagePattern(image));
		textComponent.setTranslateX(10);
		textComponent.setFill(Color.SILVER);
	}


	public void championMouseExit() {
		background.setTranslateX(0);
		background.setFill(new ImagePattern(image));
		textComponent.setTranslateX(0);
		textComponent.setFill(Color.WHITE);

	}


	public void mouseEnter() {
		background.setTranslateX(10);
		textComponent.setTranslateX(10);
		background.setFill(Color.WHITE);
		textComponent.setFill(Color.BLACK);
	}


	public void mouseExit() {
		background.setTranslateX(0);
		textComponent.setTranslateX(0);
		background.setFill(Color.BLACK);
		textComponent.setFill(Color.WHITE);
	}


	private void pressAnimation() {
		DropShadow drop = new DropShadow(50, Color.WHITE);
		drop.setInput(new Glow());
		stackPane.setOnMousePressed(event -> stackPane.setEffect(drop));
		stackPane.setOnMouseReleased(event -> stackPane.setEffect(null));
	}


	private void applyStyle() {
		textComponent.setFont(Font.font("Verdana", fontSize));
		textComponent.setFill(textColor);
		background.setOpacity(opacity);
		background.setEffect(new GaussianBlur(gaussianBlur));
		stackPane.setAlignment(alignment);
		stackPane.setRotate(rotation);

		if (image != null)
			background.setFill(new ImagePattern(image));
		else background.setFill(backgroundColor);
	}


	public StackPane stackPane() {
		return stackPane;
	}


	public abstract void onClicked();

	public abstract void style();

	public abstract void transitions();
}
