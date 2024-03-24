package comprog12.midterm.assessment;

import java.util.Scanner;

public class SumOfDigitsInt {
	public static void main(String[] args) {
		int inNumber, total = 0;   // to be input
		int inDigit;    // each digit
		
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a positive integer: ");
		inNumber = in.nextInt();
		in.close();
		
		// Extract and drop the "last" digit repeatably using a while-loop with modulus/divide operations
		while (inNumber > 0) {
			inDigit = inNumber % 10; // extract the "last" digit
			// Print this digit (which is extracted in reverse order)
			total += inDigit;
			inNumber /= 10;          // drop "last" digit and repeat
		}
		System.out.println("The sum of all digit is: " + total);
	}

}
