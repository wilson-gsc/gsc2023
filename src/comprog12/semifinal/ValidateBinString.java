package comprog12.semifinal;

import java.util.Scanner;
/**
 * Check if the input string is a valid binary string.
 * Version 1: With a boolean flag
 */
public class ValidateBinString {
   public static void main(String[] args) {
      // Declare variables
      String inStr;     // The input string
      int inStrLen;     // The length of the input string
      char inChar;      // Each char of the input string
      boolean isValid;  // "is" or "is not" a valid binary string?

      // Prompt and read input as "String"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a binary string: ");
      inStr = in.next();
      inStrLen = inStr.length();
      in.close();

      isValid = true;  // Assume that the input is valid, unless our check fails
      for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {
         inChar = inStr.charAt(inCharIdx);
         if (!(inChar == '0' || inChar == '1')) {
            isValid = false;
            break;  // break the loop upon first error, no need to continue for more errors
                    // If this is not encountered, isValid remains true after the loop.
         }
      }
      System.out.println("\"" + inStr + "\" is " + (isValid ? "" : "NOT ") + "a binary string");
   }
}