package comprog12.midterm.loops.breakncontinue;

/**
 * Submitted by: Wilson A. Gayo
 * break and continue interrupt the flow of the loop
 */
public class BreakAndContinueTest {
	
	public static void main(String[] args) {
		
		System.out.println("loop where size 10 using break:");
		for (int i = 1; i <= 10; i++) {
		if (i == 5) {
		break;
		}
		System.out.print(i);
		}
		System.out.println("\nSecond loop where size 5 Using continue:");
		for (int i = 1; i <= 5; i++) {
		if (i == 3) {
		continue;
		}
		System.out.print(i);
		}
		System.out.print("Date Submitted: March 6.2024");

		
	}

//	public static void main(String[] args) {
//		System.out.println("break and continue test\n");
//        // Example of using break
//        System.out.println("First loop where size = 10 using break:");
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                System.out.println("    (Breaking the loop at i = 5)");
//                break; // Break the loop when i equals 5
//            }
//            System.out.println("i: " + i);
//        }
//
//        // Example of using continue
//        System.out.println("\nSecond loop where size = 5 Using continue:");
//        for (int j = 1; j <= 5; j++) {
//            if (j == 3) {
//                System.out.println("    (Skipping printing j = 3)");
//                continue; // Skip the rest of the loop body and continue with the next iteration
//            }
//            System.out.println("j: " + j);
//        }
//        
//        System.out.println("\nDate Submitted: March 6, 2024");
//    }

}
