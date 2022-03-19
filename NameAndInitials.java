package inClassTesting;

public class NameAndInitials {

	public static void main(String[] args) {
			
	// Initializing first/last/middle.
				
		String firstName  = "Andrew"; 
		String middleName = "Charles"; 
		String lastName   = "Shapiro"; 
				
	// getting char from first/last/middle strings.
				
		char firstInitial  = firstName.charAt(0);
		char middleInitial = middleName.charAt(0);
		char lastInitial   = lastName.charAt(0);
				
	// outputting names.
		System.out.println("First name  : " + firstName);
		System.out.println("Middle name : " + middleName);
		System.out.println("Last name   : " + lastName);
				
	// outputting initials.
		System.out.println("First initial  : " + firstInitial);
		System.out.println("Middle initial : " + middleInitial);
		System.out.println("Last initial   : " + lastInitial);
			}

		

	}


