package comprog12.semifinal.methods;

import java.util.Scanner;
/**
 * This program contains a boolean method called isMagic(int number), which tests if the
 * given number contains the digit 8.
 */
public class MagicNumber {
   public static void main(String[] args) {
      // Declare variables
      int number;
      Scanner in = new Scanner(System.in);

      // Prompt and read input as "int"
      System.out.print("Enter a positive integer: ");
      number = in.nextInt();

      // Call isMagic() to test the input
      if (isMagic(number)) {
         System.out.println(number + " is a magic number");
      } else {
         System.out.println(number + " is not a magic number");
      }
      in.close();
   }

   /**
    * Check if the given int contains the digit 8, e.g., 18, 82, 1688.
    * @param  number The given integer
    * @return        true if number contains the digit 8
    * @Precondition  number > 0 (i.e., a positive integer)
    */
   public static boolean isMagic(int number) {
      boolean isMagic = false;   // shall change to true if found a digit 8

      // Extract and check each digit
      while (number > 0) {
         int digit = number % 10;   // Extract the last digit
         if (digit == 8) {
            isMagic = true;
            break;  // only need to find one digit 8
         }
         number /= 10;   // Drop the last digit and repeat
      }
      return isMagic;
   }
}
