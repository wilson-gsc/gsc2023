package comprog12.midterm.loops;

/**
 * Submitted by: Wilson A. Gayo
 * List all non-prime numbers between 2 and an upperbound
 */
public class NonPrimeList {
   public static void main(String[] args) {
      final int UPPERBOUND = 100;
      for (int number = 2; number <= UPPERBOUND; ++number) {
         // Not a prime, if there is a factor between 2 and sqrt(number)
         int maxFactor = (int)Math.sqrt(number);
         for (int factor = 2; factor <= maxFactor; ++factor) {
            if (number % factor == 0) {   // Factor?
               System.out.println(number + " is NOT a prime");
               break;   // A factor found, no need to search for more factors
            }
         }
      }
      System.out.println("Date Submitted: March 4, 2024");
   }
}
