package leetcode.q301_q400;

public class Q343 {

  /**
   * This question si actually a mathematics question. The idea is to break the number into as many 3s as possible, then 2s.
   * The math behind this is to find the derivative of the sum function, the result shows 1,2,3 are the only integers we should consider.
   * In the algorithm, 2 is the minimum integer that can be split into two or more integers. So we will try to subtract 3 from n as long as
   * n is greater than 5.
   * Start with base = 1, each time we subtract 3 from n, we do base * 3. At the end, we will do base * remainder (1 or 2).
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int integerBreak(int n) {
    if (n == 2) {
      return 1;
    }
    if (n == 3) {
      return 2;
    }
    int answer = 1;
    while (n > 4) {
      answer *= 3;
      n -= 3;
    }
    answer *= n;

    return answer;
  }

}
