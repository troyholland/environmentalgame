
public class WelcomeScreen {

	
	public int calculateGameDifficulty(int[] answers) {
		
		int sum = 0;
		
		// question 1
		if (answers[0] == 1) { // meat
			
			sum += 4; 
			
		} else if (answers[0] == 2) { // vegetarian
			
			sum += 1;
			
		}
		
		// question 2
		if (answers[1] == 2) { // 1-5 hours spent in cars every week
			
			sum += 3;
			
		} else if (answers[1] == 3) { // 6-10 hours spent in cars every week
			
			sum += 6;
			
		} else if (answers[1] == 4) { // 10+ hours spent in cars every week
			
			sum += 9;
			
		}
		
		// question 3
		if (answers[2] == 2) { // 1-3 hours public transportation every week
			
			sum += 1;
			
		} else if (answers[2] == 3) { // 4-7 hours public transportation every week
			
			sum += 2;
			
		} else if (answers[2] == 4) { // 8-10 hours public transportation every week
			
			sum += 3;
			
		} else if (answers[2] == 5) { // 10+ hours public transportation every week
			
			sum += 4;
			
		}
		
		// question 4
		if (answers[3] == 2) { // 60-66 degrees
			
			sum += 1;
			
		} else if (answers[3] == 3) { // 67-70 degrees
			
			sum += 3;
			
		} else if (answers[3] == 4) { // 71+ degrees
			
			sum += 5;
			
		}
		
		// question 5
		if (answers[4] == 2) { // don't turn off lights
			
			sum += 4;
			
		}
		
		// question 6
		if (answers[5] == 2) { // don't turn off appliances
			
			sum += 2;
			
		}
		
		// question 7
		if (answers[6] == 2) { // don't recycle cans
			
			sum += 3;
			
		}
		
		// question 8
		if (answers[7] == 2) { // don't recycle glass
			
			sum += 3;
			
		}
		
		// question 9
		if (answers[8] == 2) { // don't recycle plastic
			
			sum += 5;
			
		}
		
		// question 10
		if (answers[9] == 1) { // no water bottles
			
			sum += 1;
			
		} else if (answers[9] == 2) { // disposable plastic bottles
			
			sum += 5;
			
		}
		
		// question 11
		if (answers[10] == 1) { // leave water running when brushing teeth
			
			sum += 3;
			
		}
		
		return sum;
	}
}
