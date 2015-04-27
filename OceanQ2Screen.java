


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

public class OceanQ2Screen extends JPanel implements QInterface{

	private JPanel oq2screen;
	
	private AppletMain applet;

	JTextField userInput;
	
	String[][] question = new String[][]{{"Will a small rise in sea level affect people (even in the United States)?", "A", "A. Of course!", "B. No way!", "C. Nobody knows"}};
	
	String funFact = "A small rise in sea level will affect many people, even in the United States. The amount of sea level rise expected to occur as a result of climate change will increase the risk of coastal flooding for millions to hundreds of millions of people around the world, many of whom would have to permanently leave their homes. Global sea level has risen approximately 9 inches, on average, in the last 140 years. This has already put some coastal homes, beaches, roads, bridges, and wildlife at risk. By the year 2100, sea level is expected to rise another 1.5 to 3 feet. Rising seas will make coastal storms and the associated storm surges more frequent and destructive. For example, in New York City what is currently termed a once-in-a-century coastal flooding event could occur as frequently as once per decade.";
	
	private int points; 
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.oq2tooq3();
		}
	}
	
	
	public OceanQ2Screen(AppletMain appletParameter, int setAsPoints)
	{
		points = setAsPoints;
		
		applet = appletParameter;
		
		oq2screen = new JPanel();
		oq2screen.setBackground(Color.WHITE);
		oq2screen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Global climate change is affecting sea life as well!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		
		//  button to progress to next question
		JPanel oq3ButtonPanel = new JPanel();
		oq3ButtonPanel.setBackground(Color.WHITE);
		JButton oq3Button = new JButton("Next!");
		oq3Button.setFont(new Font("Helvetica", Font.BOLD, 16));
		oq3Button.addActionListener(new openQuizButtonListener());
		oq3ButtonPanel.add(oq3Button);
		
		
		
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
		
		
		
		
		oq2screen.add(titleSummary, BorderLayout.PAGE_START);
		oq2screen.add(q, BorderLayout.CENTER);
		oq2screen.add(oq3ButtonPanel, BorderLayout.PAGE_END);
		
		add(oq2screen);
		
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