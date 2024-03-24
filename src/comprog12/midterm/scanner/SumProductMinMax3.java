package comprog12.midterm.scanner;

import java.util.Scanner;

public class SumProductMinMax3 {
	public static void main (String[] args) {
		// Declare variables
		int number1, number2, number3;  // The 3 input integers
		int sum, product, min, max;     // To compute these

		// Prompt and read inputs as "int"
		Scanner in = new Scanner(System.in);  // Scan the keyboard
		System.out.print("Enter first integer: ");  // No newline for prompting message
	    number1 = in.nextInt();                     // Read next input as "int"
	    System.out.print("Enter second integer: ");
	    number2 = in.nextInt();
	    System.out.print("Enter third integer: ");
	    number3 = in.nextInt();
		in.close();
		
		// Compute sum and product
	    sum = number1 + number2 + number3;
	    product = number1 * number2 * number3;
	    
	    // Compute min
	    // The "coding pattern" for computing min is:
	    // 1. Set min to the first item
	    // 2. Compare current min with the second item and update min if second item is smaller
	    // 3. Repeat for the next item
	    min = number1;        // Assume min is the 1st item
	    if (number2 < min) {  // Check if the 2nd item is smaller than current min
	    	min = number2;     // Update min if so
	    }
	    if (number3 < min) {  // Continue for the next item
	    	min = number3;
	    }

	    // Compute max - similar to min
	    max = number1;
	    if (number2 > min) {  // Check if the 2nd item is smaller than current min
	    	max = number2;     // Update min if so
	    }
	    if (number3 > min) {  // Continue for the next item
	    	max = number3;
	    }

	    // Print results
	    System.out.println("The sum is: " + sum);   
	    System.out.println("The product is: " + product);   
	    System.out.println("The min is: " + min);   
	    System.out.println("The max is: " + max);   
	}
}
