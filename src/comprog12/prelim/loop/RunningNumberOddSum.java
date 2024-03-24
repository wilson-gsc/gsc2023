package comprog12.prelim.loop;

public class RunningNumberOddSum {  // Save as "RunningNumberOddSum.java"
	public static void main(String[] args) {
		final int LOWERBOUND = 1;      // Store the lowerbound
		final int UPPERBOUND = 1000;   // Store the upperbound
		int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
		// Set the initial sum to 0
		// Use a while-loop to repeatedly sum odd numbers from the lowerbound to the upperbound
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum = sum + number;  // Accumulate number into sum
			number = number + 2; // Increment number by 2 to get the next odd number
		}
		// Print the result
		System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
}