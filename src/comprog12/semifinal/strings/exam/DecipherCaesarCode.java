package comprog12.semifinal.strings.exam;

import java.util.Scanner;

public class DecipherCaesarCode {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a plaintext string: ");
        String plaintext = in.next().toUpperCase();
        in.close();
        
        
        String ciphertext = ""; // Initialize an empty string to store the ciphertext
        
        // Iterate over each character in the plaintext string
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            
            // Check if the character falls in the range 'A' to 'W'
            if (ch >= 'A' && ch <= 'W') {
            	// Apply Caesar's Code encryption by shifting the character by 3 positions
                ch = (char) (ch + 3);
            // Check if the character falls in the range 'X' to 'Z'
            } else if (ch >= 'X' && ch <= 'Z') {
            	// Apply Caesar's Code encryption by wrapping around the alphabet 
            	//(subtracting 23 to cycle back to 'A')
                ch = (char) (ch - 23);
            }
            ciphertext += ch; // Append the encrypted character to the ciphertext string
        }

        System.out.println("The ciphertext string is: " + ciphertext);
        
        
        // Read user input and convert it to uppercase
        // String ciphertext = in.next().toUpperCase();

        // Initialize an empty string to store the plaintext
        plaintext = "";

        // Iterate over each character in the ciphertext string
        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);
            
            // Check if the character falls in the range 'D' to 'Z'
            if (ch >= 'D' && ch <= 'Z') {
                // Apply Caesar's Code decryption by shifting the character back by 3 positions
                ch = (char) (ch - 3);
            } 
            // Check if the character falls in the range 'A' to 'C'
            else if (ch >= 'A' && ch <= 'C') {
                // Apply Caesar's Code decryption by wrapping around the alphabet (adding 23 to cycle back to 'Z')
                ch = (char) (ch + 23);
            }
            
            // Append the decrypted character to the plaintext string
            plaintext += ch;
        }

        // Print the plaintext string
        System.out.println("The plaintext string is: " + plaintext);
    }
}
