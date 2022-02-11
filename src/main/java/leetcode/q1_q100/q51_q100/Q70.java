package leetcode.q1_q100.q51_q100;

public class Q70 {

  /**
   * Give the number of stairs, and you can either climb 1 or 2 steps, return the number
   * of distinct ways you can climb to the top.
   *
   * @param n number of steps
   * @return number of distinct ways to climb the stair in integer
   */
  public int climbStairs(int n) {
    if (n <= 2) {
      return n;
    }
    int[] result = new int[n];
    result[0] = 1;
    result[1] = 2;

    for (int i = 2; i < n; i++) {
      result[i] = result[i - 1] + result[i - 2];
    }

    return result[n - 1];
  }

  public int climbStairsTwo(int n) {
    if (n <= 2) {
      return n;
    }

    int prevTwo = 1;
    int prevOne = 2;
    int curr = 0;

    for (int i = 2; i < n; i++) {
      curr = prevOne + prevTwo;
      prevTwo = prevOne;
      prevOne = curr;
    }

    return curr;
  }

}
