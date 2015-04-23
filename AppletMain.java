
//the main file

import javax.swing.JApplet; 
import javax.swing.SwingUtilities;

public class AppletMain extends JApplet {

	private static final int frameWidth = 720;
	private static final int frameHeight = 520;
	
	// where game will be played
	private Game newGame;
	
	private AppletMain myApplet;
	
	private QuizScreen newQuiz;
	
	private HomeScreen newHome;
	
	private SummaryScreen newSummary;
	
	public void homeToQuiz() {
		
		remove(newHome);
		
		newQuiz = new QuizScreen(myApplet);
		add(newQuiz);
		
	}
	
	public void quizToGame() {
		
		int intToPassToGame = newQuiz.calculateGameDifficulty();
		remove(newQuiz);
		newGame = new Game(intToPassToGame, myApplet);
		
	}
	
	public void gameToSum() {
		
		remove(newGame);
		
		newSummary = new SummaryScreen(myApplet);
		add(newSummary);
		
	}
	
	public void sumToFunGame() {
		
		remove(newSummary);
		
		add(newGame);
		
	}
	
	
	// required method for JApplet
	// executed upon creation
	public void init()
	{
		myApplet = this;
		try {
			 SwingUtilities.invokeAndWait(new Runnable() {
			 public void run() {
				 	// would create game under some condition...like user presses 'next' button
				 
				 newHome = new HomeScreen(myApplet);
				 
				 add(newHome);
				 
					//newGame = new Game(10, myApplet);
					
					// add Game to JApplet
					//add(newGame);
			 	}
			 	
			 });
			 } 
		catch (Exception e) {
				 System.err.println("error");
			 }					
		
		// set up JApplet
		setSize(frameWidth, frameHeight);
		setVisible(true);
	}
	
}
