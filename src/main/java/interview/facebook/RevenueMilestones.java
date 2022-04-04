package interview.facebook;

import java.util.Arrays;

public class RevenueMilestones {

  /**
   * We first calculate the sum as an array, then for each milestone we do a binary search.
   * Time Complexity: O(n + nlogn).
   * Space Complexity: O(n).
   */
  public static int[] getMilestoneDays(int[] revenues, int[] milestones) {
    int[] sum = new int[revenues.length];

    sum[0] = revenues[0];
    for (int i = 1; i < revenues.length; i++) {
      sum[i]  = sum[i - 1] + revenues[i];
    }

    int[] ans = new int[milestones.length];
    Arrays.fill(ans, -1);

    for (int i = 0; i < ans.length; i++) {
      ans[i] = binarySearch(sum, milestones[i]);
    }

    return ans;
  }

  private static int binarySearch(int[] sum, int target) {
    if (target > sum[sum.length - 1]) {
      return -1;
    }
    int start = 0;
    int end = sum.length - 1;

    while (start < end) {
      int mid = start + ((end - start) >> 1);
      if (sum[mid] == target) {
        return mid + 1;
      } else if (sum[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return start + 1;
  }

}
