package comprog12.semifinal.strings;

import java.util.Scanner;
/**
 * Check if the input string is a valid binary string.
 */
public class ValidateBinStringV2 {
   public static void main(String[] args) {
      // Declare variables
      String inStr;     // The input string
      int inStrLen;     // The length of the input string
      char inChar;      // Each char of the input string

      // Prompt and read input as "String"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a binary string: ");
      inStr = in.next();
      inStrLen = inStr.length();
      in.close();

      for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {
         inChar = inStr.charAt(inCharIdx);
         if (!(inChar == '0' || inChar == '1')) {
            System.out.println("\"" + inStr + "\" is NOT a binary string");
            return;  // exit the program upon the first error detected
         }
      }
      // for-loop completed. No error detected.
      System.out.println("\"" + inStr + "\" is a binary string");
   }
}
