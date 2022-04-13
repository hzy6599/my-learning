package leetcode.q301_q400;

public class Q371 {

  /**
   * Use bitwise operation to handle the case.
   * By making input "a" the smaller number, we make sure the operation goes into summation/subtraction.
   * We use bitwise or to calculate the sum, then use bitwise and to find carry over or borrow.
   * Time Complexity: O(1)
   * Space Complexity: O(1)
   */
  public static int getSum(int a, int b) {
    int a1 = Math.abs(a);
    int b1 = Math.abs(b);

    if (a1 < b1) {
      return getSum(b, a);
    }

    int sign = a > 0 ? 1 : -1;

    if (a * b >= 0) {
      while (b1 != 0) {
        int ans = a1 ^ b1;
        int carry = (a1 & b1) << 1;
        a1 = ans;
        b1 = carry;
      }
    } else {
      while (b1 != 0) {
        int ans = a1 ^ b1;
        int carry = (~a1 & b1) << 1;
        a1 = ans;
        b1 = carry;
      }
    }

    return a1 * sign;
  }

}
