package java2024.oopinjava.midterm.composition.three;

import java2024.oopinjava.prelim.exanplesclasses.point.Point;

/**
 * A test driver for the Circle33 class.
 */
public class TestCircle3 {
	public static void main(String[] args) {
      // Test Constructors and toString()
      Circle3 c1 = new Circle3();
      System.out.println("c1: " + c1);  // Circle3's toString()
      Circle3 c2 = new Circle3(1, 2, 3.3);
      System.out.println("c2: " + c2);  // Circle3's toString()
      Circle3 c3 = new Circle3(new Point(4, 5), 6.6);   // an anonymous Point instance
      System.out.println("c3: " +c3);  // Circle3's toString()

      // Test Setters and Getters
      System.out.println("\nTest Setters and Getters of c1");
      System.out.println("Set c1 to (11, 12) and Radius to 13.3");
      c1.setCenter(new Point(11, 12));
      c1.setRadius(13.3);
      System.out.println("c1: " + c1);  // Circle3's toString()
      System.out.println("\nc1 is: " + c1.getCenter());  // Point's toString()
      System.out.println("Radius is: " + c1.getRadius());
      
      System.out.println("\nSet Center X of c1 to (21) and Y to 22");
      c1.setCenterX(21);
      c1.setCenterY(22);
      System.out.println("c1: " + c1);  // Circle3's toString()
      System.out.println("c1's x is: " + c1.getCenterX());
      System.out.println("C1's y is: " + c1.getCenterY());
      System.out.println("\nSet c1 XY to (31, 32)");
      c1.setCenterXY(31, 32);
      System.out.println("c1: " + c1);  // Circle3's toString()
      System.out.println("c1's x is: " + c1.getCenterXY()[0]);
      System.out.println("c1's y is: " + c1.getCenterXY()[1]);

      // Test getArea() and getCircumference()
      System.out.println("\nTest getArea() and getCircumference()");
      System.out.printf("\nc1 area is: %.2f%n", c1.getArea());
      System.out.printf("c1 circumference is: %.2f%n", c1.getCircumference());

      // Test distance()
      System.out.println("\nTest distance()");
      System.out.printf("\nDistance of c1 and c2 is: %.2f%n", c1.distance(c2));
      System.out.printf("Distance of c2 and c1 is: %.2f%n", c2.distance(c1));
   }
}
