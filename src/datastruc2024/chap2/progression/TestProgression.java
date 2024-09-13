package datastruc2024.chap2.progression;

import java.util.Scanner;

/** Test program for the progression hierarchy. */
public class TestProgression {
	public static void main(String[ ] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms to print: ");
        int numTerms = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
		Progression prog;
		// test ArithmeticProgression
		System.out.print("\nArithmetic progression with default increment: "); 
		prog = new ArithmeticProgression();
		prog.printProgression(numTerms);
		System.out.print("Arithmetic progression with increment 5: ");
		prog = new ArithmeticProgression(5);
		prog.printProgression(numTerms);
		System.out.print("Arithmetic progression with start 2: ");
		prog = new ArithmeticProgression(5, 2);
		prog.printProgression(numTerms);
		// test GeometricProgression
		System.out.print("Geometric progression with default base: ");
		prog = new GeometricProgression();
		prog.printProgression(numTerms);
		System.out.print("Geometric progression with base 3: ");
		prog = new GeometricProgression(3);
		prog.printProgression(numTerms);
		// test FibonacciProgression
		System.out.print("Fibonacci progression with default start values: "); 
		prog = new FibonacciProgression();
		prog.printProgression(numTerms);
		System.out.print("Fibonacci progression with start values 4 and 6: "); 
		prog = new FibonacciProgression(4, 6);
		prog.printProgression(numTerms);
		
		scanner.close();
	}
}