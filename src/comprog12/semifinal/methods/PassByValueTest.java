package comprog12.semifinal.methods;

public class PassByValueTest {
	public static void main(String[] args) {
		int number = 8, result;
		System.out.println("In caller, before calling the method, number is: " + number);  // 8
		result = increment(number); // invoke method with primitive-type parameter
		System.out.println("In caller, after calling the method, number is: " + number);   // 8
		System.out.println("The result is " + result);  // 9
	}

	// Return number + 1
	public static int increment(int number) {
		System.out.println("Inside method, before operation, number is " + number); // 8
		++number;  // change the parameter
		System.out.println("Inside method, after operation, number is " + number);  // 9
		return number;
	}
}
