


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


import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

//import Q2Screen.openQuizButtonListener;



//import Q2Screen.openQuizButtonListener;


//import Q2Screen.openQuizButtonListener;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q3Screen extends JPanel {

	private JPanel questionArea;
	private JPanel submitArea;
	private QuestionPanel genericPanel;
	
	
	private AppletMain applet;
	
	String[][] question = new String[][]{{"In the last century, the global average temperature did what?"
		, "C", "A. Did not change", "B. Increased by less than 1°F", "C. Increased by more than 1°F"}};
	
	String funFact = "The global average temperature increased "
			+ "by more than 1.4°F over the last century. In fact, "
			+ "according to the National Oceanic and Atmospheric Administration "
			+ "(NOAA), the decade from 2000 to 2010 was the warmest on record, "
			+ "and 2010 was tied with 2005 as the warmest year on record.";
	
	private int points;
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q3toq4();
		}
	}
	
	
	public Q3Screen(AppletMain appletParameter, int setAsPoints, QuestionPanel basePanel)
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
