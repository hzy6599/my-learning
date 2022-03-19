package leetcode.q1_q100.q51_q100;

public class Q72 {

  public static int minDistance(String word1, String word2) {
    int size1 = word1.length();
    int size2 = word2.length();
    int[][] dp = new int[size1 + 1][size2 + 1];

    for (int i = 0; i <= size1; i++) {
      for (int j = 0; j <= size2; j++) {
        if (i == 0) {
          dp[i][j] = j;
        } else if (j == 0) {
          dp[i][j] = i;
        } else {
          if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
            dp[i][j] = dp[i - 1][j - 1];
          } else {
            int left = dp[i - 1][j];
            int top = dp[i][j - 1];
            int diag = dp[i - 1][j - 1];
            dp[i][j] = Math.min(Math.min(left, top), diag) + 1;
          }
        }
      }
    }

    return dp[size1][size2];
  }

}
