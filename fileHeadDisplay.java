package ProgPack3;
import java.util.Scanner;
import java.io.*;
public class fileHeadDisplay {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner keyboard = new Scanner(System.in);				//initialize keyboard
		
		System.out.println("Please enter the name of the text file.");
		String fileName = keyboard.nextLine();					//gets user input of file
		
		File file = new File(fileName);							//adds file
		Scanner read = new Scanner(file);						//scans file
		
		int i = 0;												//one of the loop condition variables
		
		while(read.hasNext() == true && i < 5) {                 //checks if file has line and makes sure not to print over 5
		    String line = read.nextLine();						//reads line
			System.out.println(line);							//outputs line
			++i;												//increments i to loop max 5 times
		}
		
			keyboard.close();
			read.close();
	
}
}
