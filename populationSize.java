package ProgPack3;

import java.util.Scanner;


public class populationSize {

	public static void main(String[] args) {
		//initialize scanner and future inputs
		Scanner keyboard = new Scanner(System.in);
		int startingPopulation, growingDays;
		float percentageIncrease;
		//getting variable values
		do {
			System.out.println("How many organisms are we going to start the growing process? \n"
					+ 		   "Starting amount must be greater than two.");
			startingPopulation = keyboard.nextInt();
		} while(startingPopulation < 2);
		
		
		do {
			System.out.println("What is the daily growth percentage expected? \n"
					+		   "Percent written as positive rounded whole number.");
			percentageIncrease = keyboard.nextFloat();
		} while(percentageIncrease < 0);
		
		
		do {
			System.out.println("How many days are we conducting this estimation? \n"
					+          "Must be more than one day.");
			growingDays = keyboard.nextInt();
		} while(growingDays < 1);
		
		// processing values
		float iteratedPopulation = startingPopulation;								 //will be the population for each day iterated by the loop
		float percentageIncreaseDecimal = percentageIncrease / 100;                  //puts it in proper percentage formatting
		
		for(int i = 0; i <= growingDays; ++ i) {
			if(i != 0) { 
				float increaseByDay = iteratedPopulation * percentageIncreaseDecimal;     //will process the amount of organisms spawned each day past
				iteratedPopulation += increaseByDay;									  //adds the increased spawned organisms to the iterated total
			}
			System.out.println("On day " + i + " there are " + Math.round(iteratedPopulation) + " organisms.");  // final output rounds to nearest place because organisms
		}
			
		keyboard.close();
	}

}
