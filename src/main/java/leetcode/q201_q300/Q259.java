package leetcode.q201_q300;

import java.util.Arrays;

public class Q259 {

  /**
   * Sorting the array, loop through the sorted array once.
   * For each integer at index i, choose it as pivot and loop through i + 1 to the end with two pointer.
   * Find current sum and compare with target, if sum < target, we add the difference of the two pointer (end - start) to result,
   * then increase start. If sum >= target then we decrease end until end <= start or sum is less than target.
   * Time Complexity: O(nlogn + n^2) -> O(n^2)
   * Space Complexity: O(logn) to O(n)
   */
  public static int threeSumSmallerSortingWithTwoPointer(int[] nums, int target) {
    Arrays.sort(nums);
    int answer = 0;
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] > 0 && nums[i] >= target) {
        return answer;
      }
      int start = i + 1;
      int end = nums.length - 1;
      while (start < end) {
        int sum = nums[i] + nums[start] + nums[end];
        while (start < end && sum >= target) {
          end--;
          sum = nums[i] + nums[start]+ nums[end];
        }
        if (start < end) {
          answer += (end - start);
          start++;
        }
      }
    }
    return answer;
  }

}
