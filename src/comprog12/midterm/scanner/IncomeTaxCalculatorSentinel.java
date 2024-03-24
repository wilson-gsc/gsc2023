package comprog12.midterm.scanner;

import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for the taxable income in integer.
 * 2. Read input as "int".
 * 3. Compute the tax payable using nested-if in "double".
 * 4. Print the values rounded to 2 decimal places.
 * 5. Repeat until user enter -1.
 */
public class IncomeTaxCalculatorSentinel {
   public static void main(String[] args) {
      // Declare constants first (variables may use these constants)
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;
      final int SENTINEL = -1;    // Terminating value for input

      // Declare variables
      int taxableIncome;
      double taxPayable;

      Scanner in = new Scanner(System.in);
      // Read the first input to "seed" the while loop
      System.out.print("Enter the taxable income: $");
      taxableIncome = in.nextInt();

      while (taxableIncome != SENTINEL) {
         // Compute tax payable in "double" using a nested-if to handle 4 cases
         if (taxableIncome > 60000) {
            taxPayable = 20000 * TAX_RATE_ABOVE_20K
                         + 20000 * TAX_RATE_ABOVE_40K
                         + (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
         } else if (taxableIncome > 40000) {
            taxPayable = 20000 * TAX_RATE_ABOVE_20K
                         + (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
         } else if (taxableIncome > 20000) {
            taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
         } else {
            taxPayable = 0;
         }

         // Print result rounded to 2 decimal places
         System.out.printf("The income tax payable is: $%.2f%n", taxPayable);

         // Read the next input
         System.out.print("Enter the taxable income: $");
         taxableIncome = in.nextInt();
         // Repeat the loop body, only if the input is not the SENTINEL value.
         // Take note that you need to repeat these two statements inside/outside the loop!
      }
      System.out.println("bye!");
      in.close();  // Close Scanner
   }
}
