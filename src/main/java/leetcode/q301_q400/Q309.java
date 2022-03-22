package leetcode.q301_q400;

public class Q309 {

  public static int maxProfit(int[] prices) {
    int[] sold = new int[prices.length + 1];
    int[] held = new int[prices.length + 1];
    int[] rest = new int[prices.length + 1];

    sold[0] = Integer.MIN_VALUE;
    held[0] = Integer.MIN_VALUE;

    for (int i = 1; i <= prices.length; i++) {
      sold[i] = held[i - 1] + prices[i - 1];
      held[i] = Math.max(held[i - 1], rest[i - 1] - prices[i - 1]);
      rest[i] = Math.max(rest[i - 1], sold[i - 1]);
    }

    return Math.max(sold[prices.length], rest[prices.length]);
  }

}
