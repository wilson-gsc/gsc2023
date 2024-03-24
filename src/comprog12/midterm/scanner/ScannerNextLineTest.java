package comprog12.midterm.scanner;

/**
 * Test Scanner's nextLine()
 */
import java.util.Scanner;    // Needed to use the Scanner
public class ScannerNextLineTest {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a string (with space): ");
      // Use nextLine() to read entire line including white spaces, 
      //   but excluding the terminating newline.
      String str = in.nextLine();        
      in.close();
      System.out.printf("%s%n", str);
   }
}
