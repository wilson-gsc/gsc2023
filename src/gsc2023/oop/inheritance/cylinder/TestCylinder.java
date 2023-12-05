package gsc2023.oop.inheritance.cylinder;

/**
 * A test driver for the Cylinder class.
 */
public class TestCylinder {
   public static void main(String[] args) {
      Cylinder cy1 = new Cylinder();
      //Constructed a Circle with Circle()
      //Constructed a Cylinder with Cylinder()
      System.out.println("Radius is " + cy1.getRadius()
         + ", \nHeight is " + cy1.getHeight()
         + ", \nColor is " + cy1.getColor()
         + ", \nBase area is " + cy1.getArea()
         + ", \nVolume is " + cy1.getVolume() + "\n");
      //Radius is 1.0, Height is 1.0, Color is red,
      //Base area is 3.141592653589793, Volume is 3.141592653589793

      Cylinder cy2 = new Cylinder(5.0, 2.0);
      //Constructed a Circle with Circle(radius)
      //Constructed a Cylinder with Cylinder(height, radius)
      System.out.println("Radius is " + cy2.getRadius()
         + ", \nHeight is " + cy2.getHeight()
         + ", \nColor is " + cy2.getColor()
         + ", \nBase area is " + cy2.getArea()
         + ", \nVolume is " + cy2.getVolume());
      //Radius is 2.0, Height is 5.0, Color is red,
      //Base area is 12.566370614359172, Volume is 62.83185307179586
   }
}
