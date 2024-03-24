package comprog12.midterm.loops;

import java.util.Scanner;
/**
 * Submitted by: Wilson A. Gayo
 * Prompt user for the size; and print Checker pattern
 */
public class PrintCheckerPattern {
	public static void main (String[] args) {
		final int SIZE;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size: ");
		SIZE = in.nextInt();
		in.close();
		
		for (int row = 1; row <= SIZE; row++) {
			if ((row % 2) == 0) {   // print a leading space for even-numbered rows
				System.out.print(" ");
			}
			// Inner loop to print ALL the columns of EACH row
			for (int col = 1; col <= SIZE; col++) {
				System.out.print("* ");
			}
			// Print a newline after all the columns
			System.out.println();
		}
		System.out.println("Date Submitted: March 4, 2024");
	}
}
