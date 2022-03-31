package leetcode.q1_q100.q1_q50;

import java.util.Arrays;

public class Q16 {

  /**
   * Sort the array first, then loop through the array once. For each index, use two pointer to loop through the rest of the array.
   * Calculate current triplet sum and compare with target, find the distance. If distance is 0 return target.
   * If not compare with current minimum distance and update if necessary.
   * Time Complexity: O(nlogn + n^2) = O(n^2)
   * Space Complexity: O(n) or O(logn)
   */
  public static int threeSumClosestSortingWithTwoPointer(int[] nums, int target) {
    Arrays.sort(nums);

    int answer = 0;
    int minDistance = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length - 2; i++) {
      int pivet = nums[i];
      int start = i + 1;
      int end = nums.length - 1;
      while (start < end) {
        int sum = pivet + nums[start] + nums[end];
        int distance = sum - target;

        if (distance == 0) {
          return target;
        }

        if (Math.abs(distance) < minDistance) {
          minDistance = Math.abs(distance);
          answer = sum;
        }

        if (distance > 0) {
          end--;
        } else {
          start++;
        }
      }
    }

    return answer;
  }

}
