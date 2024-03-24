package comprog12.midterm.loops;

/**
 * Submitted by: Wilson A. Gayo
 * Labeled break
 */
public class TestLabeledBreak {
	public static void main(String[] args) {
		int[][] testArray = {
				{1, 2, 3, 4},
				{4, 3, 1, 4},
				{9, 2, 3, 4}
		};

		final int MAGIC_NUMBER = 9;
		boolean found = false;
		mainLoop:
			for (int i = 0; i < testArray.length; ++i) {
				for (int j = 0; j < testArray[i].length; ++j) {
					if (testArray[i][j] == MAGIC_NUMBER) {
						found = true;
						break mainLoop;
					}
				}
			}
		// System.out.println("Magic number " + (found ? "found" : "NOT found"));
		System.out.println("Magic number " + MAGIC_NUMBER + (found ? " found" : " NOT found"));
		System.out.println("\nDate Submitted: March 4, 2024");
	}
}

// System.out.println("Magic number " + MAGIC_NUMBER + (found ? " found" : " NOT found"));