


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

public class OceanQ5Screen extends JPanel implements QInterface{

	private JPanel oq5screen;
	
	private AppletMain applet;

	JTextField userInput;
	
	String[][] question = new String[][]{{"Global climate change will affect rainfall patterns. Why is this a bad thing?", "B", "A. It's not", "B. It will compromise the supply of fresh water", "C. It will make some places muddy"}};
	
	String funFact = "More variable rainfall patterns are likely to compromise the supply of fresh water. Globally, water scarcity already affects four out of every 10 people. A lack of water and poor water quality can compromise hygiene and health. This increases the risk of diarrhea, which kills approximately 2.2 million people every year, as well as trachoma (an eye infection that can lead to blindness) and other illnesses.";
	
	private int points; 
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.oq5toGame();
		}
	}
	
	
	public OceanQ5Screen(AppletMain appletParameter, int setAsPoints)
	{
		points = setAsPoints;
		
		applet = appletParameter;
		
		oq5screen = new JPanel();
		oq5screen.setBackground(Color.WHITE);
		oq5screen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Global climate change is affecting sea life as well!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		
		//  button to progress to next question
		JPanel oceanGameButtonPanel = new JPanel();
		oceanGameButtonPanel.setBackground(Color.WHITE);
		JButton oceanGameButton = new JButton("Next!");
		oceanGameButton.setFont(new Font("Helvetica", Font.BOLD, 16));
		oceanGameButton.addActionListener(new openQuizButtonListener());
		oceanGameButtonPanel.add(oceanGameButton);
		
		
		
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
		
		
		
		
		oq5screen.add(titleSummary, BorderLayout.PAGE_START);
		oq5screen.add(q, BorderLayout.CENTER);
		oq5screen.add(oceanGameButtonPanel, BorderLayout.PAGE_END);
		
		add(oq5screen);
		
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