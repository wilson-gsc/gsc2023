package comprog12.midterm.loops.boxpattern;

import java.util.Scanner;
/**
 * Submitted by: Wilson A. Gayo
 * Prompt user for the size; and print Box Pattern
 */
public class BoxPattern {
//	public static void main (String[] args) {
//		// Declare variables
//		final int SIZE;    // size of the pattern to be input
//
//		// Prompt user for the size and read input as "int"
//		Scanner in = new Scanner(System.in);
//		System.out.println("Box Pattern");
//		System.out.print("Enter the size: ");
//		SIZE = in.nextInt();
//		in.close();
//		System.out.println();
//		
//		if(SIZE <= 0) {
//			System.out.println("This require a positive or greater than zero integer!!!");
//		} else {
//			// Outer loop to print each of the rows
//			for (int row = 1; row <= SIZE; row++) {  // row = 1, 2, 3, ..., size
//				// Inner loop to print each of the columns of a particular row
//				for (int col = 1; col <= SIZE; col++) {  // col = 1, 2, 3, ..., size
//					if (row == 1 || row == SIZE || row == col) {
//						System.out.print("# ");
//					} else {
//						System.out.print("  ");
//					}
//				}
//				// Print a newline after printing all the columns
//				System.out.println();
//			}
//		}
//		
//		System.out.println("\nDate Submitted: March 6, 2024");
//	}
	
	public static void main(String[] args){
		
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
		System.out.print(" #");
		for (int j = 2; j < size; j++) {
		if (i == 1 || i == size) {
		System.out.print("#");
		} else {
		System.out.print(" ");
		}
		}}
		System.out.println("#");
		while(true){
		if (size <= 0){
		System.out.println("this require a positive or greater than 0integer");
		break;
		}}
		System.out.println("Submitted on march 6 2024");
		
	}
}
