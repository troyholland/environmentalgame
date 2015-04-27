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
	
	private JPanel openQuizButtonPanel;
	
	private JButton openQuizButton;
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.homeToQ1();
		}
	}
	
	
	public HomeScreen(AppletMain appletParameter)
	{
		
		applet = new AppletMain();
		applet = appletParameter;
		
		homePage = new JPanel();
		homePage.setBackground(Color.WHITE);
		homePage.setLayout(new BorderLayout());
		
		
		JLabel titleSummary = new JLabel("<html><body><p>Today we're going to learn</p><p>about protecting the Earth!</p></body></html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 28));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		
		//  button to progress to game
		openQuizButtonPanel = new JPanel();
		openQuizButtonPanel.setBackground(Color.WHITE);
		openQuizButton = new JButton("Start!");
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
