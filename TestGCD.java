/*--------------------------------------------------------------------
Name: Andrew Shapiro
Student ID: 4000225501
COP 2805C - Java Programming 2
Summer / 2022
Assignment # 4
Plagiarism Statement
I certify that this assignment is my own work and that I have not copied in part or whole or otherwise plagiarized the work of other students and/or persons.
--------------------------------------------------------------------*/
import java.util.Scanner;

public class TestGCD {
/**
 * Method used to find GCD
 * passes x and y integers takes remainder value flips the values then compares it in recursion until divisible
 * @param x is inputed as integer 1
 * @param y is inputed as integer 2
 * @return returns the final GCD which gets assigned to y
 */
	static int getGCD(int x, int y) {
		if(x % y == 0) {
			return y;
		}
		else {
			return getGCD(y , x % y);
		}
	}
	public static void main(String[] args) {
		// scanner for input
		Scanner input = new Scanner(System.in);
		
		//prompts/inputs
		System.out.println("Please type in two integers two get their greatest common denominators.");
		System.out.println("Integer 1");
		int integer1 = input.nextInt();
		
		System.out.println("Integer 2");
		int integer2 = input.nextInt();
		//method call/ output
		System.out.println("GCD: " + getGCD(integer1, integer2));
		input.close();
	}

}
