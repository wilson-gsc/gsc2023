package comprog12.midterm.assessment;

import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		// Declare variables
		int numberIn;      // to be input
		boolean isValid;   // boolean flag to control the loop
		
		Scanner in = new Scanner(System.in); 
		
		// Use a do-while loop controlled by a boolean flag 
		// to repeatably read the input until a valid input is entered
		isValid = false;   // default assuming input is not valid
		do {
			// Prompt and read input
			System.out.print("Enter a positive integer: ");
			numberIn = in.nextInt();

			// Validate input by setting the boolean flag accordingly
			if ((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100)) {
				isValid = true;   // exit the loop
				System.out.println("You have entered: " + numberIn);
				in.close();
			} else {
				System.out.println("Invalid input, try again...");  // Print error message and repeat
			}
		} while (!isValid);
	}

}
