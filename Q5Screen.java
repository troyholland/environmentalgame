


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

//import QuizScreen.openQuizButtonListener;


//import SummaryScreen.openQuizButtonListener;


//import QuizScreen.openQuizButtonListener;


import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import Q4Screen.openQuizButtonListener;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q5Screen extends JPanel {

	private JPanel q5screen;
	private JPanel q5screenb;
	
	private AppletMain applet;
	private QuestionPanel genericPanel;
	
	String[][] question = new String[][]{{"An increase of 2°F in average global temperatures would do what?", "B", "A. Nothing. The earth won't care", "B. Crop yields will be severely decreased", "C. The earth will melt"}};
	
	String funFact = "Changing the average global temperature by even a degree or two can lead to serious consequences around the globe. For about every 2°F of warming, we can expect to see 5—15% reductions in the yields of crops as currently grown, 3—10% increases in the amount of rain falling during the heaviest precipitation events, which can increase flooding risks, 5—10% decreases in stream flow in some river basins, including the Arkansas and the Rio Grande, 200%—400% increases in the area burned by wildfire in parts of the western United States.";
	
	private int points;
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q5toGame();
		}
	}
	
	
	public Q5Screen(AppletMain appletParameter, int setAsPoints, QuestionPanel basePanel)
	{
		points = setAsPoints;
		applet = appletParameter;
		genericPanel = basePanel;
		
		setUpScreen();
	}
	
	public void setUpScreen()
	{
		setLayout(new BorderLayout());
        
		// edit based on question
		genericPanel.questionText.setText(question[0][0] + "\n" + question[0][2] + 
				"\n" +  question[0][3] + "\n" + question[0][4]);
		
		JButton submitButton = new JButton("Submit!");
		submitButton.setFont(new Font("Courier", Font.PLAIN, 14));
		submitButton.addActionListener(new openQuizButtonListener());
		genericPanel.qButtonPanel.removeAll();
		genericPanel.qButtonPanel.add(submitButton);
		
        add(genericPanel);
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
	
	public int getPoints() { return points; };
	
}
