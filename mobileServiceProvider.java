package ProgPack2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class mobileServiceProvider {

	public static void main(String[] args) {
		// Andrew Shapiro
		System.out.println("Thank you for your continued service!!");
		
		//initialize scanner/ input variables
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Which package was chosen \n A, B, or C..");
		char mobilePlan = keyboard.next().charAt(0);
		
		System.out.println("How many minutes were used this period?");
		int minutesUsed = keyboard.nextInt();
		
		//initialize plan base / minutes / minute overage rate
		int minuteLimit = 0;
		double baseRate = 0.0;
		double minutesOverage = 0.0;
		
		//Switch cases
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
		
		//cost calculation
		double overageCost = 0;
		if (minutesUsed > minuteLimit) {
			overageCost = ((minutesUsed - minuteLimit) * minutesOverage);
		}
		double finalBill = baseRate + overageCost;
		
		//decimal formatting
		DecimalFormat df = new DecimalFormat("00.00");
		
		//outputting
		System.out.println("Package " + mobilePlan + " rate\t\t\t  :$" + df.format(baseRate));
		System.out.println("Cost of overages (if applicable)  :$" + df.format(overageCost));
		System.out.println("Final charges due                 :$" + df.format(finalBill));
		
		keyboard.close();
		
		}
		
		
		
		

	}


