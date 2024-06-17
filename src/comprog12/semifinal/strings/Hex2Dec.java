package comprog12.semifinal.strings;

import java.util.Scanner;
/**
 * Prompt user for the hexadecimal string, and convert to its equivalent decimal number
 */
public class Hex2Dec {
   public static void main(String[] args) {
      // Declare variables
      String hexStr;   // The input hexadecimal String
      int hexStrLen;   // The length of hexStr
      int dec = 0;     // The decimal equivalent, to accumulate from 0

      // Prompt and Read input as "String"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Hexadecimal string: ");
      hexStr = in.next();
      hexStrLen = hexStr.length();
      in.close();

      // Process char by char from the left (most-significant digit)
      for (int charIdx = 0; charIdx < hexStrLen; ++charIdx) {
         char hexChar = hexStr.charAt(charIdx);
         int expFactor = (int)Math.pow(16, hexStrLen - 1 - charIdx);
         // 23 cases: '0'-'9', 'a'-'f', 'A'-'F', other (error)
         if (hexChar == '0') {
            // Valid but do nothing
         } else if (hexChar >= '1' && hexChar <= '9') {
            dec += (hexChar - '0') * expFactor;   // Convert char '0'-'9' to int 0-9
         } else if (hexChar >= 'a' && hexChar <= 'f') {
            dec += (hexChar - 'a' + 10) * expFactor;  // Convert char 'a'-'f' to int 10-15
         } else if (hexChar >= 'A' && hexChar <= 'F') {
            dec += (hexChar - 'A' + 10) * expFactor;  // Convert char 'A'-'F' to int 10-15
         } else {
            System.out.println("error: invalid hex string \"" + hexStr + "\"");
            return;   // or System.exit(1);
         }
      }
      System.out.println("The equivalent decimal for \"" + hexStr + "\" is " + dec);
   }
}
