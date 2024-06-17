package comprog12.semifinal.methods;

import java.util.Arrays;  // for Arrays.toString()
public class PassByReferenceTest {
   public static void main(String[] args) {
      int[] testArray = {9, 5, 6, 1, 4};
      System.out.println("In caller, before calling the method, array is: "
            + Arrays.toString(testArray));   // [9, 5, 6, 1, 4]
      // Invoke method with an array parameter
      increment(testArray);
      System.out.println("In caller, after calling the method, array is: "
            + Arrays.toString(testArray));   // [10, 6, 7, 2, 5]
   }

   // Increment each of the element of the given int array
   public static void increment(int[] array) {
      System.out.println("Inside method, before operation, array is "
           + Arrays.toString(array));   // [9, 5, 6, 1, 4]
      // Increment each elements
      for (int i = 0; i < array.length; ++i) ++array[i];
      System.out.println("Inside method, after operation, array is "
           + Arrays.toString(array));   // [10, 6, 7, 2, 5]
   }
}
