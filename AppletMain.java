//package EnvironmentGame;

//the main file

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

public class AppletMain extends JApplet {

	private static final int frameWidth = 720;
	private static final int frameHeight = 520;

	// where game will be played
	private Game newGame;

	private AppletMain myApplet;

	//private QuizScreen newQuiz;

	private HomeScreen newHome;

	//private SummaryScreen newSummary;

	private PurposeScreen newPurpose;
	
	private Q1Screen newQ1;
	
	private Q2Screen newQ2;
	
	private Q3Screen newQ3;
	
	private Q4Screen newQ4;
	
	private Q5Screen newQ5;
	
	private OceanQ1Screen newOQ1;
	
	private OceanQ2Screen newOQ2;
	
	private OceanQ3Screen newOQ3;
	
	private OceanQ4Screen newOQ4;
	
	private OceanQ5Screen newOQ5;
		

	public void purposeToHome() {

		remove(newPurpose);

		newHome = new HomeScreen(myApplet);
		add(newHome);

		validate();
		repaint();

	}

//	public void homeToQuiz() {
//
//		remove(newHome);
//
//		newQuiz = new QuizScreen(myApplet);
//		add(newQuiz);
//
//		validate();
//		repaint();
//
//	}
	
	public void homeToQ1() {
		
		remove(newHome);
		
		newQ1 = new Q1Screen(myApplet);
		add(newQ1);
		
		validate();
		repaint();
		
	}
	
	public void q1toq2() {
		
		int points = newQ1.getPoints();
		
		remove(newQ1);
		
		
		newQ2 = new Q2Screen(myApplet, points);
		
		add(newQ2);
		
		validate();
		repaint();
		
		
	}
	
	public void q2toq3() {
		
		int points = newQ2.getPoints();
		
		remove(newQ2);
		
		
		newQ3 = new Q3Screen(myApplet, points);
		
		add(newQ3);
		
		validate();
		repaint();
		
	}
	
	public void q3toq4() {
		
		int points = newQ3.getPoints();
		
		remove(newQ3);
		
		
		newQ4 = new Q4Screen(myApplet, points);
		
		add(newQ4);
		
		validate();
		repaint();
		
	}
	
	public void q4toq5() {
		
		int points = newQ4.getPoints();
		
		remove(newQ4);
		
		
		newQ5 = new Q5Screen(myApplet, points);
		
		add(newQ5);
		
		validate();
		repaint();
		
	}
	
	public void q5toGame() {
		
		int intToPassToGame = newQ5.getPoints();
		
		remove(newQ5);
		
		newGame = new Game(intToPassToGame, myApplet); // may need to put in random int to test

		add(newGame);

		validate();
		repaint();
		
	}

	

//	public void quizToGame() {
//
//		// int intToPassToGame = newQuiz.calculateGameDifficulty();
//		remove(newQuiz);
//		newGame = new Game(7, myApplet); // put in random int
//
//		add(newGame);
//
//		validate();
//		repaint();
//
//	}

	public void gameToOQ1() {

		remove(newGame);

		newOQ1 = new OceanQ1Screen(myApplet);
		add(newOQ1);

		validate();
		repaint();

	}
	
	public void oq1tooq2() {
	
		int points = newOQ1.getPoints();
		
		remove(newOQ1);
		
		newOQ2 = new OceanQ2Screen(myApplet, points);
		add(newOQ2);
		
		validate();
		repaint();
		
	}
	
	public void oq2tooq3() {
		
		int points = newOQ2.getPoints();
		
		remove(newOQ2);
		
		newOQ3 = new OceanQ3Screen(myApplet, points);
		add(newOQ3);
		
		validate();
		repaint();
		
	}
	
	public void oq3tooq4() {
		
		int points = newOQ3.getPoints();
		
		remove(newOQ3);
		
		newOQ4 = new OceanQ4Screen(myApplet, points);
		add(newOQ4);
		
		validate();
		repaint();
		
	}
	
	public void oq4tooq5() {
		
		int points = newOQ4.getPoints();
		
		remove(newOQ4);
		
		newOQ5 = new OceanQ5Screen(myApplet, points);
		add(newOQ5);
		
		validate();
		repaint();
		
	}
	
	
	public void oq5toGame() {
		
		int intToPassToGame = newOQ5.getPoints();
		
		remove(newOQ5);
		
		newGame = new Game(intToPassToGame, myApplet); // may need to put in random int to test

		add(newGame);

		validate();
		repaint();
		
	}
	
	

//	public void sumToFunGame() {
//
//		remove(newSummary);
//
//		add(newGame);
//
//		validate();
//		repaint();
//
//	}

	// required method for JApplet
	// executed upon creation
	public void init() {
		myApplet = this;
		// set up JApplet
		setSize(frameWidth, frameHeight);
		setVisible(true);

		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					// would create game under some condition...like user
					// presses 'next' button

					newPurpose = new PurposeScreen(myApplet);

					add(newPurpose);

					// newGame = new Game(10, myApplet);

					// add Game to JApplet
					// add(newGame);
				}

			});
		} catch (Exception e) {
			System.err.println("error");
		}

	}

}
