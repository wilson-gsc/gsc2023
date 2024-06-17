package comprog12.semifinal.arrays.exercises;

import java.util.Scanner;

public class GradesStatistics {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for number of students and store in numStudents
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Validate non-negative input
        if (numStudents <= 0) {
        	System.err.println("Error: Please enter a non-negative or greater than zero number of items.");
            return;
        }

        // Declare and allocate memory for grades array
        int[] grades = new int[numStudents];
        double sum = 0; // Initialize sum for average calculation

        // Prompt for grades and store in grades array, calculate sum
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();

            // Validate grade between 0 and 100
            if (grades[i] < 0 || grades[i] > 100) {
                System.err.println("Error: Grade must be between 0 and 100.");
                return;
            }

            sum += grades[i]; // Add current grade to sum
        }
        
        sc.close();

        // Calculate average (rounded to 2 decimal places)
        double average = sum / numStudents;
        System.out.printf("The average is: %.2f\n", average);

        // Find minimum and maximum grades (without methods)
        int minGrade = grades[0];
        int maxGrade = grades[0];
        for (int grade : grades) {
            minGrade = Math.min(minGrade, grade); // Update min if smaller grade found
            maxGrade = Math.max(maxGrade, grade); // Update max if larger grade found
        }

        System.out.println("The minimum is: " + minGrade);
        System.out.println("The maximum is: " + maxGrade);
    }
}
