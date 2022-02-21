package leetcode.q101_q200;

public class Q122 {

  public int maxProfit(int[] prices) {
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

}
