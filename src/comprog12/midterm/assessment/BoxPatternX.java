package comprog12.midterm.assessment;

import java.util.Scanner;

public class BoxPatternX {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = in.nextInt();
        in.close();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print 'X' at the border or diagonals
                if (i == 0 || i == size - 1 || i == j || i + j == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  "); // Print space for inner part of the box
                }
            }
            System.out.println(); // Move to the next line after each row
        }
	}
}
