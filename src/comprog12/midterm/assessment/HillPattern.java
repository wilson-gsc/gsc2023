package comprog12.midterm.assessment;

import java.util.Scanner;

public class HillPattern {
	public static void main(String[] args) {
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
//			for (int row = 1; row <= SIZE; row++) {  // row = 1, 2, 3, ..., size
//				// Inner loop to print each of the columns of a particular row
//				for (int col = 1; col <= SIZE; col++) {  // col = 1, 2, 3, ..., size
//					if (row == 1 || row == SIZE || 
//							row == col ||row == SIZE - col + 1) {
//						System.out.print("# ");
//					} else {
//						System.out.print("  ");
//					}
//				}
//				// Print a newline after printing all the columns
//				System.out.println();
//			}
			
//			for (int row = 1; row <= SIZE; row++) {
//				// numCol = 2*numRows - 1
//				for (int col = 1; col <= SIZE; col++) {
//					if ((row + col >= SIZE + 1) && (row >= col - SIZE + 1)) {
//						System.out.print("# ");
//					} else {
//						System.out.print("  ");
//					}
//				}
//				System.out.println();
//			}
			
			for (int i = 1; i <= SIZE; i++) {
	            // Print spaces
	            for (int j = i; j < SIZE; j++) {
	                System.out.print("  ");
	            }
	            // Print #
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("# ");
	            }
	            System.out.println();
	        }
		}
	}

}
