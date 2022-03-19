package ProgPack2;
import java.util.Scanner;
public class shippingCharges {

	public static void main(String[] args) {
		// Andrew Shapiro
		//Scanner initialize
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Fast Freight Shipping Company provides four shipping rates. "
				+ "\nPlease input the weight of your package and distance in miles "
				+ "\nto recieve the final shipping rate.");
		
		//User inputs
		System.out.println("What is the weight of the package rounded to the nearest pound?");
		int packageWeight = keyboard.nextInt();
		
		System.out.println("How far is the package traveling rounded to the nearest mile?");
		int packageMiles = keyboard.nextInt();
		
		//rate processing
		double baseRate = 0;
		if (packageWeight <= 2){
			baseRate = 1.10;
		}
		else if (packageWeight > 2 && packageWeight <= 6) {
			baseRate = 2.20;
		}
		else if (packageWeight > 6 && packageWeight <= 10) {
			baseRate = 3.70;
		}
		else if (packageWeight > 10) {
			baseRate = 3.80;
		}
		//500 mile charges
		double rateMultiplier = 0;
		final double DISTANCE_RATE = 500.0;
		rateMultiplier = Math.ceil(packageMiles / DISTANCE_RATE);
		
		//final rate
		double finalRate = baseRate * rateMultiplier;
		
		//output
		System.out.printf("Your total shipping costs for your requested item will be $%.2f"
				, finalRate);
		
		keyboard.close();
		
	}

}
