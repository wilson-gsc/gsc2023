package comprog12.midterm.loops;

import java.util.Scanner;
/**
 * Submitted by: Wilson A. Gayo
 * Prompt user for the size; and print Square pattern
 */
public class PrintSquarePattern {
   public static void main (String[] args) {
      // Declare variables
      final int SIZE;    // size of the pattern to be input

      // Prompt user for the size and read input as "int"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the size: ");
      SIZE = in.nextInt();
      in.close();

      // Use nested-loop to print a 2D pattern
      // Outer loop to print ALL the rows
      for (int row = 1; row <= SIZE; row++) {
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
