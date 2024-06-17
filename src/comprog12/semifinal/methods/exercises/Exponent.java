package comprog12.semifinal.methods.exercises;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
    	System.out.println("Methods: Exponent Class");
        // Declare variables
        int exp;    // exponent (non-negative integer)
        int base;   // base (integer)

        // Prompt and read exponent and base
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the base: ");
        base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        exp = scanner.nextInt();
        scanner.close();
        
        // Print result
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
        
        System.out.println("\nSubmitted by: Your Name");
		System.out.println("Date Submitted: April 24, 2024");
    }

    // Returns "base" raised to the power "exp"
    public static int exponent(int base, int exp) {
        int product = 1;   // resulting product

        // Multiply product and base for exp number of times
        for (int i = 0; i < exp; i++) {
            product *= base;
        }

        return product;
    }
}

