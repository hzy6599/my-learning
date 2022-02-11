package leetcode.q0_q99;

public class Q53 {

  public int maxSubArray(int[] nums) {
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
