package leetcode.q101_q200.q151_q200;

import java.util.Arrays;

public class Q188 {

  public static int maxProfit(int k, int[] prices) {
    int n = prices.length;
    if (n == 0) return 0;
    int[] buy = new int[k + 1];
    int[] sell = new int[k + 1];
    Arrays.fill(buy, -prices[0]);
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= k; j++) {
        buy[j] = Math.max(buy[j], sell[j - 1] - prices[i]);
        sell[j] = Math.max(sell[j], buy[j] + prices[i]);
      }
    }
    return sell[k];
  }

}
