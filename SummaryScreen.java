

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

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SummaryScreen extends JPanel {
	
private JPanel sumGameScreen;
	
	private AppletMain applet;
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.sumToFunGame();
		}
	}
	
	
	public SummaryScreen(AppletMain appletParameter)
	{
		
		
		applet = appletParameter;
		
		sumGameScreen = new JPanel();
		sumGameScreen.setBackground(Color.WHITE);
		sumGameScreen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Today we're going to learn about protecting the Earth!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		
		//  button to progress to game
		JPanel openFunGameButtonPanel = new JPanel();
		openFunGameButtonPanel.setBackground(Color.WHITE);
		JButton openFunGameButton = new JButton("Start!");
		openFunGameButton.setFont(new Font("Helvetica", Font.BOLD, 16));
		openFunGameButton.addActionListener(new openQuizButtonListener());
		openFunGameButtonPanel.add(openFunGameButton);
		
		
		
		
		
		sumGameScreen.add(titleSummary, BorderLayout.CENTER);
		sumGameScreen.add(openFunGameButtonPanel, BorderLayout.SOUTH);
		
		add(sumGameScreen);
		
		validate();
		repaint();

		
	}
	

}
