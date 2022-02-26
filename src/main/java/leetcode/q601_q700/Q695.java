package leetcode.q601_q700;

import java.util.Stack;

public class Q695 {

  private static final int[] direction = new int[] {-1, 0, 1, 0, -1};

  public int maxAreaOfIslandRecursive(int[][] grid) {
    int maxSize = 0;
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[0].length; col++) {
        int size = getSize(grid, row, col);
        maxSize = Math.max(maxSize, size);
      }
    }
    return maxSize;
  }

  private int getSize(int[][] grid, int row, int col) {
    if (row >= 0 && row <= grid.length - 1 && col >=0 && col <= grid[0].length - 1 && grid[row][col] == 1) {
      grid[row][col] = 0;
      return 1
                 + getSize(grid, row + 1, col)
                 + getSize(grid, row - 1, col)
                 + getSize(grid, row, col + 1)
                 + getSize(grid, row, col - 1);
    }
    return 0;
  }

  public int maxAreaOfIslandIterative(int[][] grid) {
    int maxSize = 0;
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[0].length; col++) {
        if (grid[row][col] == 1) {
          int size = 1;
          grid[row][col] = 0;
          Stack<int[]> stack = new Stack<>();
          stack.push(new int[] {row, col});

          while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            for (int k = 0; k < 4; k++) {
              int newX = curr[0] + direction[k];
              int newY = curr[1] + direction[k + 1];
              if (newX >= 0 && newX < grid.length
                      && newY >= 0 && newY < grid[0].length
                      && grid[newX][newY] == 1) {
                grid[newX][newY] = 0;
                size++;
                stack.push(new int[] {newX, newY});
              }
            }
          }
          maxSize = Math.max(maxSize, size);
        }
      }
    }
    return maxSize;
  }

}
