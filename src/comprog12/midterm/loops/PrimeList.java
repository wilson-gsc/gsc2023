package comprog12.midterm.loops;

/**
 * Submitted by: Wilson A. Gayo
 * List all prime numbers between 2 and an upperbound
 */
public class PrimeList {
   public static void main(String[] args) {
	  System.out.println("PrimeList continue\n");
//      final int UPPERBOUND = 100;
//      for (int number = 2; number <= UPPERBOUND; ++number) {
//         // Not prime, if there is a factor between 2 and sqrt of number
//         int maxFactor = (int)Math.sqrt(number);
//         boolean isPrime = true;
//         int factor = 2;
//         while (isPrime && factor <= maxFactor) {
//            if (number % factor == 0) {   // Factor of number?
//                isPrime = false;
//            }
//            ++factor;
//         }
//         if (isPrime) System.out.println(number + " is a prime");
//      }
	  // Sum 1 to upperbound, exclude 11, 22, 33,...
	  final int UPPERBOUND = 100;
	  int sum = 0;
	  for (int number = 1; number <= UPPERBOUND; ++number) {
	     if (number % 11 == 0) {
	    	 System.out.println("excluded " + number);
	    	 continue;  // Skip the rest of the loop body, continue to the next iteration
	     }
	     sum += number;
	  }

	  // It is better to re-write the loop as:
	  for (int number = 1; number <= UPPERBOUND; ++number) {
	     if (number % 11 != 0) sum += number;
	  }
	  System.out.println("\nSum is " + sum);
      System.out.println("\nDate Submitted: March 4, 2024");
   }
}
