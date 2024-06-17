package comprog12.semifinal.methods;

/** Testing Array Method Overloading */
public class SumArrayMethodOverloading {
   public static void main(String[] args) {
      int[] a1 = {9, 1, 2, 6, 5};
      System.out.println(sum(a1));     // invoke version 1
      double[] a2 = {1.1, 2.2, 3.3};
      System.out.println(sum(a2));     // invoke version 2
      float[] a3 = {1.1f, 2.2f, 3.3f};
      //System.out.println(sum(a3));   // error - float[] is not casted to double[]
   }

   // Version 1 takes an int[]
   public static int sum(int[] array) {
      System.out.println("version 1");
      int sum = 0;
      for (int item : array) sum += item;
      return sum;  // int
   }

   // Version 2 takes a double[]
   public static double sum(double[] array) {
      System.out.println("version 2");
      double sum = 0.0;
      for (double item : array) sum += item;
      return sum;  // double
   }
}
