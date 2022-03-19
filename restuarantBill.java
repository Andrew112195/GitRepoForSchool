package inClassTesting;

import java.text.DecimalFormat;
import java.util.Scanner;

public class restuarantBill {

	public static void main(String[] args) {
		// Andrew Shapiro
		// constant variables
		final double SALESTAX      = .0675;
		final double TIPPERCENTAGE = .2;
		
		// new scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please provide the subtotal of your dinner: ");
		
		// meal charge input
		double mealCharge = keyboard.nextDouble();
		
		// tip/tax/total arithmetic
		double mealTax   = (SALESTAX * mealCharge);
		double mealTip   = (TIPPERCENTAGE * mealCharge);
		double mealTotal = (mealTip + mealTax + mealCharge);
		
		//decimal formatter
		DecimalFormat df = new DecimalFormat(".00");
		
		//output statements
		System.out.println("Hope you enjoyed your dinner! \n" 
						+	"Subtotal        : $" + df.format(mealCharge) + "\n" 
						+   "6.75% sales tax : $" + df.format(mealTax)    + "\n"
						+   "20% tip         : $" + df.format(mealTip)    + "\n"
						+   "Total           : $" + df.format(mealTotal)  + "\n");
				

	}

}
