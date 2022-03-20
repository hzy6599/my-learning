package leetcode.q101_q200.q101_q150;

public class Q122 {

  public static int maxProfit(int[] prices) {
    if (prices.length == 1) {
      return 0;
    }

    int profit = 0;
    int buyDay = 0;

    for (int i = 0; i < prices.length; i++) {
      int prevDay = i == 0 ? -1 : prices[i - 1];
      if (prices[i] < prices[buyDay] || prices[i] < prevDay){
        profit += prevDay - prices[buyDay];
        buyDay = i;
      }
    }

    profit += (prices[prices.length - 1] - prices[buyDay]);

    return profit;
  }

  public static int maxProfitMath(int[] prices) {
    int ans = 0;
    for (int i = 1; i < prices.length; i++) {
      ans += prices[i] - prices[i - 1] > 0 ? prices[i] - prices[i - 1] : 0;
    }
    return ans;
  }

  public static int maxProfitPeakValley(int[] prices) {
    if (prices.length <= 1) {
      return 0;
    }
    int ans = 0;
    int valley = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length - 1; i++) {
      valley = Math.min(valley, prices[i]);
      if (prices[i + 1] < prices[i]) {
        ans += (prices[i] - valley);
        valley = prices[i + 1];
      }
    }
    ans += prices[prices.length - 1] - valley;
    return ans;
  }

}
