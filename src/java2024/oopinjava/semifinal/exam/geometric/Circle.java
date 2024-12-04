package java2024.oopinjava.semifinal.exam.geometric;

//Implementation class Circle
public class Circle implements GeometricObject {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle {radius= " + radius + "}";
	}
}