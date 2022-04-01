package leetcode.q1_q100.q51_q100;

public class Q53 {

  /**
   * The question is to find maximum subarray, and it can be solved with dynamic programming.
   * We create a DP array with length n, the element at DP[i] means the best contiguous sum we could get at this point. (always >= 0)
   * During the loop, we calculate the contiguous sum, and update both contiguous sum and max sum.
   * The reason which every element in the DP is greater than or equal to 0 is because we want to discard the negative results.
   * If previous sum is negative there could be two cases:
   * 1. next value is positive or 0. In this case, next number can form a subarray by themselves and get a larger number. We can ignore
   * the previous sum.
   * 2. next value is negative. Similarly, next number could generate a better subarray with a smaller negative number.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static int maxSubArrayDPWithArray(int[] nums) {
    int[] answer = new int[nums.length + 1];
    int maxSum = Integer.MIN_VALUE;

    for (int i = 1; i <= nums.length; i++) {
      int curr = answer[i - 1] + nums[i - 1];
      maxSum = Math.max(maxSum, curr);
      answer[i] = curr > 0 ? curr : 0;
    }

    return maxSum;
  }

  /**
   * Similar idea but shrink the extra space needed, we use two variables instead of the entire DP array.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int maxSubArrayDPWithConstantSpace(int[] nums) {
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int num: nums) {
      currentSum += num;
      maxSum = Math.max(maxSum, currentSum);
      currentSum = currentSum < 0 ? 0 : currentSum;
    }

    return maxSum;
  }



}
