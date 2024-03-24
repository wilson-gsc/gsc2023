package comprog12.prelim.loop;

public class RunningNumberProduct {  // Save as "RunningNumberProduct.java"
	public static void main(String[] args) {
		final int LOWERBOUND = 1;      // Store the lowerbound
		final int UPPERBOUND = 10;     // Store the upperbound
		int product = 1;               // Declare an int variable "product" to accumulate the product
		// Set the initial product to 1
		// Use a while-loop to repeatedly calculate the product of numbers from the lowerbound to the upperbound
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			product = product * number; // Accumulate product of number into product
			++number;                   // Increment number
		}
		// Print the result
		System.out.println("The product of numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);
	}
}