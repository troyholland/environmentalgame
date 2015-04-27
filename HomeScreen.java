import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HomeScreen extends JPanel {
	private AppletMain applet;
	
	// panels and buttons
	private JPanel openQuizButtonPanel;
	private JButton openQuizButton;
	
	// background
	private Image backgroundImageEarth;
	private Image scaledBackgroundImageEarth;
	
	public HomeScreen(AppletMain appletParameter)
	{
		applet = new AppletMain();
		applet = appletParameter;
		
		// create background image
        ImageIcon myBackgroundImageEarth = new ImageIcon(this.getClass().getResource("/leavesBackground.jpg"));
        backgroundImageEarth = myBackgroundImageEarth.getImage();
        scaledBackgroundImageEarth = backgroundImageEarth.getScaledInstance(720, 520, Image.SCALE_FAST);

		setUpScreen();
	}
	
	public void setUpScreen()
	{
		setLayout(new BorderLayout());
		setOpaque(false);
		
		// info about what we'll be doing
		JLabel appInfoLabel = new JLabel("<html><br><br>-- Here, you'll learn about protecting <br>the earth!<br><br>"
				+ "-- To do so, you'll be given a set of five <br>earth-related questions to answer<br><br>"
				+ "-- After these five earth questions, you'll <br>have the opportunity to play an interactive game<br><br>"
				+ "-- Upon the game's completion, you'll be given <br>another set of five questions, but this time,<br> they"
				+ " are related to the ocean<br><br>"
				+ "-- After these five ocean questions, you'll have <br>another opportunity to play another interactive<br>"
				+ " game<br><br>"
				+ "-- Lastly, you will be tested on your learning! </html>");
		appInfoLabel.setFont(new Font("Courier", Font.PLAIN, 18));
		appInfoLabel.setForeground(Color.WHITE);
		appInfoLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//  button to progress to game
		openQuizButtonPanel = new JPanel();
		openQuizButtonPanel.setOpaque(false);
		openQuizButtonPanel.setBackground(Color.WHITE);
		openQuizButton = new JButton("Let's Get Going!");
		openQuizButton.setFont(new Font("Courier", Font.PLAIN, 14));
		openQuizButton.addActionListener(new openQuizButtonListener());
		openQuizButtonPanel.add(openQuizButton);
		
		// recycle image
        ImageIcon myRecycleImage = new ImageIcon(this.getClass().getResource("/recycleHomeImage.png"));
        JLabel recycleImage = new JLabel(myRecycleImage);
		
        add(recycleImage, BorderLayout.LINE_END);
		add(appInfoLabel, BorderLayout.PAGE_START);
		add(openQuizButtonPanel, BorderLayout.PAGE_END);
	}
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.homeToQ1();
		}
	}
	
	/*
	 * for background
	 */
	@Override
	protected void paintComponent(Graphics background) 
	{
	    super.paintComponent(background);
	    background.drawImage(scaledBackgroundImageEarth, 0, 0, this);
	}
}
