package comprog12.prelim.exam;

public class CheckPassFail {

	public static void main(String[] args) {
		int mark = 50;   // Set the value of "mark" here!
		
		System.out.println("\nThe mark is " + mark);
		if(mark < 0) { 
			System.out.println("NEGATIVE NUMBER IS NOT ALLOWED!!!"); 
		} else {
			if ( mark >= 50 ) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}

		mark = -5;
		System.out.println("\nThe mark is " + mark);
		if(mark < 0) { 
			System.out.println("NEGATIVE NUMBER IS NOT ALLOWED!!!"); 
		} else {
			if ( mark >= 50 ) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}
		
		System.out.println("\nDONE");
	}

}
