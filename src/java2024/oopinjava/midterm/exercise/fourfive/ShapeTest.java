package java2024.oopinjava.midterm.exercise.fourfive;

public class ShapeTest {
    public static void main(String[] args) {
        // Test Shape
        System.out.println("Testing Shape class:");
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);
        shape2.setColor("red");
        shape2.setFilled(true);
        System.out.println("After changing color and filled: " + shape2);
        System.out.println();

        // Test Circle
        System.out.println("Testing Circle class:");
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.5);
        System.out.println(circle2);
        Circle circle3 = new Circle(3.0, "yellow", true);
        System.out.println(circle3);
        System.out.println("Area of circle3: " + circle3.getArea());
        System.out.println("Perimeter of circle3: " + circle3.getPerimeter());
        System.out.println();

        // Test Rectangle
        System.out.println("Testing Rectangle class:");
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1);
        Rectangle rect2 = new Rectangle(4.0, 5.0);
        System.out.println(rect2);
        Rectangle rect3 = new Rectangle(6.0, 7.0, "orange", true);
        System.out.println(rect3);
        System.out.println("Area of rect3: " + rect3.getArea());
        System.out.println("Perimeter of rect3: " + rect3.getPerimeter());
        System.out.println();

        // Test Square
        System.out.println("Testing Square class:");
        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(2.5);
        System.out.println(square2);
        Square square3 = new Square(3.5, "purple", false);
        System.out.println(square3);
        System.out.println("Area of square3: " + square3.getArea());
        System.out.println("Perimeter of square3: " + square3.getPerimeter());
        square3.setSide(4.0);
        System.out.println("After setting side to 4.0: " + square3);
        square3.setWidth(5.0);
        System.out.println("After setting width to 5.0: " + square3);
    }
}
