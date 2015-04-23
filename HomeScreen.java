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

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HomeScreen extends JPanel {

	private JPanel homePage;
	
	private AppletMain applet;
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.homeToQuiz();
		}
	}
	
	
	public HomeScreen(AppletMain appletParameter)
	{
		
		
		applet = appletParameter;
		
		homePage = new JPanel();
		homePage.setBackground(Color.WHITE);
		homePage.setLayout(new BorderLayout());
		
		JLabel titleSummary = new JLabel("<html>Today we're going to learn about protecting the Earth!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		
		//  button to progress to game
		JPanel openQuizButtonPanel = new JPanel();
		openQuizButtonPanel.setBackground(Color.WHITE);
		JButton openQuizButton = new JButton("Start!");
		openQuizButton.setFont(new Font("Helvetica", Font.BOLD, 16));
		openQuizButton.addActionListener(new openQuizButtonListener());
		openQuizButtonPanel.add(openQuizButton);
		
		homePage.add(titleSummary, BorderLayout.CENTER);
		homePage.add(openQuizButtonPanel, BorderLayout.SOUTH);
		
		add(homePage);
		
		validate();
		repaint();
		
		
	}
	
}
