package interview.facebook;

public class ChangeInForeignCurrency {

  /**
   * This solution uses recursion. Each time we subtract a denominator from the target and proceed to the next interation.
   * Three base cases:
   * 1. target less than 0, this combination does not work.
   * 2. target = 0, return true.
   * 3. target > 0, proceed to next recursion.
   * Time Complexity: O(targetMoney / min of denominations)
   * Space Complexity: O(targetMoney / min of denominations)
   */
  boolean canGetExactChange(int targetMoney, int[] denominations) {
    if (targetMoney < 0) {
      return false;
    }
    if (targetMoney == 0) {
      return true;
    }

    boolean answer = false;

    for (int num: denominations) {
      answer = answer || canGetExactChange(targetMoney - num, denominations);
    }

    return answer;
  }

}
