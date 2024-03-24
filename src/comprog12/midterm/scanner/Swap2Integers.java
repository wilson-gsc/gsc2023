package comprog12.midterm.scanner;

import java.util.Scanner; 

public class Swap2Integers {
	public static void main(String[] args) {
		 int firstInteger, secondInteger, temp;
		 
		 Scanner in = new Scanner(System.in);        
		 System.out.print("Enter first integer: ");  
		 firstInteger = in.nextInt();                     
		 System.out.print("Enter second integer: ");
		 secondInteger = in.nextInt();
		 in.close();
		 
		 if(firstInteger != secondInteger) {
			 System.out.println("\nSwapping...\nFirst integer is: " + firstInteger 
					 + "\nSecond integer is: " + secondInteger);
			 temp = firstInteger;			// assign the fistInteger to temp 	
			 firstInteger = secondInteger;  // assign the secondInteger to fistInteger
			 secondInteger = temp;			// assign the temp to secondInteger
			 
			 
			 System.out.println("\nAfter the swap...\nFirst integer is: " + firstInteger
					 + "\nSecond integer is: " + secondInteger);
		 } else {
			 System.out.println("\nNothing to swap"
			 		+ "\nFirst integer is "+ firstInteger + 
			 		" is equal to Second integer " + secondInteger);
		 }
	}
}
