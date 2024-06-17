package comprog12.semifinal.strings.exercises;

import java.util.Scanner;

public class CountVowelsDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String input = scanner.nextLine().toLowerCase();
		scanner.close();

		int vowelCount = 0;
		int consonantCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int totalCount = input.length();

		// Iterate through each character in the input string
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			// Check if the character is a letter
			if (c >= 'a' && c <= 'z') {
				// If it's a vowel, increment the vowel count
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				} else {
					// Otherwise, it's a consonant, so increment the consonant count
					consonantCount++;
				}
			} else if (Character.isDigit(c)) {
				// If the character is a digit, increment the digit count
				digitCount++;
			} else if (c == ' ') {
				// If the character is a space, increment the space count
				spaceCount++;
			}
		}
		
		// Calculate the percentages of vowels, consonants, digits, and spaces
		/*
		 * (double) vowelCount: This part of the code casts the vowelCount variable 
		 * from its original integer type to a double. 
		 * Casting to double is necessary here to ensure that the division operation 
		 * that follows produces a floating-point result. 
		 * Without this casting, integer division would occur, 
		 * resulting in truncation of the decimal part.
		 * */
		double vowelPercentage = (double) vowelCount / totalCount * 100;
		double consonantPercentage = (double) consonantCount / totalCount * 100;
		double digitPercentage = (double) digitCount / totalCount * 100;
		double spacePercentage = (double) spaceCount / totalCount * 100;
		
		// Print the counts and percentages of vowels, consonants, digits, and spaces
		/*
		 * %.2f is a placeholder for a floating-point number (vowelPercentage). 
		 * It indicates that a floating-point number with two decimal places will be inserted at this position.
		 * %% is used to print a literal percent sign %. Since % is a special character in printf format strings, 
		 * %% is used to print a single percent sign literally.
		 * */
		System.out.printf("Number of vowels: %d (%.2f%%)\n", vowelCount, vowelPercentage);
		System.out.printf("Number of consonants: %d (%.2f%%)\n", consonantCount, consonantPercentage);
		System.out.printf("Number of digits: %d (%.2f%%)\n", digitCount, digitPercentage);
		System.out.printf("Number of spaces: %d (%.2f%%)\n", spaceCount, spacePercentage);

		System.out.println("\nSubmitted by: Wilson Gayo");
		System.out.println("Date Submitted: April 3, 2024");
	}
}

