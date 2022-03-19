package leetcode.q601_q700;

public class Q650 {

  public static int minSteps(int n) {
    int[] dp = new int[n + 1];
    for (int i = 2; i <= n; i++) {
      dp[i] = i;
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          dp[i] = dp[j] + dp[i/j];
        }
      }
    }
    return dp[n];
  }

}
