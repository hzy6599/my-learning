package leetcode.q401_q500;

public class Q474 {

  public static int findMaxForm(String[] strs, int m, int n) {
    int[][] dp = new int[m + 1][n + 1];

    for (String str: strs) {
      int[] count = findOnesZeros(str);
      for (int i = m; i >= count[0]; i--) {
        for (int j = n; j >= count[1]; j--) {
          dp[i][j] = Math.max(dp[i][j], dp[i - count[0]][j - count[1]] + 1);
        }
      }
    }

    return dp[m][n];
  }

  private static int[] findOnesZeros(String string) {
    int[] res = new int[2];
    for (char c: string.toCharArray()) {
      if (c == '1') {
        res[1]++;
      } else {
        res[0]++;
      }
    }
    return res;
  }

}
