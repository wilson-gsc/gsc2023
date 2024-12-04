package java2024.oopinjava.midterm.inheritance.eg2;

/**
 * A test driver for the Point2D and Point3D classes
 */
public class TestPoint2DPoint3D {
   public static void main(String[] args) {
      /* Test Point2D */
      // Test constructors and toString()
      Point2D p2a = new Point2D(1, 2);
      System.out.println("p2a: " + p2a);  // toString()
      Point2D p2b = new Point2D();  // default constructor
      System.out.println("p2b: " + p2b);
      // Test Setters and Getters
      p2a.setX(3);  // Test setters
      p2a.setY(4);
      System.out.println("p2a: " + p2a);  // toString()
      System.out.println("p2a x is: " + p2a.getX());
      System.out.println("p2a x is: " + p2a.getY());

      /* Test Point3D */
      // Test constructors and toString()
      Point3D p3a = new Point3D(11, 12, 13);
      System.out.println("p3a: " + p3a);  // toString()
      Point2D p3b = new Point3D();  // default constructor
      System.out.println("p3b: " + p3b);
      // Test Setters and Getters
      p3a.setX(21);  // in superclass
      p3a.setY(22);  // in superclass
      p3a.setZ(23);  // in this class
      System.out.println("p3a: " + p3a);  // toString()
      System.out.println("p3a x is: " + p3a.getX());  // in superclass
      System.out.println("p3a y is: " + p3a.getY());  // in superclass
      System.out.println("p3a z is: " + p3a.getZ());  // in this class
   }
}