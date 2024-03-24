package comprog12.semifinal;

import java.util.Scanner;
/**
 * Prompt user for a string; and print the input string in reverse order.
 */
public class ReverseString {
   public static void main(String[] args) {
      // Declare variables
      String inStr;   // input String
      int inStrLen;   // length of the input String

      // Prompt and read input as "String"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a String: ");
      inStr = in.next();
      inStrLen = inStr.length();
      in.close();

      System.out.print("The reverse is: ");
      // Use a for-loop to extract each char in reverse order
      for (int inCharIdx = inStrLen - 1; inCharIdx >= 0; --inCharIdx) {
         System.out.print(inStr.charAt(inCharIdx));
      }
      System.out.println();
  }
}