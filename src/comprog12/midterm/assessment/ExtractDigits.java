package comprog12.midterm.assessment;

import java.util.Scanner;

public class ExtractDigits {
	public static void main (String[] args) {
		int input;
		String out = "";

		Scanner in = new Scanner(System.in);
		System.out.print("Enter first integer: "); 
		input = in.nextInt();
		in.close();
		
		while (input > 0) {
			int digit = input % 10;
			// Print this digit
			out = out + digit + " ";
			input = input / 10;  // Drop the least-significant digit and repeat the loop
		}

		// Display result
		System.out.println("Output: " + out);   // Print with newline
	}
}
