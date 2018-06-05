package engine;

import buttons.*;
import buttons.characters.AnarkiButton;
import buttons.characters.DoomButton;
import buttons.characters.NyxButton;
import buttons.characters.VisorButton;
import components.Label;
import components.Movie;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import components.Button;
import library.Library;
import components.Window;


public class Menu extends Parent {
	public static Menu menu;
	public static int weaponStatus = 0;
	public static int characterId = 0;
	public Window mainMenuScreen, optionsScreen, creditsScreen, exitScreen, chooseCharacterScreen, nyxScreen, visorScreen, doomScreen, anarkiScreen, movieScreen, nyxDescriptionScreen, visDescriptionScreen, doomDescriptionScreen, anarDescriptionScreen, nyxMovieScreen, visMovieScreen, doomMovieScreen, anarkiMovieScreen, backGameScreen, startGameScreen, changeWeaponScreen, shotScreen;
	public Movie nyxMovie, visorMovie, doomMovie, anarkiMovie;
	public Button resumeButton, creditsButton, optionsButton, backOptionsButton, backCreditsButton, exitButton, yesExitButton, noExitButton, nyxButton, visorButton, doomButton, anarkiButton, backChooseCharacterButton, backMovieButton, backGameButton, startGameButton, changeWeaponButton, shotButton, soundButton, videoButton;
	public Label header, gameDescription, nyxDescription, visDescription, doomDescription, anarDescription;


	public Menu() {
		menu = this;
		initWindows();
		initMovies();
		initButtons();
		initLabels();
		MenuAndButtonsCorelations();
	}


	public ObservableList<Node> children() {
		return getChildren();
	}


	private void initWindows() {
		mainMenuScreen = new Window(150, 250, 10);
		optionsScreen = new Window(400, 250, 10);
		creditsScreen = new Window(150, 250, 10);
		exitScreen = new Window(150, 250, 10);
		chooseCharacterScreen = new Window(150, 250, 10);
		nyxScreen = new Window(150, 500, 10);
		visorScreen = new Window(150, 500, 10);
		doomScreen = new Window(150, 500, 10);
		anarkiScreen = new Window(150, 500, 10);
		movieScreen = new Window(-500, 250, 10);
		nyxDescriptionScreen = new Window(-500, 550, 10);
		visDescriptionScreen = new Window(-500, 550, 10);
		doomDescriptionScreen = new Window(-500, 550, 10);
		anarDescriptionScreen = new Window(-500, 550, 10);
		nyxMovieScreen = new Window(1920, 100, 10);
		visMovieScreen = new Window(1920, 100, 10);
		doomMovieScreen = new Window(1920, 100, 10);
		anarkiMovieScreen = new Window(1920, 100, 10);
		backGameScreen = new Window(1920, 900, 10);
		changeWeaponScreen = new Window(1920, 905, 10);
		startGameScreen = new Window(-500, 400, 10);
		shotScreen = new Window(1920, 910, 10);
	}


	private void initMovies() {
		nyxMovie = new Movie("res/video/nyx.mp4");
		visorMovie = new Movie("res/video/visor.mp4");
		doomMovie = new Movie("res/video/doom.mp4");
		anarkiMovie = new Movie("res/video/anarki.mp4");
	}


	private void initButtons() {
		resumeButton = new ResumeButton(0, 0, "START GAME", 450, 100);
		creditsButton = new CreditsButton(0, 0, "CREDITS", 450, 100);
		optionsButton = new OptionsButton(0, 0, "OPTIONS", 450, 100);
		exitButton = new ExitButton(0, 0, "EXIT", 450, 100);
		yesExitButton = new YesExitButton(0, 0, "YES", 450, 100);
		noExitButton = new NoExitButton(0, 0, "NO", 450, 100);

		nyxButton = new NyxButton(0, 0, "NYX", 325, 511, "res/images/nyx.jpg");
		visorButton = new VisorButton(0, 0, "VISOR", 325, 511, "res/images/visor.jpg");
		doomButton = new DoomButton(0, 0, "DOOM", 325, 511, "res/images/doom.jpg");
		anarkiButton = new AnarkiButton(0, 0, "ANARKI", 325, 511, "res/images/anarki.jpg");

		backOptionsButton = new BackOptionsButton(0, 0, "BACK", 450, 100);
		backCreditsButton = new BackCreditsButton(0, 0, "BACK", 450, 100);
		backChooseCharacterButton = new BackChooseCharacterButton(0, 0, "BACK", 450, 100);
		backMovieButton = new BackMovieButton(0, 0, "BACK", 450, 100);
		backGameButton = new BackGameButton(0, 0, "BACK", 450, 100);

		startGameButton = new StartGameButton(0, 0, "START GAME", 450, 100);
		changeWeaponButton = new ChangeWeaponButton(0, 0, "CHANGE WEAPON", 450, 100);
		shotButton = new ShotButton(0, 0, "SHOOT RL", 450, 100);
		soundButton = new SoundButton(0, 0, "SOUND", 450, 100);
		videoButton = new VideoButton(0, 0, "VIDEO", 450, 100);
	}


	public void initLabels() {
		header = new Label("							    SELECT YOUR CHAMPION", Color.SILVER, 30, 1900, 5);
		gameDescription = new Label("Daniel Gola 21 INF SP 2018, game in proggres\nthanks everyone for help\nenjoy", Color.SILVER, 20, 750, 750);

		nyxDescription = new Label("                                                    NYX\n\nAGES HAVE PASSED SINCE THE PEACEABLE MELEM LEARNED\nTO HARNESS THE FANTHOM ORB IMBUING THEMSELVES WITH\nA TRACE OF ITS BALEFUL ENERGY TO ENABLE GHOST WALK\n-A MOMENTARY PHASE SHIFT INTO ANTOHER DIMENSION. EVEN\nWHEN THEY WERE SIEGED BY HULKING, CHITINOUS MARAUDERS\nTHE GHOST WAKK SAVED THEM AS IT HAD MANY TIMES BEFORE\nTHEN, THE UNTHINKABLE: ONE OF THE ATTACKERS RETURNED AND\nBREACHED THE ORB. WITH NO ALTERNATIVE, THE MELEM BROKE\nTHEIR INVIOLABLE LAW ADN SENT THEIR MOST SKILLED ASSASSIN\nTO THE FANTHIM ORB, NOT KNOWING WHETHER SHE WOULD SURVIVE,\nLET ANYONEHOW SHE MIGHT RETURN.", Color.SILVER, 20, 500, 500);
		visDescription = new Label("                                                    VISOR\n\nTO PRODUCE THE PERFECT INFANTRY, MOSCOW'S GRU DEPLOYED\nCYBERNETICS, GENETICS AND EVEN CLONING. THE RESULT:TIRELESS\nOPERATIVES IMPERVIOUS TO PANIC OR PAIN, WITH 'MANAGEABLE'\nPSYCHOPATHY. BUT THEIR SENSES WERE DULLED - ESPECIALLY SIGHT\nTHE GRU TURNED TO A CRYPTIC AMERICAN SCIENTIST AND DOUBLE\nAGENT. JUST 3 OF 20 SUBJECTS RETURNED, EACH WITH A GRAFTED\nMASK, INEXPLICABLY NORMAL VISION, AND THE ABILITY TO SEE\nTHROUGH MATTER. ATTEMPTS TO REVERSE-ENGINEER THE MASK WERE\nFATAL, AND REVEALED ONLY A LAYER OF PUTREFIED BLOOD\nWITHIN THE MASK. DISPOSAL OF THE CASUALTIES REMAINS\nUNCONFIRMED.", Color.SILVER, 20, 500, 500);
		doomDescription = new Label("                                                   DOOM\n\nTHE UAC'S MOST REMARKABLE DISCOVERY WAS IN HELL'S\nKADINGIRSANCTUM. SURROUNDED BY NEARLY IMPASSABLE\nTERRAIN, THE TEAM DISCOVERED A SEALED BOMB - IT'S\nENTRANCE AND WALLS COVERED IN PROTECTIVE RUNES AND\nIMPRISONMENT INCANTATIONS. THE TOMB REVELAYED MANY\nARTIFACTS, INCLUDING THE PREATOR SUIT. MOST NOTABLE\nHOWEVER WAS AN ENORMOUS SARCOPHAGUS BOUND TO THE\nCENTER BEDROCK OF THE TOMB WITH THICK IRON BANDS\n- SEEMINGLY ANORCHED TO PREVANT ANYTHING FROM GETTING\nIN OR OUT. IT WAS BELIEVED THIS SARCOPHAGUS MOST HOLD\nA RARE OR POWERFUL DEMON, BUT WHEN LATER OPENED, IT\n REVEALED THE BODY OF A MAN. UNRELENTING; UNFORGIVING;\nDRIVEN BY A RAGE THAT CANNOT BE CANTAINED. THE DOOM SLAYER\nHAS BEEN TO HELL AND BROUGHT IT TO ITS KNEES.", Color.SILVER, 20, 500, 500);
		anarDescription = new Label("                                                   ANARKI\n\nANARKI'S REBELLION BEGAN WITH THE USUAL SELF-VANDALISM\nBUT THE CRAVED SOMETHING GREATER, AND FOUND IT IN\nTRANSHUMANISM. ADDICTION, INJURY, DISEASE... WHY TOLERATE\n FLESH IF HE COULD REPLACE IT? USING FAMILY RICHES,\nHE UNDERWENT INCREASINGLY EXTREME CYBERNETIC SURGERIES.\nAFTER A MICROELECTRODE PIERCED HIS PINEAL GLAND\nANARKI PERCEIVED A SURREAL, ALIEN REALITY BREAKTHROUGH\nHE EAGERLY SOUGHT MORE PROCEDURES, IS IGNORING THE ISOMANIA.\nEACH STRENGTHENED HIS PERCEPTION OF THE HIDDEN REALM. BUT ONLY\nONCE HE MET A GIRL WHO SAW IT TOO, WES HE SURE HE\nCOULD REACH IT.", Color.SILVER, 20, 500, 500);

	}


	private void MenuAndButtonsCorelations() {
		mainMenuScreen.vBox().getChildren().addAll(resumeButton.stackPane(), optionsButton.stackPane(), creditsButton.stackPane(), exitButton.stackPane());
		optionsScreen.vBox().getChildren().addAll(backOptionsButton.stackPane(), soundButton.stackPane(), videoButton.stackPane());
		creditsScreen.vBox().getChildren().addAll(backCreditsButton.stackPane(), gameDescription);
		exitScreen.vBox().getChildren().addAll(yesExitButton.stackPane(), noExitButton.stackPane());
		chooseCharacterScreen.vBox().getChildren().addAll(backChooseCharacterButton.stackPane(), header);
		nyxScreen.vBox().getChildren().addAll(nyxButton.stackPane());
		visorScreen.vBox().getChildren().addAll(visorButton.stackPane());
		doomScreen.vBox().getChildren().addAll(doomButton.stackPane());
		anarkiScreen.vBox().getChildren().addAll(anarkiButton.stackPane());
		movieScreen.vBox().getChildren().addAll(backMovieButton.stackPane());
		nyxDescriptionScreen.vBox().getChildren().addAll(nyxDescription);
		visDescriptionScreen.vBox().getChildren().addAll(visDescription);
		doomDescriptionScreen.vBox().getChildren().addAll(doomDescription);
		anarDescriptionScreen.vBox().getChildren().addAll(anarDescription);
		nyxMovieScreen.vBox().getChildren().addAll(nyxMovie.getMediaView());
		visMovieScreen.vBox().getChildren().addAll(visorMovie.getMediaView());
		doomMovieScreen.vBox().getChildren().addAll(doomMovie.getMediaView());
		anarkiMovieScreen.vBox().getChildren().addAll(anarkiMovie.getMediaView());
		backGameScreen.vBox().getChildren().addAll(backGameButton.stackPane());
		changeWeaponScreen.vBox().getChildren().addAll(changeWeaponButton.stackPane());
		shotScreen.vBox().getChildren().addAll(shotButton.stackPane());
		startGameScreen.vBox().getChildren().addAll(startGameButton.stackPane());
		Library.addWindows(mainMenuScreen);
	}
}
