package inClassTesting;

public class energyDrinkConsumption {

	public static void main(String[] args) {
		//Andrew Shapiro
		//Constant variables
		final long   SURVEYEDCUSTOMERS   = 12467;  //12,467 consumers surveyed 
		final double MULTIWEEKPERCENT    = .14;    //14 percent of customers enjoyed multiple a week
		final double CITRUSPERCENT       = .64;    //64 percent of customers prefer citrus flavors
		
		//arithmetic / conversion to int.
		long multiWeekConsumers = Math.round(SURVEYEDCUSTOMERS * MULTIWEEKPERCENT);
		long citrusPreferers    = Math.round(SURVEYEDCUSTOMERS * CITRUSPERCENT);
		
		
		//output statements
		System.out.printf("From the consumer base that we surveyed we determined that approxomitaly:     \n"
						+  multiWeekConsumers + " Consumers enjoyed our products at least once a week.   \n"
						+  citrusPreferers    + " Consumers enjoyed our citrus flavored drinks the most. \n"
						);
		
	}

}
