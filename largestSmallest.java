package inClassTesting;
import java.util.Scanner;

public class largestSmallest {

	public static void main(String[] args) {
		
		int userInput = 0;
		
		Scanner keyboard = new Scanner(System.in);
		userInput = keyboard.nextInt();
		int smallest = userInput;
		int largest = userInput;
		
		while(userInput != -99){
			userInput = keyboard.nextInt();
			
			if (userInput < smallest && userInput != -99) {
				smallest = userInput;
			    }
			
			if(userInput > largest) {
				largest = userInput;
			    }
			
		    }
			
		
		System.out.println("The smallest :" + smallest);
		System.out.println("The Largest  :" + largest);
	}
       
}
