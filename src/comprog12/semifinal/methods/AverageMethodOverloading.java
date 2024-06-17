package comprog12.semifinal.methods;

/** Testing Method Overloading */
public class AverageMethodOverloading {
   public static void main(String[] args) {
      System.out.println(average(8, 6));     // invoke version 1
      System.out.println(average(8, 6, 9));  // invoke version 2
      System.out.println(average(8.1, 6.1)); // invoke version 3
      System.out.println(average(8, 6.1));
           // int 8 autocast to double 8.0, invoke version 3
      //average(1, 2, 3, 4)  // Compilation Error - no such method
   }

   // Version 1 takes 2 int's
   public static int average(int n1, int n2) {
      System.out.println("version 1");
      return (n1 + n2)/2;  // int
   }

   // Version 2 takes 3 int's
   public static int average(int n1, int n2, int n3) {
      System.out.println("version 2");
      return (n1 + n2 + n3)/3;   // int
   }

   // Version 3 takes 2 doubles
   public static double average(double n1, double n2) {
      System.out.println("version 3");
      return (n1 + n2)/2.0;  // double
   }
}
