package inClassTesting;

import java.text.DecimalFormat;

public class fahrenheitToCelsius {

	
	public static void main(String[] args) {
		
		double f;
		
		double c = 0;
		
		for(int i = 0; i <= 20; ++i) {
			f = i;
			fToCelsius(f);
			
		}
		
		
	}
	
	public static void fToCelsius(double f) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double c = (f - 32) * (5.0 / 9.0);
		
		System.out.println("Fahrenheit: " + f  + "      celsius: " + df.format(c));
		
	}	

}
