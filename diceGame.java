package ProgPack3;

import java.util.Scanner;

import java.util.Random;

public class diceGame {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);   // Scanner initialize
		
		Random random = new Random(); 				 //pseudo-random initialize
		
		int cpuRoll, playerRoll, cpuWins = 0, playerWins = 0;   // random roll/ win initialize
		
		for(int i = 0; i < 10; ++i) {
			
			System.out.println("Press the enter key to roll your dice.");
			keyboard.nextLine(); 							// waits for enter
		
			cpuRoll = random.nextInt(6) + 1;				//cpu / player roll
			playerRoll = random.nextInt(6) + 1;
		
			System.out.println("The CPU rolled a " + cpuRoll);		//output random
			System.out.println("You rolled a " + playerRoll);
																	//conditional round win statements
			if(cpuRoll > playerRoll){
				++cpuWins;
				System.out.println("CPU won this round. Sorry!! ");
			}
			else if(cpuRoll < playerRoll){
				++playerWins;
				System.out.println("You won this round. Good Job!! ");
			}
			else if(cpuRoll == playerRoll) {
				System.out.println("You tied!!");
			}
																		// round win total updates
			System.out.println("CPU: " + cpuWins);
			System.out.println("You: " + playerWins + '\n');
		}
																		// conditional win statements
		if(cpuWins > playerWins){
			System.out.println("CPU won the game. Better luck next time!! ");
		}
		else if(cpuWins < playerWins){
			System.out.println("You won the game. Good Job!! ");
		}
		else if(cpuWins == playerWins) {
			System.out.println("You tied. Better luck next time");
		}

		keyboard.close();
}
}