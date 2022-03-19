package inClassTesting;
import java.util.Scanner;
import java.text.DecimalFormat;
public class softwareSales {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//get input on  purchase amount
		System.out.println("How many software packages was purchased?");
		int softwareAmount = keyboard.nextInt();
		// price/discount initializer
		final double SOFTWARE_PRICE = 99;
		double softwareDiscount = 0.0;  //software discount percent initialize
		
		//conditional discount getter
		if(softwareAmount > 9 && softwareAmount < 20) {
			softwareDiscount = .2;
		}
		else if(softwareAmount > 19 && softwareAmount < 50) {
			softwareDiscount = .3;
		}
		else if(softwareAmount > 49 && softwareAmount < 100) {
			softwareDiscount = .4;
		}
		else if(softwareAmount > 99) {
			softwareDiscount = .5;
		}
		DecimalFormat df = new DecimalFormat("00.00");
		DecimalFormat trunc = new DecimalFormat("0");
				//calculations
		double discountedPrice = (SOFTWARE_PRICE - (SOFTWARE_PRICE * softwareDiscount)) ;
		double finalPrice =(discountedPrice * softwareAmount);
				//output
		System.out.println("thank you for your purchase of " + softwareAmount + " products!!");
	    System.out.println("you recieved a discount of " + (trunc.format(softwareDiscount * 100)) + "%");
	    System.out.println("your final cost is $" + df.format(finalPrice));
	} 

}
