package java2024.oopinjava.semifinal.abs.shape;

/**
 * This abstract superclass Shape contains an abstract method
 *   getArea(), to be implemented by its subclasses.
 */
public abstract class Shape {
	// Private member variable
	private String color;

	/** Constructs a Shape instance with the given color */
	public Shape (String color) {
		this.color = color;
	}

	/** Returns a self-descriptive string */   
	@Override
	public String toString() {
		return "Shape[color=" + color + "]";
	}

	/** All Shape's concrete subclasses must implement a method called getArea() */
	abstract public double getArea();
}
