package interview.facebook;

import java.util.Arrays;

public class BalanceSplit {

  /**
   * This solution first sort the array, then find if there exist a cut point to split the array into two parts
   * with equal sum.
   * Time Complexity: O(n*logn)
   * Space Complexity: O(logn)
   */
  boolean balancedSplitExists(int[] arr) {
    // Write your code here
    Arrays.sort(arr);

    int totalSum = 0;

    for (int num: arr) {
      totalSum += num;
    }

    if (totalSum % 2 == 1) {
      return false;
    }

    int half = totalSum / 2;
    int currSum = 0;

    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i];
      if (currSum == half) {
        if (arr[i] == arr[i + 1]) {
          return false;
        } else {
          return true;
        }
      }
      if (currSum > half) {
        return false;
      }
    }

    return false;
  }

}
