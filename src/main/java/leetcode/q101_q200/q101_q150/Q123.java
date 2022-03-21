package leetcode.q101_q200.q101_q150;

public class Q123 {

  public static int maxProfitDP(int[] prices) {
    int length = prices.length;
    int[] left = new int[length];
    int[] right = new int[length];
    int leftMin = prices[0];
    int rightMax = prices[length - 1];

    for (int i = 1; i < length; i++) {
      left[i] = Math.max(left[i - 1], prices[i] - leftMin);
      leftMin = Math.min(leftMin, prices[i]);

      int r = length - 1 - i;
      right[r] = Math.max(right[r + 1], rightMax - prices[r]);
      rightMax = Math.max(rightMax, prices[r]);
    }

    int profit = 0;

    for(int i = 0; i < length; i++) {
      int leftProfit = left[i];
      int rightProfit = i == length - 1 ? 0 : right[i + 1];
      profit = Math.max(profit, leftProfit + rightProfit);
    }

    return profit;
  }

  public static int maxProfitOneRun(int[] prices) {
    int t1buy = prices[0];
    int t1profit = 0;

    int remainingMoney = -prices[0];
    int finalProfit = 0;

    for (int price : prices) {
      t1buy = Math.min(t1buy, price);
      t1profit = Math.max(t1profit, price - t1buy);

      remainingMoney = Math.max(remainingMoney, t1profit - price);
      finalProfit = Math.max(finalProfit, remainingMoney + price);
    }

    return finalProfit;
  }

}
