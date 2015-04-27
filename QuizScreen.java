////environment game Board class
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//
////import PurposeScreen.openQuizButtonListener;
//
//
//import java.awt.Font;
//import java.awt.Color;
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//
//public class QuizScreen extends JPanel {
//	
//private JPanel gamePage;
//private AppletMain applet;
//
//private JPanel openGameButtonPanel;
//
//private JButton openGameButton;
//
//
//static String[][] multipleChoice = new String[][]{
//	{"1. What are greenhouse gases?", "A", "A. Gases that trap heat above the earth", 
//		"B. Gases that are made by plants growing in greenhouses", "C. Gases used to heat greenhouses so they "
//				+ "are warm enough for plants to grow"},
//	{"2. Which of the following is NOT a greenhouse gas?", "B", "A. Methane", "B. Oxygen", "C. Carbon dioxide"}, 
//	{"3. Which country currently emits the most greenhouse gases?", "C", "A. United States", "B. India", "C. China"},
//	{"4. What is the name for a scientist that studies the weather and climate?", "A", "A. Meteorologist", "B. Climatist", "C. Biologists"},
//	{"5. Which of the following methods of transportation does NOT contribute to climate change?", "C", "A. Driving a car", "B. Taking the bus", "C. Riding your bicycle"},
//	{"6. What type of supermarket bag is more ecofriendly, paper or plastic?", "C", "A. Paper", "B. Plastic", "C. Both hurt the environment"},
//	{"7. What is happening to the sea level due to global warming?", "C", "A. The ocean will expand as it gets warmer.", "B. Glaciers and ice-sheet will melt", "C. Both will occur."},
//	{"8. Which of the following activites is NOT ecofriendly for the climate?", "B", "A. Using incandescent lightbulbs", "B. Leaving the water running while you brush your teeth", "C. Using a reusable shopping bag when"
//			+ "going to the grocery store"},
//	{"9. "},
//	{"10. "}
//};
//
//int questionCounter = 0;
//
//int[] answers;
//	
//	class openQuizButtonListener implements ActionListener
//	{
//		public void actionPerformed(ActionEvent event)
//		{
//			applet.quizToGame();
//		}
//	}
//	
//	
//	public QuizScreen(AppletMain appletParameter)
//	{
//		
//		applet = new AppletMain();
//		applet = appletParameter;
//		
//		gamePage = new JPanel();
//		gamePage.setBackground(Color.WHITE);
//		gamePage.setLayout(new BorderLayout());
//		
//		JLabel titleSummary = new JLabel("<html>Let's see how much you know about the environment!</html>");
//		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
//		titleSummary.setForeground(Color.BLACK);
//		titleSummary.setHorizontalAlignment(JLabel.CENTER);
//		
//		
//		
//		
//		
////		JLabel titleSummary = new JLabel("<html><head><title>For Educators: </title><head>"
////				+ "<body><p></p><p></p>"
////				+ "<p>For Educators: </p>"
////				+ "<p>The purpose of this game is to teach middle</p>"
////				+ "<p>school students about climate change and how</p>"
////				+ "<p>their own actions contribute to the earth's</p> "
////				+ "<p>overall global warming. We hope that this game</p> "
////				+ "<p>encourages teachers to continue to teach about</p>"
////				+ "<p>global warming, as well as inform students about</p>"
////				+ "<p>what actions that they can take to help reduce</p>"
////				+ "<p>CO2 emissions and global warming.</p></body></html>");
////		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 28));
////		titleSummary.setForeground(Color.BLACK);
////		titleSummary.setHorizontalAlignment(JLabel.CENTER);
////		titleSummary.setVerticalAlignment(JLabel.CENTER);
//
//		
//		
//		
//		//button to progress to game
//		openGameButtonPanel = new JPanel();
//		openGameButtonPanel.setBackground(Color.WHITE);
//		openGameButton = new JButton("Start!");
//		openGameButton.setFont(new Font("Helvetica", Font.BOLD, 16));
//		openGameButton.addActionListener(new openQuizButtonListener());
//		openGameButtonPanel.add(openGameButton);
//		
//		gamePage.add(titleSummary, BorderLayout.CENTER);
//		gamePage.add(openGameButtonPanel, BorderLayout.SOUTH);
//		
//		add(gamePage);
//		
//		validate();
//		repaint();
//		
//		//newQuestion();
//		
//		
//	}
//	
//	public void newQuestion() {
//		
//		gamePage = new JPanel();
//		gamePage.setBackground(Color.WHITE);
//		gamePage.setLayout(new BorderLayout());
//		
//		JLabel titleSummary = new JLabel("<html>Let's see what you know!</html>");
//		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
//		titleSummary.setForeground(Color.BLACK);
//		titleSummary.setHorizontalAlignment(JLabel.CENTER);
//		
//		
//		
//		
//		
////		JLabel titleSummary = new JLabel("<html><head><title>For Educators: </title><head>"
////				+ "<body><p></p><p></p>"
////				+ "<p>For Educators: </p>"
////				+ "<p>The purpose of this game is to teach middle</p>"
////				+ "<p>school students about climate change and how</p>"
////				+ "<p>their own actions contribute to the earth's</p> "
////				+ "<p>overall global warming. We hope that this game</p> "
////				+ "<p>encourages teachers to continue to teach about</p>"
////				+ "<p>global warming, as well as inform students about</p>"
////				+ "<p>what actions that they can take to help reduce</p>"
////				+ "<p>CO2 emissions and global warming.</p></body></html>");
////		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 28));
////		titleSummary.setForeground(Color.BLACK);
////		titleSummary.setHorizontalAlignment(JLabel.CENTER);
////		titleSummary.setVerticalAlignment(JLabel.CENTER);
//
//		String question = multipleChoice[questionCounter][0];
//		
//		
//		//button to progress to game
//		openGameButtonPanel = new JPanel();
//		openGameButtonPanel.setBackground(Color.WHITE);
//		openGameButton = new JButton("Start!");
//		openGameButton.setFont(new Font("Helvetica", Font.BOLD, 16));
//		openGameButton.addActionListener(new openQuizButtonListener());
//		openGameButtonPanel.add(openGameButton);
//		
//		gamePage.add(titleSummary, BorderLayout.CENTER);
//		gamePage.add(openGameButtonPanel, BorderLayout.SOUTH);
//		
//		add(gamePage);
//		
//		
//		questionCounter++; // increment questionCounter so we know which is the next question to display
//		
//		
//		validate();
//		repaint();
//
//		
//	}
//	
//public int calculateGameDifficulty() {
//		
//		int sum = 0;
//		
//		// question 1
//		if (answers[0] == 1) { // meat
//			
//			sum += 4; 
//			
//		} else if (answers[0] == 2) { // vegetarian
//			
//			sum += 1;
//			
//		}
//		
//		// question 2
//		if (answers[1] == 2) { // 1-5 hours spent in cars every week
//			
//			sum += 3;
//			
//		} else if (answers[1] == 3) { // 6-10 hours spent in cars every week
//			
//			sum += 6;
//			
//		} else if (answers[1] == 4) { // 10+ hours spent in cars every week
//			
//			sum += 9;
//			
//		}
//		
//		// question 3
//		if (answers[2] == 2) { // 1-3 hours public transportation every week
//			
//			sum += 1;
//			
//		} else if (answers[2] == 3) { // 4-7 hours public transportation every week
//			
//			sum += 2;
//			
//		} else if (answers[2] == 4) { // 8-10 hours public transportation every week
//			
//			sum += 3;
//			
//		} else if (answers[2] == 5) { // 10+ hours public transportation every week
//			
//			sum += 4;
//			
//		}
//		
//		// question 4
//		if (answers[3] == 2) { // 60-66 degrees
//			
//			sum += 1;
//			
//		} else if (answers[3] == 3) { // 67-70 degrees
//			
//			sum += 3;
//			
//		} else if (answers[3] == 4) { // 71+ degrees
//			
//			sum += 5;
//			
//		}
//		
//		// question 5
//		if (answers[4] == 2) { // don't turn off lights
//			
//			sum += 4;
//			
//		}
//		
//		// question 6
//		if (answers[5] == 2) { // don't turn off appliances
//			
//			sum += 2;
//			
//		}
//		
//		// question 7
//		if (answers[6] == 2) { // don't recycle cans
//			
//			sum += 3;
//			
//		}
//		
//		// question 8
//		if (answers[7] == 2) { // don't recycle glass
//			
//			sum += 3;
//			
//		}
//		
//		// question 9
//		if (answers[8] == 2) { // don't recycle plastic
//			
//			sum += 5;
//			
//		}
//		
//		// question 10
//		if (answers[9] == 1) { // no water bottles
//			
//			sum += 1;
//			
//		} else if (answers[9] == 2) { // disposable plastic bottles
//			
//			sum += 5;
//			
//		}
//		
//		// question 11
//		if (answers[10] == 1) { // leave water running when brushing teeth
//			
//			sum += 3;
//			
//		}
//		
//		return sum;
//	}
//	
//	
//
//}
