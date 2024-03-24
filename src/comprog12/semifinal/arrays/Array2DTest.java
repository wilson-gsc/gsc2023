package comprog12.semifinal.arrays;

public class Array2DTest {
   public static void main(String[] args) {
      int[][] grid = new int[12][8];   // A 12x8 grid, in [row][col] or [y][x]
      final int NUM_ROWS = grid.length;       // 12
      final int NUM_COLS = grid[0].length;    // 8
   
      // Fill in grid
      for (int row = 0; row < NUM_ROWS; ++row) {
         for (int col = 0; col < NUM_COLS; ++col) {
            grid[row][col] = row*NUM_COLS + col + 1;
         }
      }
   
      // Print grid
      for (int row = 0; row < NUM_ROWS; ++row) {
         for (int col = 0; col < NUM_COLS; ++col) {
            System.out.printf("%3d", grid[row][col]);
         }
         System.out.println();
      }
   }
}