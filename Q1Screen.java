


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
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q1Screen extends JPanel implements QInterface{

	private JPanel q1screen;
	
	private AppletMain applet;

	JTextField userInput;
	
	String[][] question = new String[][]{{"What are greenhouse gases?", "A", "A. Gases that trap heat above the earth", 
						"B. Gases that are made by plants growing in greenhouses", "C. Gases used to heat greenhouses so "
								+ "that they are warm enough for plants to grow"}};
	
	private int points = 7; // random int for testing // this should be 0 for actual
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q1toq2();
		}
	}
	
	
	public Q1Screen(AppletMain appletParameter)
	{
		
		
		applet = appletParameter;
		
		q1screen = new JPanel();
		q1screen.setBackground(Color.WHITE);
		q1screen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Let's see what you know!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		
		//  button to progress to next question
		JPanel q2ButtonPanel = new JPanel();
		q2ButtonPanel.setBackground(Color.WHITE);
		JButton q2Button = new JButton("Next!");
		q2Button.setFont(new Font("Helvetica", Font.BOLD, 16));
		q2Button.addActionListener(new openQuizButtonListener());
		q2ButtonPanel.add(q2Button);
		
		
		
		JTextArea q = new JTextArea();
		q.setText(question[0][0] + "\n" + question[0][2] + "\n" +  question[0][3] + "\n" + question[0][4]);
		q.setWrapStyleWord(true);
		q.setFont(new Font("Helvetica", Font.BOLD, 20));
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		userInput = new JTextField(1);
		
		String input = new String();
		
		input = userInput.getText();
		
		TextHandler handler = new TextHandler();
		userInput.addActionListener(handler);
		
		
		
		
		q1screen.add(titleSummary, BorderLayout.PAGE_START);
		q1screen.add(q, BorderLayout.CENTER);
		q1screen.add(q2ButtonPanel, BorderLayout.PAGE_END);
		
		add(q1screen);
		
		validate();
		repaint();

		
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	private class TextHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == userInput){
				String display = e.getActionCommand();
			}
			//JOptionPane.showMessageDialog(null, display); // this is not working :/
		}
		
	}
	
	
	
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
	public boolean isAnswerCorrect(int x, char userAnswer) {
		// TODO Auto-generated method stub
		
		String correct = "Correct!";
		String incorrect = "Incorrect!";
		
		boolean correctAnswer = (userAnswer + "").equalsIgnoreCase(question[x][1]);
		if (correctAnswer){
			JOptionPane.showMessageDialog(this, correct, "Correct!", JOptionPane.YES_NO_OPTION);
			}else{
			JOptionPane.showMessageDialog(this, incorrect, "Incorrect!", JOptionPane.YES_NO_OPTION);
		}
		
		return correctAnswer;
	}


	@Override
	public void displayFunFact() {
		// TODO Auto-generated method stub
		
	};
	
}
