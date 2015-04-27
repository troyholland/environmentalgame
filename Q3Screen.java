


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

public class Q3Screen extends JPanel {

	private JPanel q3screen;
	
	private AppletMain applet;
	
	String[][] question = new String[][]{{"Which country currently emits the most greenhouse gases?", "C", "A. United States", "B. India", "C. China"}};
	
	private int points;
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q3toq4();
		}
	}
	
	
	public Q3Screen(AppletMain appletParameter, int setAsPoints)
	{
		points = setAsPoints;
		
		applet = appletParameter;
		
		q3screen = new JPanel();
		q3screen.setBackground(Color.WHITE);
		q3screen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Let's See What You Know!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		
		//  button to progress to next question
		JPanel q4ButtonPanel = new JPanel();
		q4ButtonPanel.setBackground(Color.WHITE);
		JButton q4Button = new JButton("Next!");
		q4Button.setFont(new Font("Helvetica", Font.BOLD, 16));
		q4Button.addActionListener(new openQuizButtonListener());
		q4ButtonPanel.add(q4Button);
		
		
		JTextArea q = new JTextArea();
		q.setText(question[0][0] + "\n" + question[0][2] + "\n" +  question[0][3] + "\n" + question[0][4]);
		q.setWrapStyleWord(true);
		q.setFont(new Font("Helvetica", Font.BOLD, 20));
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		q3screen.add(titleSummary, BorderLayout.PAGE_START);
		q3screen.add(q, BorderLayout.CENTER);
		q3screen.add(q4ButtonPanel, BorderLayout.PAGE_END);
		
		
		add(q3screen);
		
		validate();
		repaint();

		
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
	
	public int getPoints() { return points; };
	
}
