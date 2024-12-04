package java2024.oopinjava.semifinal.abs.shape;

public class TestShape {
	public static void main(String[] args) {
      Shape s1 = new Rectangle("red", 4, 5);
      System.out.println(s1);
      System.out.println("Area is " + s1.getArea());
      
      Shape s2 = new Triangle("blue", 4, 5);
      System.out.println(s2);
      System.out.println("Area is " + s2.getArea());
      
      // Cannot create instance of an abstract class
      // Shape s3 = new Shape("green");
      // compilation error: Shape is abstract; cannot be instantiated
   }
}
