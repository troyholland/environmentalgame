//package EnvironmentGame;


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

public class Q1Screen extends JPanel implements QInterface{

	private JPanel q1screen;
	private JPanel q1screenb;

	private AppletMain applet;


	String[][] question = new String[][]{{"What are greenhouse gases?", "A", "A. Gases that trap heat above the earth", 
		"B. Gases that are made by plants growing in greenhouses", "C. Gases used to heat greenhouses so "
				+ "that they are warm enough for plants to grow"}};

	String funFact = "Greenhouse gases are meant for providing a warm space for plants in general to grow when it's too cold for them outside, like in winter. However, the greenhouse effect can become stronger, causing more and more heat to be trapped on Earth, causing the average temperature to rise. This is called global warming.";

	private int points = 7; // random int for testing // this should be 0 for actual


	public Q1Screen(AppletMain appletParameter)
	{


		applet = appletParameter;

		q1screen = new JPanel();
		q1screen.setBackground(Color.WHITE);
		q1screen.setLayout(new BorderLayout());

		q1screenb = new JPanel();
		q1screenb.setBackground(Color.WHITE);
		q1screenb.setLayout(new BorderLayout());



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

		q1screen.add(titleSummary, BorderLayout.NORTH);
		q1screen.add(scroll, BorderLayout.CENTER);
		q1screenb.add(field, BorderLayout.CENTER);
		q1screenb.add(q2ButtonPanel, BorderLayout.SOUTH);
	

		add(q1screen);
		add(q1screenb);

		validate();
		repaint();


	}


	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer




	@Override
	public boolean isAnswerCorrect(int x, char userAnswer) {
		// TODO Auto-generated method stub

		String correct = "Correct!";
		String incorrect = "Incorrect!";
		String tooManyChars = "You have entered too many characters. Please try again.";
		String notAValidOpt = "You have entered an invalid character. Please choose from A to C.";
		
		//char firstCharacter  = text.charAt(0);
		
		boolean correctAnswer = (userAnswer + "").equalsIgnoreCase(question[x][1]);
		
//		if (text.length() > 1){
//			//do something letting the user know that they entered too many characters
//			correctAnswer = false;
//			JOptionPane.showMessageDialog(this, tooManyChars, "Invalid!", JOptionPane.YES_NO_OPTION);
//		}
		
//		switch (firstCharacter){
//		case 1: firstCharacter = 'A';
//			//do something here depending on if this is the correct answer
//			break;
//		case 2: firstCharacter = 'a';
//		//do something here depending on if this is the correct answer
//			break;
//		case 3: firstCharacter = 'B';
//		//do something here depending on if this is the correct answer
//			break;
//		case 4: firstCharacter = 'b';
//		//do something here depending on if this is the correct answer
//			break;
//		case 5: firstCharacter = 'C';
//		//do something here depending on if this is the correct answer
//			break;
//		case 6: firstCharacter = 'c';
//		//do something here depending on if this is the correct answer
//			break;
//		default: 
//			correctAnswer = false;
//			JOptionPane.showMessageDialog(this, tooManyChars, "Invalid!", JOptionPane.YES_NO_OPTION);
//			break;
//		}
		
		
		if (correctAnswer){
			JOptionPane.showMessageDialog(this, correct, "Correct!", JOptionPane.YES_NO_OPTION);
		}else{
			JOptionPane.showMessageDialog(this, incorrect, "Incorrect!", JOptionPane.YES_NO_OPTION);
		}

		return correctAnswer;
	}



//	@Override
//	public void nextScreen() {
//		// TODO Auto-generated method stub
//
//	}


//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//
//	}


//	@Override
//	public void printQ(int x) {
//		// TODO Auto-generated method stub
//
//	}


//	@Override
//	public void displayFact() {
//		// TODO Auto-generated method stub
//
//	}


//	@Override
//	public void getScore() {
//		// TODO Auto-generated method stub
//
//	};
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q1toq2();
		}
	}

	@Override
	public void displayQuestion() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void printQ() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}


//	@Override
//	public boolean isAnswerCorrect(int x, char UserAnswer) {
//		// TODO Auto-generated method stub
//		return false;
//	}


	@Override
	public void displayFunFact() {
		// TODO Auto-generated method stub
		
	}


}
