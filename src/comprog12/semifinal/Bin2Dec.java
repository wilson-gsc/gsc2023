package comprog12.semifinal;

import java.util.Scanner;
/**
 * Prompt user for a binary string, and convert into its equivalent decimal number.
 */
public class Bin2Dec {
   public static void main(String[] args) {
      // Declare variables
      String binStr;  // The input binary string
      int binStrLen;  // The length of binStr
      int dec = 0;    // The decimal equivalent, to accumulate from 0
      char binChar;   // Each individual char of the binStr

      // Prompt and read input as "String"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a binary string: ");
      binStr = in.next();
      binStrLen = binStr.length();
      in.close();

      // Process char by char from the right (i.e. Least-significant bit)
      // using exponent as loop index.
      for (int exp = 0; exp < binStrLen ; ++exp) {
         binChar = binStr.charAt(binStrLen - 1 - exp);
         // 3 cases: '1' (add to dec), '0' (valid but do nothing), other (error)
         if (binChar == '1') {
            dec += (int)Math.pow(2, exp);  // cast the double result back to int
         } else if (binChar == '0') {
         } else {
            System.out.println("error: invalid binary string \"" + binStr + "\"");
            return;           // or System.exit(1);
         }
      }

      // Print result
      System.out.println("The equivalent decimal for \"" + binStr + "\" is " + dec);
   }
}
