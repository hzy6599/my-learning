package leetcode.q201_q300;

public class Q209 {

  public int minSubArrayLenSlicingWindow(int target, int[] nums) {
    int start = 0;
    int end = 0;
    int sum = 0;
    int result = nums.length + 1;

    while (end < nums.length) {
      sum += nums[end];
      while (sum >= target) {
        result = Math.min(result, end - start + 1);
        sum -= nums[start++];
      }
      end++;
    }

    return (result == nums.length + 1) ? 0 : result;
  }

}
