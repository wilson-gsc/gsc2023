package comprog12.prelim.loop;

public class RunningNumberSum1 {  // Save as "RunningNumberSum1.java"
	public static void main(String[] args) {
		final int LOWERBOUND = 9;      // Store the lowerbound
		final int UPPERBOUND = 899;    // Store the upperbound
		int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
		// Set the initial sum to 0
		// Use a while-loop to repeatedly sum from the lowerbound to the upperbound
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum = sum + number;  // Accumulate number into sum
			++number;            // Increment number
		}
		// Print the result
		System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
}

