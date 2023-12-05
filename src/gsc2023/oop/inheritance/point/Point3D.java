package gsc2023.oop.inheritance.point;

/**
 * The Point3D class models a 3D point at (x, y,z),
 * which is a subclass of Point2D.
 */
public class Point3D extends Point2D {
   // Private instance variables
   private int z;

   // Constructors
   /** Constructs a Point3D instance at (0,0,0) */
   public Point3D() {  // default constructor
      super();     // x = y = 0
      this.z = 0;
   }
   /** Constructs a Point3D instance at (x,y,z) */
   public Point3D(int x, int y, int z) {
      super(x, y);
      this.z = z;
   }

   // Getters and Setters
   public int getZ() {
      return this.z;
   }
   public void setZ(int z) {
      this.z = z;
   }

   /** Returns a self-descriptive string in the form of "(x,y,z)" */
   @Override
   public String toString() {
      return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
   }
}
