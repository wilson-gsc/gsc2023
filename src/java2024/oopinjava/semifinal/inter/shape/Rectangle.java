package java2024.oopinjava.semifinal.inter.shape;

/**
 * The subclass Rectangle needs to implement all the abstract methods in Shape
 */
public class Rectangle implements Shape {  // using keyword "implements" instead of "extends"
   // Private member variables
   private int length, width;

   /** Constructs a Rectangle instance with the given length and width */
   public Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
   }

   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }

   // Need to implement all the abstract methods defined in the interface
   /** Returns the area of this rectangle */
   @Override
   public double getArea() {
      return length * width;
   }
}
