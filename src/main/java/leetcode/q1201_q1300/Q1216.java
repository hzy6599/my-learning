package leetcode.q1201_q1300;

public class Q1216 {

  /**
   * Use dynamic programming, dp[i][j] = the changes needed to make subString(i, j) a palindrome.
   * This method construct the dp top-down.
   * Time Complexity: O(n^2)
   * Space Complexity: O(n^2)
   */
  public static boolean isValidPalindromeDPTopDown(String s, int k) {
    Integer[][] dp = new Integer[s.length()][s.length()];
    return isValidPalindrome(s, dp, 0, s.length() - 1) <= k;
  }

  private static int isValidPalindrome(String s, Integer[][] dp, int start, int end) {
    if (start == end) {
      return 0;
    }
    if (start == end - 1) {
      return s.charAt(start) == s.charAt(end) ? 0 : 1;
    }
    if (dp[start][end] != null) {
      return dp[start][end];
    }

    if (s.charAt(start) == s.charAt(end)) {
      dp[start][end] = isValidPalindrome(s, dp, start + 1, end - 1);
      return dp[start][end];
    } else {
      int moveLeft = isValidPalindrome(s, dp, start + 1, end);
      int moveRight = isValidPalindrome(s, dp, start, end - 1);
      dp[start][end] = 1 + Math.min(moveLeft, moveRight);
      return dp[start][end];
    }
  }

  /**
   * Also use DP but this time construct the dp from bottom up.
   * Time Complexity: O(n^2)
   * Space Complexity: O(n^2)
   */
  public static boolean isValidPalindromeBottomUp2D(String s, int k) {
    int[][] dp = new int[s.length()][s.length()];

    for (int i = s.length() - 1; i >= 0; i--) {
      for (int j = i; j < s.length(); j++) {
        if (i == j) {
          dp[i][j] = 0;
        } else {
          if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = dp[i + 1][j - 1];
          } else {
            dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
          }
        }
      }
    }

    return dp[0][s.length() - 1] <= k;
  }

  /**
   * An improved version, use 1-D array instead of 2-D array.
   * Time Complexity: O(n^2)
   * Space Complexity: O(n)
   */
  public static boolean isValidPalindromeBottomUp1D(String s, int k) {
    int[] dp = new int[s.length()];
    int prev;
    int temp;

    for (int i = s.length() - 1; i >= 0; i--) {
      prev = 0;
      for (int j = i; j < s.length(); j++) {
        temp = dp[j];
        if (i == j) {
          dp[j] = 0;
        } else {
          if (s.charAt(i) == s.charAt(j)) {
            dp[j] = prev;
          } else {
            dp[j] = 1 + Math.min(dp[j], dp[j - 1]);
          }
        }
        prev = temp;
      }
    }

    return dp[s.length() - 1] <= k;
  }

}
