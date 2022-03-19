package inClassTesting;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		// Andrew Shapiro
		// tax values
		final double STATESALESTAX  = .04;
		final double COUNTYSALESTAX = .02;
		
		Scanner keyboard = new Scanner(System.in); //new scanner object
		
		System.out.print("Please enter the subtotal of your purchase: ");
		
		double subtotal = keyboard.nextDouble(); // getting subtotal value
		
		// tax/total calculations
		double itemStateTax  = (subtotal * STATESALESTAX); 
		double itemCountyTax = (subtotal * COUNTYSALESTAX);
		double total		 = (subtotal + itemStateTax + itemCountyTax);
		
		//decimal formatter
		DecimalFormat df = new DecimalFormat(".00");
		
		//output statements
		System.out.println("Subtotal    : $" + df.format(subtotal)      + "\n" +
							"State tax   : $" + df.format(itemStateTax)  + "\n" +
							"County tax  : $" + df.format(itemCountyTax) + "\n" +
							"Sales total : $" + df.format(total));
	}

}
