package inClassTesting;
import java.util.Scanner;
import java.text.DecimalFormat;
public class bankCharges {

	public static void main(String[] args) {
		final double MONTHLY_FEE = 10.00;
		int checkAmount = 0;
		double checkPrice = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many checks did you write this month?");
		checkAmount = keyboard.nextInt();
		
		if(checkAmount < 20) {
			checkPrice = .10;
		}
		else if(checkAmount > 19 && checkAmount < 40) {
			checkPrice = .08;
		}		
		else if(checkAmount > 39 && checkAmount < 60) {
			checkPrice = .06;
		}
		else if(checkAmount > 60) {
			checkPrice = .04;
		}
		
		DecimalFormat df = new DecimalFormat(".00");
		double finalPrice = checkPrice + MONTHLY_FEE + (checkAmount * checkPrice);
		
		System.out.println("Thank you for your monthly service!!\n "
		+ 				   "Checks written :" + checkAmount );
		System.out.println("Cost per check  :$" + df.format(checkPrice)  );
		System.out.println("Monthly fee     :$" + df.format(MONTHLY_FEE) );
		System.out.println("Total           :$" + df.format(finalPrice));
	}
}