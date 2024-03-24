package comprog12.prelim.exam;

public class CheckOddEven {
	public static void main(String[] args) {  // Program entry point
		int number = 2;       // Set the value of "number" here!
		System.out.println("\nThe number is " + number);
		if ( number % 2 == 0 ) {
			System.out.println( "Even Number" );   // even number
		} else {
			System.out.println( "Odd Number" );   // odd number
		}
		
		number = 3;       // Set the value of "number" here!
		System.out.println("\nThe number is " + number);
		if ( number % 2 == 0 ) {
			System.out.println( "Even Number" );   // even number
		} else {
			System.out.println( "Odd Number" );   // odd number
		}
		System.out.println( "\nbye!" );
	}
}
