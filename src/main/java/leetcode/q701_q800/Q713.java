package leetcode.q701_q800;

public class Q713 {

  public int numSubarrayProductLessThanK(int[] nums, int k) {
    if (k <= 1) {
      return 0;
    }

    int start = 0;
    int end = 0;
    int product = 1;
    int result = 0;

    while(end < nums.length) {
      product *= nums[end];
      while (product >= k) {
        product /= nums[start++];
      }
      result += (end - start + 1);
      end++;
    }
    return result;
  }

}
