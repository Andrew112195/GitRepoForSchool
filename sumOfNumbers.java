package ProgPack3;

import java.util.Scanner;

public class sumOfNumbers {

	public static void main(String[] args) {
	
		System.out.println("");
//Initialize scanner and input
	
		Scanner keyboard = new Scanner(System.in);
	
		int userInput;
	
// get positive input
	
		do{
			System.out.println("Please enter a number greater than zero to find the sum of the perceeding numbers.");
			
			userInput = keyboard.nextInt();			
// does not accept less than zero
		}while (userInput <= 0); 
	
// for loop adding values
	
		int sum = 0; // will be final value thru loop
	
		for (int i = 0; i <= userInput; ++i) {
			
			sum += i;
		}
		
		System.out.println("the total of all values before your sum: " + sum);
	
		keyboard.close();
}	
}