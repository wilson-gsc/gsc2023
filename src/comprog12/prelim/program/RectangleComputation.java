package comprog12.prelim.program;

public class RectangleComputation {  // Save as "RectangleComputation.java"
	public static void main(String[] args) {
		// Declare double variables to hold length, width, area, and perimeter.
		double length, width, area, perimeter;

		// Assign values to length and width.
		length = 5.5;
		width = 3.0;

		// Compute area and perimeter
		area = length * width;
		perimeter = 2 * (length + width);

		// Print results
		System.out.print("The length is ");  // Print description
		System.out.println(length);          // Print the value stored in the variable
		System.out.print("The width is ");
		System.out.println(width);
		System.out.print("The area is ");
		System.out.println(area);
		System.out.print("The perimeter is ");
		System.out.println(perimeter);
	}
}