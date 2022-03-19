package ProgPack3;

import java.util.Random;
import java.util.Scanner;

public class randNumGuessingGame {

	public static void main(String[] args) {
		//greeting prompt
		System.out.println("Hello, would you like to play a game?");
		System.out.println("I will choose a number from 1 to 1000, Please take a guess at what number I have chosen");
		//scanner/ random initialize and guess
		Scanner keyboard = new Scanner(System.in);
		Random rando = new Random();
		
		int cpuRandom = rando.nextInt(1000 + 1); 	//gets pseudo-random int from 1 to 1000
		
		boolean correctGuess = false;				//boolean condition used to continue/break loop
		
		int attempts = 0;							//initialize attempts
		while(correctGuess == false){
			
			int playerGuess = keyboard.nextInt();   //gets input from user
			
			attempts++;								//incremented attempt counter
			
			if(playerGuess < cpuRandom) {	
				System.out.println("Too low please try again.");
			}
			else if(playerGuess > cpuRandom) {
				System.out.println("Too high please try again.");
			}
			else if(playerGuess == cpuRandom){
				correctGuess = true;
				System.out.println("Good job!! It took you " + attempts + " attempts.");
			}
		}
		keyboard.close();
		

	}
}
