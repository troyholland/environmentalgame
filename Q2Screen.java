


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
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

//import Q1Screen.openQuizButtonListener;

import javax.swing.border.LineBorder;

//import Q3Screen.openQuizButtonListener;


//import Q1Screen.openQuizButtonListener;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q2Screen extends JPanel implements QInterface {

	private JPanel questionArea;
	private JPanel submitArea;
	private QuestionPanel genericPanel;
	
	private AppletMain applet;
	
	String[][] question = new String[][]{{"What percentage of climate experts "
			+ "believe humans are causing climate change?", "C", "A. 25%", "B. 50%", "C. 97%"}};
	
	String funFact = "In the field of climate studies, a survey of all "
			+ "peer-reviewed papers on the subject 'global climate change'"
			+ " published between 1993 and 2003 shows that not a single paper"
			+ " rejected the consensus position that global warming is man-made. "
			+ "The major scientific agencies of the United States — including the"
			+ " National Aeronautics and Space Administration (NASA) and the "
			+ "National Oceanic and Atmospheric Administration (NOAA) — agree "
			+ "that climate change is occurring and that humans are contributing "
			+ "to it. In 2010, the National Research Council concluded that "
			+ "'Climate change is occurring, is very likely caused by human activities, "
			+ "and poses significant risks for a broad range of human and natural systems'";
	
	private int points;
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q2toq3();
		}
	}
	
	
	public Q2Screen(AppletMain appletParameter, int setAsPoints, QuestionPanel basePanel)
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
	
	
	
	
	
	
	@Override
	public int getPoints() { return points; }


	@Override
	public void displayQuestion() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void printQ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAnswerCorrect(int x, char UserAnswer) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void displayFunFact() {
		// TODO Auto-generated method stub
		
	};
}
