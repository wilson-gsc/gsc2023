package comprog12.semifinal.methods.exercises;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
    	System.out.println("Methods: OddEvenTest Class");
        // Prompt user for a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Check if the number is odd or even and print the result
        if (isOdd(number)) {
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is an even number");
        }
        
        System.out.println("\nSubmitted by: Your Name");
		System.out.println("Date Submitted: April 24, 2024");
    }

    // Method to check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}

