package comprog12.semifinal.strings.exam;

import java.util.Arrays;

public class ArrayPrintTest {
    public static void main(String[] args) {
        // Test int array
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Printing int array:");
        print(intArray);

        // Test double array
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        // System.out.println("\nPrinting double array:");
        // print(doubleArray);

        // Test empty array
        int[] emptyArray = {};
        System.out.println("\nPrinting an empty array:");
        print(emptyArray);

        // Test one-element array
        int[] oneElementArray = {100};
        System.out.println("\nPrinting a one-element array:");
        print(oneElementArray);
        
        
        // Test int array
        int[] intArrayToString = {1, 2, 3, 4, 5};
        System.out.println("\nArray as String: " + arrayToString(intArrayToString));

        // Test empty array
        int[] emptyArrayToString = {};
        System.out.println("\nEmpty Array as String: " + arrayToString(emptyArrayToString));

        // Test one-element array
        int[] oneElementArrayToString = {100};
        System.out.println("\nOne-Element Array as String: " + arrayToString(oneElementArrayToString));
        
        System.out.println("\nArrays contain method:");
        print(intArray);
        int key1 = 3; // present in the array
        int key2 = 6; // not present in the array
        System.out.println("\nkey1: " + key1);
        System.out.println("key2: " + key2);
        System.out.println("\nArray contains key1? " + checkTrueOrFalse(contains(intArray, key1)));
        System.out.println("Array contains key2? " + checkTrueOrFalse(contains(intArray, key2)));
        
        
        System.out.println("\nArrays search method:");
        print(intArray);
        key1 = 3; // present in the array
        key2 = 6; // not present in the array
        System.out.println("\nkey1: " + key1);
        System.out.println("key2: " + key2);
        System.out.println("\nIndex of key1: " + key1 + " is at " + search(intArray, key1));
        System.out.println("Index of key2: " + key2 + " is at " +  search(intArray, key2));
        
        
        System.out.println("\nArrays equals method:");
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {5, 4, 3, 2, 1};
        System.out.print("\narray1: " );print(array1);
        System.out.print("array2: " );print(array2);
        System.out.print("array3: " );print(array3);
        System.out.print("array4: " );print(array4);
        System.out.println("\nAre array1 and array2 equal? " + checkTrueOrFalse(equals(array1, array2)));
        System.out.println("Are array1 and array3 equal? " + checkTrueOrFalse(equals(array1, array3)));
        System.out.println("Are array1 and array4 equal? " + checkTrueOrFalse(equals(array1, array4)));
        
        
        System.out.println("\nArrays copyOf method:");
        int[] originalArray = {1, 2, 3, 4, 5};
        
        System.out.print("\noriginalArray: " );print(originalArray);
        
        // Test copyOf() without specifying length
        int[] copy1 = copyOf(originalArray);
        System.out.println("\nCopy of originalArray to copy1: " + Arrays.toString(copy1));
        
        // Test copyOf() with specified length
        int newLength = 7;
        int[] copy2 = copyOf(originalArray, newLength);
        System.out.println("\nCopy of version 2 originalArray with length " + newLength + ": " + Arrays.toString(copy2));
    }

    // Print method for int array
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    // Overloaded print method for double array
    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    // Method to convert int array to String
    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                result.append(", ");
            }
            result.append(array[i]);
        }
        result.append("]");
        return result.toString();
    }
    
    // Method to check if array contains a given int
    public static boolean contains(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
    
    // Method to check boolean
	public static String checkTrueOrFalse(boolean key) {
		if (key == true) {
			return "Yes";
		} else {
			return "No";
		}
	}
    
    // Method to search for a key in the array
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // Key not found
    }
    
    // Method to compare two int arrays for equality
    public static boolean equals(int[] array1, int[] array2) {
        // Check if the arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }
        
        // Check if each element in the arrays is equal
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        // Arrays are equal
        return true;
    }
    
    // Method to create a copy of the given array
    public static int[] copyOf(int[] array) {
        return Arrays.copyOf(array, array.length);
    }
    
    // Method to create a copy of the given array with specified length
    public static int[] copyOf(int[] array, int newLength) {
        return Arrays.copyOf(array, newLength);
    }
}

