package leetcode.q101_q200.q101_q150;

public class Q121 {

  public static int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int profit = 0;

    for (int i = 0; i < prices.length; i++) {
      min = Math.min(min, prices[i]);
      profit = Math.max(profit, prices[i] - min);
    }

    return profit;
  }

}
