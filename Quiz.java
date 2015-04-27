//package javaQuizTest;

import java.util.Scanner;

import javax.swing.JPanel;

public class Quiz extends JPanel{

	private static int questionNumb = 0;
	private static int answer = 1;
	private static int start = 2;
	
	
	String introduction = "This short quiz tests to see how much\n"
			+ "you know about the environment!";
	
	static String[][] multipleChoice = new String[][]{
		{"1. What are greenhouse gases?", "A", "A. Gases that trap heat above the earth", 
			"B. Gases that are made by plants growing in greenhouses", "C. Gases used to heat greenhouses so they "
					+ "are warm enough for plants to grow"},
		{"2. Which of the following is NOT a greenhouse gas?", "B", "A. Methane", "B. Oxygen", "C. Carbon dioxide"}, 
		{"3. Which country currently emits the most greenhouse gases?", "C", "A. United States", "B. India", "C. China"},
		{"4. What is the name for a scientist that studies the weather and climate?", "A", "A. Meteorologist", "B. Climatist", "C. Biologists"},
		{"5. Which of the following methods of transportation does NOT contribute to climate change?", "C", "A. Driving a car", "B. Taking the bus", "C. Riding your bicycle"},
		{"6. What type of supermarket bag is more ecofriendly, paper or plastic?", "C", "A. Paper", "B. Plastic", "C. Both hurt the environment"},
		{"7. What is happening to the sea level due to global warming?", "C", "A. The ocean will expand as it gets warmer.", "B. Glaciers and ice-sheet will melt", "C. Both will occur."},
		{"8. Which of the following activites is NOT ecofriendly for the climate?", "B", "A. Using incandescent lightbulbs", "B. Leaving the water running while you brush your teeth", "C. Using a reusable shopping bag when"
				+ "going to the grocery store"},
		{"9. "},
		{"10. "}
	};
	
	static public void printQuestion(int ndx){
		System.out.println(multipleChoice[ndx][questionNumb]);
		int lastColumn = multipleChoice[ndx].length;
		for (int x = start; x < lastColumn; x++){
			System.out.println("\t" + multipleChoice[ndx][x]);
		}
	}
	
//	public void display()
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		for (int x = 0; x < multipleChoice.length;  x++){
			printQuestion(x);
			do{
				System.out.print("\nYour Answer [A - C]: ");
			}while (!isAnswerCorrect(x, userInput.next().charAt(0)));
		}
	}

	private static boolean isAnswerCorrect(int x, char userAnswer) {
		// TODO Auto-generated method stub
		boolean correctAnswer = (userAnswer + "").equalsIgnoreCase(multipleChoice[x][answer]);
		if (correctAnswer){
			System.out.println("Correct!\n");
		}
		else
			System.out.println("Incorrect!\n");
		return correctAnswer;
	}
}
