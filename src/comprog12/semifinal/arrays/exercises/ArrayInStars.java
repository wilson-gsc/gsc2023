package comprog12.semifinal.arrays.exercises;

import java.util.Scanner;

public class ArrayInStars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for number of items and store in NUM_ITEMS
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();

        // Validate non-negative input
        if (NUM_ITEMS <= 0) {
            System.err.println("Error: Please enter a non-negative or greater than zero number of items.");
            return;
        }

        // Declare and allocate memory for items array
        int[] items = new int[NUM_ITEMS];

        // Prompt for values of items and store in items array
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = sc.nextInt();

            // Validate non-negative input for each item
            if (items[i] < 0) {
                System.err.println("Error: Please enter only non-negative values for items.");
                return;
            }
        }
        
        sc.close();

        // Print array in stars
        System.out.println();
        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.print("*");
            }
            if(items[idx] == 0) {
            	System.out.println("(" + items[idx] + ")");
            } else {
            	System.out.println(" (" + items[idx] + ")");
            }
            
        }
    }
}

