package leetcode.q1_q100.q1_q50;

public class Q5 {

  /**
   * Use DP to solve this question. We use a 2D array to store the result. Where dp[i][j] represent if substring from i to j is a palindrome.
   * We start from bottom all the way to the top, only check the part on the right-hand side of the diagonal as i must always <= j.
   * Time Complexity: O(n*n)
   * Space Complexity: O(n*n)
   */
  public static String longestPalindrome(String s) {
    int size = s.length();
    boolean[][] dp = new boolean[size][size];
    String result = "";

    for (int i = size - 1; i >= 0; i--) {
      for (int j = i; j < size; j++) {
        if (i == j) {
          dp[i][j] = true;
        } else {
          dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
        }
        if (dp[i][j] && (j - i +1 > result.length())) {
          result = s.substring(i, j + 1);
        }
      }
    }

    return result;
  }

}
