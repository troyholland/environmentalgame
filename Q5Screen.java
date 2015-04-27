


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


import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q5Screen extends JPanel {

	private JPanel q5screen;
	
	private AppletMain applet;
	
	String[][] question = new String[][]{{"Which of the following methods of transportation does NOT contribute to climate change?", "C", "A. Driving a car", "B. Taking the bus", "C. Riding your bicycle"}};
	
	private int points;
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q5toGame();
		}
	}
	
	
	public Q5Screen(AppletMain appletParameter, int setAsPoints)
	{
		points = setAsPoints;
		
		applet = appletParameter;
		
		q5screen = new JPanel();
		q5screen.setBackground(Color.WHITE);
		q5screen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Let's See What You Know!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		// button to progress to the game
		JPanel openGameButtonPanel = new JPanel();
		openGameButtonPanel.setBackground(Color.WHITE);
		JButton openGameButton = new JButton("Start!");
		openGameButton.setFont(new Font("Helvetica", Font.BOLD, 16));
		openGameButton.addActionListener(new openQuizButtonListener());
		openGameButtonPanel.add(openGameButton);
		
		
		JTextArea q = new JTextArea();
		q.setText(question[0][0] + "\n" + question[0][2] + "\n" +  question[0][3] + "\n" + question[0][4]);
		q.setWrapStyleWord(true);
		q.setFont(new Font("Helvetica", Font.BOLD, 20));
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		q5screen.add(titleSummary, BorderLayout.PAGE_START);
		q5screen.add(q, BorderLayout.CENTER);
		q5screen.add(openGameButtonPanel, BorderLayout.PAGE_END);
		
		add(q5screen);
		
		validate();
		repaint();

		
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
	
	public int getPoints() { return points; };
	
}
