package leetcode.q401_q500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Q417 {

  private static final int[] directions = new int[] {-1, 0, 1, 0, -1};

  public List<List<Integer>> pacificAtlanticRecursive(int[][] heights) {
    int row = heights.length;
    int col = heights[0].length;
    boolean[][] visitedPacific = new boolean[row][col];
    boolean[][] visitedAtlantic = new boolean[row][col];
    List<List<Integer>> results = new ArrayList<>();

    for (int i = 0; i < heights.length; i++) {
      dfsRecursive(heights, visitedPacific, i, 0);
      dfsRecursive(heights, visitedAtlantic, i, col - 1);
    }

    for (int i = 0; i < heights[0].length; i++) {
      dfsRecursive(heights, visitedPacific, 0, i);
      dfsRecursive(heights, visitedAtlantic, row - 1, i);
    }

    for (int i = 0; i < heights.length; i++) {
      for (int j = 0; j < heights[0].length; j++) {
        if (visitedPacific[i][j] && visitedAtlantic[i][j]) {
          results.add(Arrays.asList(i, j));
        }
      }
    }

    return results;
  }

  private void dfsRecursive(int[][] heights, boolean[][] visited, int row, int col) {
    if (!visited[row][col]) {
      visited[row][col] = true;
      for (int i = 0; i < 4; i++) {
        int x = row + directions[i];
        int y = col + directions[i + 1];
        if (x >= 0 && x < heights.length
                && y >= 0 && y < heights[0].length
                && heights[x][y] >= heights[row][col]) {
          dfsRecursive(heights, visited, x, y);
        }
      }
    }
  }

  public List<List<Integer>> pacificAtlanticIterative(int[][] heights) {
    int row = heights.length;
    int col = heights[0].length;
    boolean[][] visitedPacific = new boolean[row][col];
    boolean[][] visitedAtlantic = new boolean[row][col];
    List<List<Integer>> results = new ArrayList<>();

    for (int i = 0; i < heights.length; i++) {
      dfsIterative(heights, visitedPacific, i, 0);
      dfsIterative(heights, visitedAtlantic, i, col - 1);
    }

    for (int i = 0; i < heights[0].length; i++) {
      dfsIterative(heights, visitedPacific, 0, i);
      dfsIterative(heights, visitedAtlantic, row - 1, i);
    }

    for (int i = 0; i < heights.length; i++) {
      for (int j = 0; j < heights[0].length; j++) {
        if (visitedPacific[i][j] && visitedAtlantic[i][j]) {
          results.add(Arrays.asList(i, j));
        }
      }
    }

    return results;
  }

  private void dfsIterative(int[][] heights, boolean[][] visited, int row, int col) {
    if (!visited[row][col]) {
      Stack<int[]> stack = new Stack<>();
      visited[row][col] = true;
      stack.push(new int[] {row, col});
      while (!stack.isEmpty()) {
        int[] curr = stack.pop();
        for (int i = 0; i < 4; i++) {
          int x = curr[0] + directions[i];
          int y = curr[1] + directions[i + 1];
          if (x >= 0 && x < heights.length
                  && y >= 0 && y < heights[0].length
                  && heights[x][y] >= heights[curr[0]][curr[1]]
                  && !visited[x][y]) {
            visited[x][y] = true;
            stack.push(new int[] {x, y});
          }
        }
      }
    }
  }

}
