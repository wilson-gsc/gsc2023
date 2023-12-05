package gsc2023.datastruc.ch6.stack.array;

import java.util.Arrays;

import gsc2023.datastruc.ch6.stack.Stack;

public class ArrayStackReverseTest {

	/** Tester routine for reversing arrays */
	public static void main(String args[ ]) {
		System.out.println("ArrayStackReverse Test...");
		Integer[] a = {4, 8, 15, 16, 23, 42};
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        
        System.out.println("Reversing...");
        // Reverse arrays using the generic reverse method
        reverse(a);
        reverse(s);

        // Display the reversed arrays
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        
	}
	
	public static <E> void reverse(E[] a) {
        Stack<E> buffer = new ArrayStack<>(a.length);
        for (int i = 0; i < a.length; i++)
            buffer.push(a[i]);
        for (int i = 0; i < a.length; i++)
            a[i] = buffer.pop();
    }

}
