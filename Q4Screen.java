


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


import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q4Screen extends JPanel {

	private JPanel q4screen;
	
	private AppletMain applet;
	
	String[][] question = new String[][]{{"What is the name for a scientist that studies the weather and climate?", "A", "A. Meteorologist", "B. Climatist", "C. Biologists"}};
	
	private int points;
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q4toq5();
		}
	}
	
	
	public Q4Screen(AppletMain appletParameter, int setAsPoints)
	{
		points = setAsPoints;
		
		applet = appletParameter;
		
		q4screen = new JPanel();
		q4screen.setBackground(Color.WHITE);
		q4screen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Let's See What You Know!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		
		//  button to progress to next question
		JPanel q5ButtonPanel = new JPanel();
		q5ButtonPanel.setBackground(Color.WHITE);
		JButton q5Button = new JButton("Next!");
		q5Button.setFont(new Font("Helvetica", Font.BOLD, 16));
		q5Button.addActionListener(new openQuizButtonListener());
		q5ButtonPanel.add(q5Button);
		
		
		
		
		
		JTextArea q = new JTextArea();
		q.setText(question[0][0] + "\n" + question[0][2] + "\n" +  question[0][3] + "\n" + question[0][4]);
		q.setWrapStyleWord(true);
		q.setFont(new Font("Helvetica", Font.BOLD, 20));
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		q4screen.add(titleSummary, BorderLayout.PAGE_START);
		q4screen.add(q, BorderLayout.CENTER);
		q4screen.add(q5ButtonPanel, BorderLayout.PAGE_END);
		
		add(q4screen);
		
		validate();
		repaint();

		
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
	
	public int getPoints() { return points; };
	
}
