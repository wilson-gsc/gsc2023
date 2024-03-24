package comprog12.midterm.assessment;

import java.util.Scanner;
/**
 * Submitted by: Wilson A. Gayo
 * Prompt user for the size; and print Box Pattern
 */
public class ZPattern {
	public static void main (String[] args) {
		// Declare variables
		final int SIZE;    // size of the pattern to be input

		// Prompt user for the size and read input as "int"
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size: ");
		SIZE = in.nextInt();
		in.close();
		System.out.println();
		
		if(SIZE <= 0) {
			System.out.println("This require a positive or greater than zero integer!!!");
		} else {
			for (int row = 1; row <= SIZE; row++) {  // row = 1, 2, 3, ..., size
				// Inner loop to print each of the columns of a particular row
				for (int col = 1; col <= SIZE; col++) {  // col = 1, 2, 3, ..., size
					if (row == 1 || row == SIZE || 
							row == col ||row == SIZE - col + 1) {
						System.out.print("# ");
					} else {
						System.out.print("  ");
					}
				}
				// Print a newline after printing all the columns
				System.out.println();
			}
		}
	}
}
