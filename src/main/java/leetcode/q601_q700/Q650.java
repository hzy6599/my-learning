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

  public static int minStepsMath(int n) {
    int answer = 0;
    int factor = 2;

    while (n > 1) {
      while (n % factor == 0) {
        answer += factor;
        n /= factor;
      }
      factor++;
    }

    return answer;
  }

}
