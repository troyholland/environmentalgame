


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
	
	
	public Q5Screen(AppletMain appletParameter, int setAsPoints)
	{
		points = setAsPoints;
		
		applet = appletParameter;

		q5screen = new JPanel();
		q5screen.setBackground(Color.WHITE);
		q5screen.setLayout(new BorderLayout());
		
		q5screenb = new JPanel();
		q5screenb.setBackground(Color.WHITE);
		q5screenb.setLayout(new BorderLayout());


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

		q5screen.add(titleSummary, BorderLayout.NORTH);
		q5screen.add(scroll, BorderLayout.CENTER);
		q5screenb.add(field, BorderLayout.CENTER);
		q5screenb.add(q2ButtonPanel, BorderLayout.SOUTH);
	

		add(q5screen);
		add(q5screenb);

		validate();
		repaint();

	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
	
	public int getPoints() { return points; };
	
}
