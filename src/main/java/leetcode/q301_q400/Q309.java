package leetcode.q301_q400;

public class Q309 {

  public static int maxProfitDP1(int[] prices) {
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

  public static int maxProfitDP2(int[] prices) {
    int sold = Integer.MIN_VALUE;
    int held = Integer.MIN_VALUE;
    int rest = 0;

    for (int i = 0; i < prices.length; i++) {
      int preSold = sold;
      sold = held + prices[i];
      held = Math.max(held, rest - prices[i]);
      rest = Math.max(rest, preSold);
    }

    return Math.max(sold, rest);
  }

}
