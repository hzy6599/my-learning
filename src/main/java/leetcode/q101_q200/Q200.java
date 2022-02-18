package leetcode.q101_q200;

public class Q200 {

  public int numIslands(char[][] grid) {
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1') {
          result++;
          removeIsland(grid, i, j);
        }
      }
    }
    return result;
  }

  private void removeIsland(char[][] grid, int i, int j) {
    if (i >= 0 && i < grid.length && j >=0 && j < grid[0].length) {
      if (grid[i][j] == '0') {
        return;
      }
      grid[i][j] = '0';
      removeIsland(grid, i + 1, j);
      removeIsland(grid, i - 1, j);
      removeIsland(grid, i, j + 1);
      removeIsland(grid, i, j - 1);
    }
  }

}
