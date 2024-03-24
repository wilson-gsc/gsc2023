package comprog12.midterm.assessment;

import java.util.Scanner;

public class NumberPatternA {
	public static void main(String[] args) {
		// Declare variables
		final int SIZE;    // size of the pattern to be input

		// Prompt user for the size and read input as "int"
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size: ");
		SIZE = in.nextInt();
		in.close();
		System.out.println();

		// Outer loop to print each of the rows
		for (int row = 1; row <= SIZE; row++) {  // row = 1, 2, 3, ..., size
			// Inner loop to print each of the columns of a particular row
			for (int col = 1; col <= SIZE; col++) {  // col = 1, 2, 3, ..., size
				if (row >= col) {
					System.out.print(""+col+" ");
				} else {
					System.out.print("  ");
				}
			}
			// Print a newline after printing all the columns
			System.out.println();
		}
	}

}
