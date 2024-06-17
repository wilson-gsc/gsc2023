package comprog12.semifinal.methods;

import java.util.Scanner;
/**
 * Test various int[] methods.
 */
public class IntArrayMethodsTest {
	public static void main(String[] args) {
		// Declare variables
		final int NUM_ITEMS;
		int[] items;  // Declare array name, to be allocated after numItems is known

		// Prompt for a non-negative integer for the number of items;
		// and read the input as "int". No input validation.
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		NUM_ITEMS = in.nextInt();

		// Allocate the array
		items = new int[NUM_ITEMS];

		// Prompt and read the items into the "int" array, if array length > 0
		if (items.length > 0) {
			System.out.print("Enter the value of all items (separated by space): ");
			for (int i = 0; i < items.length; ++i) {
				items[i] = in.nextInt();
			}
		}
		in.close();

		// Test the methods
		System.out.print("The values are: ");
		print(items);
		System.out.println("The min is: " + min(items));
		System.out.println("The sum is: " + sum(items));
		System.out.printf("The average (rounded to 2 decimal places) is: %.2f%n", average(items));
	}

	/**
	 * Prints the given int array in the form of [x1, x2, ..., xn]
	 * @param  array   The given int array
	 * @Postcondition  Print output as side effect
	 */
	public static void print(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; ++i) {
			System.out.print((i == 0) ? array[i] : ", " + array[i]);
		}
		System.out.println("]");
	}

	/**
	 * Get the min of the given int array
	 * @param  array  The given int array
	 * @return        The min value of the given array
	 */
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; ++i) {
			if (array[i] < min) min = array[i];
		}
		return min;
	}

	/**
	 * Get the sum of the given int array
	 * @param  array  The given int array
	 * @return        The sum of the given array
	 */
	public static int sum(int[] array) {
		int sum = 0;
		for (int item: array) sum += item;
		return sum;
	}

	/**
	 * Get the average of the given int array
	 * @param  array  The given int array
	 * @return        The average of the given array
	 */
	public static double average(int[] array) {
		return (double)(sum(array)) / array.length;
	}
}
