package leetcode.q1001__q1100;

import java.util.LinkedList;
import java.util.Queue;

public class Q1091 {

  public int shortestPathBinaryMatrix(int[][] grid) {
    int n = grid.length;
    if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
      return -1;
    }

    int result = 0;
    boolean[][] visited = new boolean[n][n];
    int[][] directions = new int[][] {
        {1,0},{-1,0},
        {0,1},{0,-1},
        {1,1},{-1,-1},
        {1,-1},{-1,1}
    };
    Queue<int[]> queue = new LinkedList<>();

    queue.offer(new int[]{0, 0});
    visited[0][0] = true;

    while (!queue.isEmpty()) {
      int size  = queue.size();
      for (int i = 0; i < size; i++) {
        int[] curr = queue.poll();
        if (curr[0] == n - 1 && curr[1] == n - 1) {
          return result + 1;
        }
        for (int j = 0; j < 8; j++) {
          int newX = curr[0] + directions[j][0];
          int newY = curr[1] + directions[j][1];
          if (newX >= 0 && newX < n && newY >=0 && newY < n && grid[newX][newY] == 0 && !visited[newX][newY]) {
            queue.offer(new int[] {newX, newY});
            visited[newX][newY] = true;
          }
        }
      }
      result++;
    }

    return -1;
  }
}
