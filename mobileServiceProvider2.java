package ProgPack2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class mobileServiceProvider2 {
	// Andrew Shapiro
	
	//switch method variables
	static double minuteLimit = 0;
	static double baseRate = 0;
	static double minutesOverage = 0;
	
	//switch method
	public static void mobilePlan(char mobilePlan, int minutesUsed) {
		switch (mobilePlan){
		case 'a':
		case 'A':
			 minuteLimit = 450;
			 baseRate = 39.99;
			 minutesOverage = 0.45;
			break;
		case 'b':
		case 'B':
			minuteLimit = 900;
			baseRate = 59.99;
			minutesOverage = 0.40;
			break;
		case 'c':
		case 'C':
			minuteLimit = 43800; // 43800 minutes in a month. haha
			baseRate = 69.99;
			minutesOverage = 0;
			break;
		}
		
	}
	//bill calculations global variables
	static int minutesUsed = 0;
	static double overageCost = 0;
	static double finalBill = 0;
	
	//bill calculations method
	public static void billCalculations(char mobilePlan, int minutesUsed) {
		mobilePlan(mobilePlan, minutesUsed); 
		overageCost = 0;
		if (minutesUsed > minuteLimit) {
			overageCost = ((minutesUsed - minuteLimit) * minutesOverage);
		}
		 finalBill = baseRate + overageCost;
		
	}
	

	public static void main(String[] args) {
		System.out.println("Thank you for your continued service!!");
		
		//initialize scanner/ input variables
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Which package was chosen \nA, B, or C..");
		char mobilePlan = keyboard.next().charAt(0);
		
		System.out.println("How many minutes were used this period?");
		int minutesUsed = keyboard.nextInt();
		
		
		//calling cost calculation
		billCalculations(mobilePlan, minutesUsed);
		//decimal formatting
		DecimalFormat df = new DecimalFormat("00.00");
		
		// rates before comparison
		double originalRate = finalBill;
		
		//outputting
		System.out.println("Package " + mobilePlan + " rate\t\t\t  		:$" + df.format(baseRate));
		System.out.println("Cost of overages (if applicable)  		:$" + df.format(overageCost));
		System.out.println("Final charges due                 		:$" + df.format(originalRate));
		
		//plan comparison processing
		char bestPlan = 'A';   		// plan comparison variables
		double bestPlanCost = finalBill;
		for(char i = 'A' ; i <= 'C' ; i++ ) {	// for loop passing different plans
			mobilePlan = i;
			billCalculations(mobilePlan, minutesUsed); // calling switch and grabbing best plan value
			if( finalBill < bestPlanCost) {
				bestPlanCost = finalBill;
				bestPlan = i;
				
			}
		}
		// final outputting
		if(bestPlanCost != originalRate) {
			System.out.println("We would consider you switch to our " + bestPlan + " plan.");
			System.out.println("Plan " + bestPlan + " Would have been                          :$" + bestPlanCost);
			System.out.println("If you would have switched you could have saved :$" + df.format(originalRate - bestPlanCost));
		}
		else {
			System.out.println("You currently have the best price for your usage.");
		}
		keyboard.close();
		
	}
		
		

	}
