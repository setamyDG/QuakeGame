package engine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import library.Library;


public class Launcher extends Application {

    public static double screenWidth;
    public static double screenHeight;

    private static Pane root;
    private static Stage stage;
    private static Scene scene;

    private static Menu mainMenu;
    private MediaPlayer soundtrack;



    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        Library.getScreenResolution();
        mainMenu = new Menu();
        initializeSoundtrack();
        createView();
        mainMenu.setVisible(true);
    }


    private void initializeSoundtrack() {
        soundtrack = Library.createSoundtrackMediaPlayer("res/sounds/music.mp3");
        soundtrack.play();
    }


    private void createView() {
        root = new Pane();
        root.setPrefSize(screenWidth, screenHeight);
        ImageView backgroundImage = backgroundImageSettings();
        primaryStageSettings(backgroundImage);
    }


    private ImageView backgroundImageSettings() {
        ImageView backgroundImage = Library.getImageView("res/images/qc11.jpg");
        backgroundImage.setFitWidth(screenWidth);
        backgroundImage.setFitHeight(screenHeight);
        return backgroundImage;
    }


    private void primaryStageSettings(ImageView backgroundImage) {
        root.getChildren().addAll(backgroundImage, mainMenu);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(true);
        stage.setTitle("QUAKE CHAMPIONS 2018 - MADE BY DANIEL MYSKHA GOLA");
    }
}
