package leetcode.q1_q100.q1_q50;

public class Q10 {

  public boolean isMatch(String string, String pattern) {
    if (pattern == null || pattern.length() == 0) {
      return (string == null || string.length() == 0);
    }

    boolean[][] dp = new boolean[string.length() + 1][pattern.length() + 1];
    // Empty String matches empty pattern
    dp[0][0] = true;

    /**
     * Calculate first row, with empty string if pattern matches
     * empty string won't match single pattern, skip
     * if current char is *, we can ignore current * and the char before it, check for j - 2 location
     */
    for (int j = 2; j <= pattern.length(); j++) {
      dp[0][j] = (pattern.charAt(j - 1) == '*') && (dp[0][j - 2]);
    }

    /**
     * For each substring, check subpattern see if there is a match
     * if character matches or pattern is '.', check if previous pattern and string matches
     * if pattern is *, check
     * 1. without current * if pattern matches j - 2
     * 2. if previous pattern matches current char or previous pattern = '.', and if pattern matches without current string char
     */
    for (int i = 1; i <= string.length(); i++) {
      for (int j = 1; j <= pattern.length(); j++) {
        if (pattern.charAt(j - 1) == '.' || pattern.charAt(j - 1) == string.charAt(i - 1)) {
          dp[i][j] = dp[i - 1][j - 1];
        } else if (pattern.charAt(j - 1) == '*') {
          dp[i][j] = dp[i][j - 2] || ((pattern.charAt(j - 2) == '.' || pattern.charAt(j - 2) == string.charAt(i - 1)) && dp[i-1][j]);
        }
      }
    }
    return dp[string.length()][pattern.length()];
  }

}
