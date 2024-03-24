package comprog12.prelim.intsum;

public class FiveIntegerProduct {   // Save as "FiveIntegerProduct.java"
	public static void main(String[] args) {
		int number1 = 11;  // Declare 5 integer variables and assign values
		int number2 = 22;
		int number3 = 33;
		int number4 = 44;
		int number5 = 55;
		int product;  // Declare an integer variable called product to hold the product
		product = number1 * number2 * number3 * number4 * number5;  // Compute product
		System.out.print("The product is ");  // Print a descriptive string
		// Cursor stays after the printed string
		System.out.println(product);  // Print the value stored in variable product
		// Cursor advances to the beginning of next line
	}
}