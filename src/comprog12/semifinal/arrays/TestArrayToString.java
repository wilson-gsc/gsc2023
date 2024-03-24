package comprog12.semifinal.arrays;

import java.util.Arrays;   // Needed to use Arrays.toString()
/**
 * Use Arrays.toString() to print an array in the form of [a1, a2, ..., an]
 */
public class TestArrayToString {
   public static void main(String[] args) {
      // Declare and allocate test arrays
      int[] a1 = {6 ,1, 3, 4, 5};   // Allocate via initialization
      int[] a2 = {};                // Empty array with length = 0
      double[] a3 = new double[1];  // One-Element array, init to 0.0

      System.out.println(Arrays.toString(a1));  //[6, 1, 3, 4, 5]
      System.out.println(Arrays.toString(a2));  //[]
      System.out.println(Arrays.toString(a3));  //[0.0]
      a3[0] = 2.2;
      System.out.println(Arrays.toString(a3));  //[2.2]
   }
}
