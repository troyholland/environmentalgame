


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
	
	/*public void setUpScreen()
	{
		setLayout(new BorderLayout());
		
		// title
		JLabel titleSummary = new JLabel("<html><br>Let's See What You Know!</html>");
		titleSummary.setFont(new Font("Courier", Font.PLAIN, 30));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		// holds question
		questionArea = new JPanel();
		questionArea.setBackground(Color.WHITE);
		questionArea.setOpaque(false);
		questionArea.setLayout(new BorderLayout());

		// holds submission
		submitArea = new JPanel();
		submitArea.setOpaque(false);

		//  button to submit to next question
		JPanel q2ButtonPanel = new JPanel();
		q2ButtonPanel.setOpaque(false);
		JButton q2Button = new JButton("Submit!");
		q2Button.setFont(new Font("Courier", Font.PLAIN, 14));
		q2Button.addActionListener(new openQuizButtonListener());
		q2ButtonPanel.add(q2Button);

		// display question
		JTextArea questionText = new JTextArea();
		questionText.setText(question[0][0] + "\n" + question[0][2] + "\n" +  question[0][3] + "\n" + question[0][4]);
		questionText.setWrapStyleWord(true);
		questionText.setLineWrap(true);
		questionText.setFont(new Font("Courier", Font.BOLD, 18));
		questionText.setEditable(false);
		questionText.setBorder(new LineBorder(Color.BLACK, 2, true));
		
		// where info is input
		JTextField field = new JTextField("", 5);
		field.setHorizontalAlignment(JTextField.RIGHT);
		field.setBorder(new LineBorder(Color.BLACK, 2, true));
		
		String input = new String();
		input = field.getText();

		// add to layouts
		questionArea.add(titleSummary, BorderLayout.NORTH);
		questionArea.add(questionText, BorderLayout.CENTER);
		submitArea.add(field);
		submitArea.add(q2ButtonPanel);
	
		add(questionArea, BorderLayout.PAGE_START);
		add(submitArea, BorderLayout.PAGE_END);
	}*/
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
	
	public int getPoints() { return points; };
	
}
