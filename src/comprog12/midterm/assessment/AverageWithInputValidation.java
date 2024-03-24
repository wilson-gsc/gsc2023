package comprog12.midterm.assessment;

import java.util.Scanner;

public class AverageWithInputValidation {
	public static void main(String[] args) {
		// Declare constant
		final int NUM_STUDENTS = 3;

		// Declare variables
		int numberIn;
		boolean isValid;   // boolean flag to control the input validation loop
		int sum = 0;
		double average;
		
		Scanner in = new Scanner(System.in);

		for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
			// Prompt user for mark with input validation
			do {
				System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = in.nextInt();
                isValid = (numberIn >= 0 && numberIn <= 100); // Check if the input is within the range
                if (!isValid) {
                    System.out.println("Invalid input, try again...");
                }
			} while (!isValid);

			sum += numberIn;
		}
		// Calculate average
        average = (double) sum / NUM_STUDENTS;

        // Print the result rounded to 2 decimal places
        System.out.printf("The average is: %.2f%n", average);

        // Close the scanner
        in.close();
	}

}
