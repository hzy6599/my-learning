package leetcode.q201_q300;

public class Q221 {

  public int maximalSquare(char[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;

    int[] dp = new int[col];
    int prev = 0;
    int max = 0;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        int temp = dp[j];
        if (matrix[i][j] == '1') {
          int left = j == 0 ? 0 : dp[j - 1];
          int top = i == 0 ? 0 : dp[j];
          int corner = (i == 0 || j == 0) ? 0 : prev;
          dp[j] = Math.min(Math.min(left, top), corner) + 1;
          max = Math.max(max, dp[j]);
        } else {
          dp[j] = 0;
        }
        prev = temp;
      }
    }

    return max * max;
  }

}
