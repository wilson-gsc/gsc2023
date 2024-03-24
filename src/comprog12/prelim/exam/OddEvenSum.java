package comprog12.prelim.exam;

/*
 * Sum the odd numbers and the even numbers from a lowerbound to an upperbound
 */
public class OddEvenSum {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 10;
      int sumOdd  = 0;    // For accumulating odd numbers, init to 0
      int sumEven = 0;    // For accumulating even numbers, init to 0
      int number = LOWERBOUND;
      
//      while (number <= UPPERBOUND) {
//    	  if (number % 2 == 0) {
//    		  sumEven += number;
//    	  } else { 
//    		  sumOdd += number;
//    	  }
//    	  ++number;
//      } 
//
      do {
    	  if (number % 2 == 0) {  
    		  sumEven += number;   
    	  } else {                
    		  sumOdd += number;    
    	  }
    	  ++number;  
      } while (number <= UPPERBOUND);
      
      for (int num = 0 ;num <= UPPERBOUND; ++num ) {
    	  if (num % 2 == 0) {  
    		  sumEven += num;   
    	  } else {                
    		  sumOdd += num;
    	  }
      }
      
      // Print the result
      System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
      System.out.println("The sum of even numbers from " + LOWERBOUND + " to " + UPPERBOUND + "  is " + sumEven);
      System.out.println("The difference between the two sums is " + (sumOdd - sumEven));
   }
}  