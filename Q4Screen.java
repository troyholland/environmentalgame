


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

public class Q4Screen extends JPanel {

	private JPanel q4screen;
	private JPanel q4screenb;
	
	private AppletMain applet;
	
	String[][] question = new String[][]{{"Why do we worry about increased levels of carbon dioxide in the atmosphere?", "A", "A. Excess carbon dioxide in the atmosphere increases global temperatures" , "B. Carbon dioxide makes the sun look blue", "C. We don't worry because climate change is a hoax"}};
	
	String funFact = "Carbon dioxide is a necessary ingredient for plants to perform photosynthesis, and a critical component of our atmosphere. However, you can have too much of a good thing. The excess carbon dioxide we are adding to the atmosphere increases global temperatures, leading to climate changes that can harm plants, animals, and humans.";
	
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
		
		q4screenb = new JPanel();
		q4screenb.setBackground(Color.WHITE);
		q4screenb.setLayout(new BorderLayout());


		JLabel titleSummary = new JLabel("<html>Let's see what you know!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
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

		q4screen.add(titleSummary, BorderLayout.NORTH);
		q4screen.add(scroll, BorderLayout.CENTER);
		q4screenb.add(field, BorderLayout.CENTER);
		q4screenb.add(q2ButtonPanel, BorderLayout.SOUTH);
	

		add(q4screen);
		add(q4screenb);

		validate();
		repaint();


		
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
	
	public int getPoints() { return points; };
	
}
