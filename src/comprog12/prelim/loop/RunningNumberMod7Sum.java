package comprog12.prelim.loop;

public class RunningNumberMod7Sum {  // Save as "RunningNumberMod7Sum.java"
	public static void main(String[] args) {
		final int LOWERBOUND = 7;      // Store the lowerbound
		final int UPPERBOUND = 1000;   // Store the upperbound
		int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
		// Set the initial sum to 0
		// Use a while-loop to repeatedly sum numbers divisible by 7 from the lowerbound to the upperbound
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum = sum + number;  // Accumulate number into sum
			number = number + 7; // Increment number by 7 to get the next number divisible by 7
		}
		// Print the result
		System.out.println("The sum of numbers divisible by 7 from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
}