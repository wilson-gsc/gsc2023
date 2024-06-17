package comprog12.finals.finalizedcircle;

/**
 * A Test Driver for the Circle class
 */
public class TestCircle {
   public static void main(String[] args) {
      // Test all constructors and toString()
      Circle c1 = new Circle(1.1, "blue");
      System.out.println("c1: " +c1);  // implicitly run toString()
      //Circle[radius=1.1, color=blue]
      Circle c2 = new Circle(2.2);
      System.out.println("c2: " + c2);
      //Circle[radius=2.2, color=red]
      Circle c3 = new Circle();
      System.out.println("c3: " + c3);
      //Circle[radius=1.0, color=red]

      // Test Setters and Getters
      System.out.println("\nTest Setters and Getters of c1");
      c1.setRadius(3.3);
      c1.setColor("green");
      System.out.println("c1: " + c1);  // use toString() to inspect the modified instance
      //Circle[radius=3.3, color=green]
      System.out.println("\nThe radius of c1 is: " + c1.getRadius());
      //The radius is: 3.3
      System.out.println("The color of c1 is: " + c1.getColor());
      //The color is: green

      // Test getArea() and getCircumference()
      System.out.printf("The area of c1 is: %.2f%n", c1.getArea());
      //The area is: 34.21
      System.out.printf("The circumference of c1 is: %.2f%n", c1.getCircumference());
      //The circumference is: 20.73
   }
}
