package java2024.oopinjava.prelim.exercises.rect;

//This class represents a Rectangle with length and width
public class Rectangle {
	// Instance variables with default values
	private float length = 1.0f;
	private float width = 1.0f;

	// Default constructor
	public Rectangle() { }

	// Parameterized constructor
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	// Getter for length
	public float getLength() { return length; }

	// Setter for length
	public void setLength(float length) { this.length = length; }

	// Getter for width
	public float getWidth() { return width; }

	// Setter for width
	public void setWidth(float width) { this.width = width; }

	// Method to calculate and return the area of the rectangle
	public double getArea() { return length * width; }

	// Method to calculate and return the perimeter of the rectangle
	public double getPerimeter() { return 2 * (length + width); }

	// Override toString() method to provide a string representation of the rectangle
	@Override
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}
}
