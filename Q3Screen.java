


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


import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q3Screen extends JPanel {

	private JPanel q3screen;
	private JPanel q3screenb;
	
	
	private AppletMain applet;
	
	String[][] question = new String[][]{{"In the last century, the global average temperature did what?", "C", "A. Did not change", "B. Increased by less than 1°F", "C. Increased by more than 1°F"}};
	
	String funFact = "The global average temperature increased by more than 1.4°F over the last century. In fact, according to the National Oceanic and Atmospheric Administration (NOAA), the decade from 2000 to 2010 was the warmest on record, and 2010 was tied with 2005 as the warmest year on record.";
	
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
		applet = appletParameter;

		q3screen = new JPanel();
		q3screen.setBackground(Color.WHITE);
		q3screen.setLayout(new BorderLayout());
		
		q3screenb = new JPanel();
		q3screenb.setBackground(Color.WHITE);
		q3screenb.setLayout(new BorderLayout());


		JLabel titleSummary = new JLabel("<html>Let's see what you know!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 40));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);



		//  button to progress to next question
		JPanel q2ButtonPanel = new JPanel();
		q2ButtonPanel.setBackground(Color.WHITE);
		JButton q2Button = new JButton("Submit!");
		q2Button.setFont(new Font("Helvetica", Font.BOLD, 16));
		q2Button.addActionListener(new openQuizButtonListener());
		q2ButtonPanel.add(q2Button);


		JTextArea q = new JTextArea();
		q.setText(question[0][0] + "\n" + question[0][2] + "\n" +  question[0][3] + "\n" + question[0][4]);
		q.setWrapStyleWord(true);
		q.setFont(new Font("Helvetica", Font.BOLD, 18));
		q.setEditable(false);
		JScrollPane scroll = new JScrollPane(q);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		

		JTextField field = new JTextField(10);
		field.setHorizontalAlignment(JTextField.RIGHT);
		
		String input = new String();
		input = field.getText();

		q3screen.add(titleSummary, BorderLayout.NORTH);
		q3screen.add(scroll, BorderLayout.CENTER);
		q3screenb.add(field, BorderLayout.CENTER);
		q3screenb.add(q2ButtonPanel, BorderLayout.SOUTH);
	

		add(q3screen);
		add(q3screenb);

		validate();
		repaint();

		
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
	
	public int getPoints() { return points; };
	
}
