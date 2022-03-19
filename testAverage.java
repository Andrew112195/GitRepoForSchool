package inClassTesting;

import java.util.Scanner;

public class testAverage {

	public static void main(String[] args) {
		//Andrew Shapiro
		
		Scanner keyboard = new Scanner(System.in); //Initialize scanner 
		
		//Getting three test scores
		System.out.println("Please enter three test scores to average: ");
		int test1 = keyboard.nextInt();
		int test2 = keyboard.nextInt();
		int test3 = keyboard.nextInt();
		
		int averageScore = ((test1 + test2 + test3) / 3); // formula for average
		
		// inputted scores
		System.out.println("The test scores provided are listed below. \n"
				 + test1  +  "\n"
			     + test2  +  "\n"
			     + test3);
		
		// calculated total
		System.out.println("The final average of the three scores is: " + averageScore);
		
	}

}
