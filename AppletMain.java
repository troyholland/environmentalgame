//package EnvironmentGame;

//the main file

import java.awt.Graphics;

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
	
	private QuestionPanel genericQPanel;
	
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
	
	private ReviewScreen newReview;
		

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
		
		newQ1 = new Q1Screen(myApplet, genericQPanel);
		add(newQ1);
		
		validate();
		repaint();
		
	}
	
	public void q1toq2() {
		
		int points = newQ1.getPoints();
		
		remove(newQ1);
		newQ1.remove(genericQPanel);
		
		newQ2 = new Q2Screen(myApplet, points, genericQPanel);
		add(newQ2);
		
		validate();
		repaint();
		
		
	}
	
	public void q2toq3() {
		
		int points = newQ2.getPoints();
		
		remove(newQ2);
		newQ2.remove(genericQPanel);
		
		newQ3 = new Q3Screen(myApplet, points, genericQPanel);
		add(newQ3);
		
		validate();
		repaint();
		
	}
	
	public void q3toq4() {
		
		int points = newQ3.getPoints();
		
		remove(newQ3);
		newQ3.remove(genericQPanel);
		
		newQ4 = new Q4Screen(myApplet, points, genericQPanel);
		
		add(newQ4);
		
		validate();
		repaint();
		
	}
	
	public void q4toq5() {
		
		int points = newQ4.getPoints();
		
		remove(newQ4);
		newQ4.remove(genericQPanel);
		
		newQ5 = new Q5Screen(myApplet, points, genericQPanel);
		
		add(newQ5);
		
		validate();
		repaint();
		
	}
	
	public void q5toGame() {
		
		int intToPassToGame = newQ5.getPoints();
		
		remove(newQ5);
		newQ5.remove(genericQPanel);
		
		newGame = new Game(5, myApplet); // may need to put in random int to test

		add(newGame);

		validate();
		repaint();
		
	}

	

	public void gameToOQ1() {

		remove(newGame);

		genericQPanel.changeBackground();
		newOQ1 = new OceanQ1Screen(myApplet, genericQPanel);
		add(newOQ1);

		validate();
		repaint();

	}
	
	public void oq1tooq2() {
	
		int points = newOQ1.getPoints();
		
		remove(newOQ1);
		newOQ1.remove(genericQPanel);
		
		newOQ2 = new OceanQ2Screen(myApplet, points, genericQPanel);
		add(newOQ2);
		
		validate();
		repaint();
		
	}
	
	public void oq2tooq3() {
		
		int points = newOQ2.getPoints();
		
		remove(newOQ2);
		newOQ2.remove(genericQPanel);
		
		newOQ3 = new OceanQ3Screen(myApplet, points, genericQPanel);
		add(newOQ3);
		
		validate();
		repaint();
		
	}
	
	public void oq3tooq4() {
		
		int points = newOQ3.getPoints();
		
		remove(newOQ3);
		newOQ3.remove(genericQPanel);
		
		newOQ4 = new OceanQ4Screen(myApplet, points, genericQPanel);
		add(newOQ4);
		
		validate();
		repaint();
		
	}
	
	public void oq4tooq5() {
		
		int points = newOQ4.getPoints();
		
		remove(newOQ4);
		newOQ4.remove(genericQPanel);
		
		newOQ5 = new OceanQ5Screen(myApplet, points, genericQPanel);
		add(newOQ5);
		
		validate();
		repaint();
		
	}
	
	
	public void oq5toGame() {
		remove(newOQ5);
		newOQ5.remove(genericQPanel);

		add(newGame);

		validate();
		repaint();
		
	}
	
	
	public void gameToReview() {
		remove(newGame);
		
		newReview = new ReviewScreen();
		
		add(newReview);
		
		validate();
		repaint();
	}
	

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

					genericQPanel = new QuestionPanel();
					newPurpose = new PurposeScreen(myApplet);

					add(newPurpose);
					
					validate();
					repaint();
					

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
