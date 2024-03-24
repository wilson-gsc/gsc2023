package comprog12.prelim.loop;

public class RunningNumberSquareSum {  // Save as "RunningNumberSquareSum.java"
	public static void main(String[] args) {
		final int LOWERBOUND = 1;       // Store the lowerbound
		final int UPPERBOUND = 100;     // Store the upperbound
		int sum = 0;                    // Declare an int variable "sum" to accumulate the numbers
		// Set the initial sum to 0
		// Use a while-loop to repeatedly sum squares of numbers from the lowerbound to the upperbound
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum = sum + number * number; // Accumulate square of number into sum
			++number;                    // Increment number
		}
		// Print the result
		System.out.println("The sum of the squares of numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
}