package ProgPack2;

import java.util.Scanner;

public class WIFIDiagnosticTree {
	static Scanner input = new Scanner(System.in); // scanner init
	static char response;                          // global response variable
	public static void exitIfY(char response) {
		System.out.println("Did that fix the Problem?"); 
		
		response = input.next().charAt(0); //gets first letter from response into char.
											// allows user to type in full strings or just first letter.
		if(response == 'y' || response == 'Y') {
			System.exit(0);                // exits program
		}
		else if(response != 'n' || response != 'n') {
			System.out.println("Wrong input lets assume it is no...");
		}
	}
												//main method
	public static void main(String[] args) {
		
		System.out.println("Having trouble with your WI-FI connection?"); // welcome message
		
		System.out.println("Reboot the computer and try to connect.");
		exitIfY(response);											// calls response method to exit on Y or y
		
		System.out.println("Reboot the router and try to connect.");
		exitIfY(response);
		
		System.out.println("Make sure the cables between the router & modem are plugged in firmly.");
		exitIfY(response);
		
		System.out.println("Move the router to a new location and try to connect.");
		exitIfY(response);
		
		System.out.println("Get a new router");
		
		input.close();
	}

}
