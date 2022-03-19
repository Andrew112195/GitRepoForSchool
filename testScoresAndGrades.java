package ProgPack2;
import java.util.Scanner;
public record testScoresAndGrades() {

	public static void main(String[] args) {
		//Andrew Shapiro
		
		Scanner keyboard = new Scanner(System.in); //Initialize scanner 
		
		//Getting three test scores
		System.out.println("Please enter three test scores to average: ");
		int test1 = keyboard.nextInt();
		int test2 = keyboard.nextInt();
		int test3 = keyboard.nextInt();
		
		int averageScore = ((test1 + test2 + test3) / 3); // formula for average
		
		//Conditional letter grade assigner
		char gradeLetter = 'A';
		if (averageScore < 60) {
			gradeLetter = 'F';
		}
		else if (averageScore >= 60 && averageScore <= 69 ) {
			gradeLetter = 'D';
		}
		else if (averageScore >= 70 && averageScore <= 79 ) {
			gradeLetter = 'C';
		}
		else if (averageScore >= 80 && averageScore <= 89 ) {
			gradeLetter = 'B';
		}
		else if (averageScore >= 90 && averageScore <= 100 ) {
			gradeLetter = 'A';
		}
		
		// inputted scores
		System.out.println("The test scores provided are listed below. \n"
				 + test1  +  "\n"
			     + test2  +  "\n"
			     + test3);
		
		
		// calculated total and letter / outputs
		System.out.println("The final average of the three scores is " + averageScore);
		System.out.println("You recieved a(n) " + gradeLetter);
		if(gradeLetter == 'F' || gradeLetter == 'D' || gradeLetter == 'C') {
			System.out.println("Try harder next time!!");
		}
		else {
			System.out.println("Good Job!!");
		}
		
		keyboard.close();
	}

}

	