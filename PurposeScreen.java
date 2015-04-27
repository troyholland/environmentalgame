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

//import FinalProject.HomeScreen.openQuizButtonListener;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PurposeScreen extends JPanel{

	private JPanel purposePage;

	private AppletMain applet;

	private JPanel openHomeButtonPanel;

	private JButton openHomeButton;

	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.purposeToHome();
		}
	}


	public PurposeScreen(AppletMain appletParameter)
	{

		applet = new AppletMain();
		applet = appletParameter;

		purposePage = new JPanel();
		purposePage.setBackground(Color.WHITE);
		purposePage.setLayout(new BorderLayout());

		JLabel titleSummary = new JLabel("<html><head><title>For Educators: </title><head>"
				+ "<body><p></p><p></p>"
				+ "<p>For Educators: </p>"
				+ "<p>The purpose of this game is to teach middle</p>"
				+ "<p>school students about climate change and how</p>"
				+ "<p>their own actions contribute to the earth's</p> "
				+ "<p>overall global warming. We hope that this game</p> "
				+ "<p>encourages teachers to continue to teach about</p>"
				+ "<p>global warming, as well as inform students about</p>"
				+ "<p>what actions that they can take to help reduce</p>"
				+ "<p>CO2 emissions and global warming.</p></body></html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 28));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);

		//  button to progress to game
		openHomeButtonPanel = new JPanel();
		openHomeButtonPanel.setBackground(Color.WHITE);
		openHomeButton = new JButton("Start!");
		openHomeButton.setFont(new Font("Helvetica", Font.BOLD, 16));
		openHomeButton.addActionListener(new openQuizButtonListener());
		openHomeButtonPanel.add(openHomeButton);

		purposePage.add(titleSummary, BorderLayout.CENTER);
		purposePage.add(openHomeButtonPanel, BorderLayout.SOUTH);

		add(purposePage);

		validate();
		repaint();


	}

}