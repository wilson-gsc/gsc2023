package comprog12.semifinal.strings.exercises;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();
        
        String result = "";
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
            	// Map each letter to its corresponding keypad digit and append it to the result string
                if (c >= 'a' && c <= 'c') {
                    result = result + "2";
                } else if (c >= 'd' && c <= 'f') {
                	result = result + "3";
                } else if (c >= 'g' && c <= 'i') {
                	result = result + "4";
                } else if (c >= 'j' && c <= 'l') {
                	result = result + "5";
                } else if (c >= 'm' && c <= 'o') {
                	result = result + "6";
                } else if (c >= 'p' && c <= 's') {
                	result = result + "7";
                } else if (c >= 't' && c <= 'v') {
                	result = result + "8";
                } else if (c >= 'w' && c <= 'z') {
                	result = result + "9";
                }
            } else {
                // If the character is not a lowercase letter, keep it unchanged and append it to the result
            	result = result + c;// If character is not a letter, keep it as it is
            }
        }

        System.out.println("Sequence of keypad digits: " + result.toString());
    }
}