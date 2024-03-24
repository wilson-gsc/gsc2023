package comprog12.midterm.loops;

/**
 * Submitted by: Wilson A. Gayo
 * A mystery series created using break and continue
 */
public class MysterySeries {
   public static void main(String[] args) {
      int number = 1;
      while(true) {
         ++number;
         if ((number % 3) == 0) continue;
         if (number == 133) break;
         if ((number % 2) == 0) {
            number += 3;
         } else {
            number -= 3;
         }
         System.out.print(number + " ");
      }
   }
}
// Can you figure out the output?
// break and continue are hard to read, use it with great care!
