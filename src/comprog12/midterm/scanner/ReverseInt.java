package comprog12.midterm.scanner;

import java.util.Scanner; 

public class ReverseInt {
	public static void main(String[] args) {
		int inNumber;   // to be input
		int inDigit;    // each digit
		String outNumber = "";
		
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a positive integer: ");
		inNumber = in.nextInt();
		in.close();
		
		if(inNumber < 0) {
			System.out.println("This require a positive integer!!!");
		} else if(inNumber == 0) {
			System.out.println("This require a greater than zero integer!!!");
		} else {
			// Extract and drop the "last" digit repeatably using a while-loop with modulus/divide operations
			while (inNumber > 0) {
				inDigit = inNumber % 10; // extract the "last" digit
				System.out.println("\ninDigit..." + inDigit);
				// Print this digit (which is extracted in reverse order)
				outNumber = outNumber + "" + inDigit;
				System.out.println("outNumber..." + outNumber);
				inNumber /= 10;          // drop "last" digit and repeat
				System.out.println("inNumber..." + inNumber);
			}
			System.out.println("The reverse is: " + outNumber);
		}
	}
}
