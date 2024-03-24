package comprog12.prelim.program;

public class CylinderComputation {  // Save as "CylinderComputation.java"
	public static void main(String[] args) {
		// Declare double variables to hold radius, height, surface area, base area, and volume.
		double radius, height, surfaceArea, baseArea, volume;

		// Assign values to radius and height.
		radius = 2.0;
		height = 3.5;

		// Compute surface area, base area, and volume
		surfaceArea = 2 * Math.PI * radius * (radius + height);
		baseArea = Math.PI * radius * radius;
		volume = Math.PI * radius * radius * height;

		// Print results
		System.out.print("The radius is ");  // Print description
		System.out.println(radius);          // Print the value stored in the variable
		System.out.print("The height is ");
		System.out.println(height);
		System.out.print("The surface area is ");
		System.out.println(surfaceArea);
		System.out.print("The base area is ");
		System.out.println(baseArea);
		System.out.print("The volume is ");
		System.out.println(volume);
	}
}