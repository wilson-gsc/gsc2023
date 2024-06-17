package comprog12.semifinal.methods.exercises;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        final int SENTINEL = -1; // Terminating input
        int number;
        int magicSum = 0;
        
        System.out.println("Methods: MagicSum Class");
        // Read first input to "seed" the while loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a positive integer (or -1 to end): ");
        number = scanner.nextInt();

        while (number != SENTINEL) { // Repeat until input is -1
            if (hasEight(number)) {
                magicSum += number;
            }

            // Read next input. Repeat if the input is not the SENTINEL
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = scanner.nextInt();
        }
        scanner.close();
        System.out.println("\nThe magic sum is: " + magicSum);
        
        System.out.println("\nSubmitted by: Your Name");
		System.out.println("Date Submitted: April 24, 2024");
    }

    // Method to check if a number contains the digit 8
    public static boolean hasEight(int number) {
        // Convert the number to a string for easier manipulation
        String numberString = String.valueOf(number);

        // Check each character of the string
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '8') {
                return true;
            }
        }
        return false;
    }
}

