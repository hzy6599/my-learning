package leetcode.q501_q600;

import java.util.HashMap;
import java.util.Map;

public class Q560 {

  /**
   * Brute Force method, calculate the sum of each sub array and check if sum == k.
   * Time Complexity O(n^3)
   * Space Complexity O(1)
   */
  public static int subarraySumBruteForce(int[] nums, int k) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        int temp = 0;
        for (int m = i; m <= j; m++) {
          temp += nums[m];
        }
        if (temp == k) {
          result++;
        }
      }
    }
    return result;
  }

  /**
   * Brute Force method with cumulative sum, get sum will take O(1).
   * Time Complexity O(n^2)
   * Space Complexity O(n)
   */
  public static int subarraySumEnhancedBruteForceWithCumulativeSum(int[] nums, int k) {
    int result = 0;
    int[] sum = new int[nums.length];
    sum[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sum[i] = sum[i - 1] + nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        int temp = sum[j] - sum[i] + nums[i];
        if (temp == k) {
          result++;
        }
      }
    }
    return result;
  }

  /**
   * Brute Force method with cumulative sum and constant space, use single constant to store sum.
   * Time Complexity O(n^2)
   * Space Complexity O(1)
   */
  public static int subarraySumEnhancedBruteForceWithConstantSpace(int[] nums, int k) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum == k) {
          result++;
        }
        if (sum > k) {
          break;
        }
      }
    }
    return result;
  }

  /**
   * Method with HashMap, use the idea of two sum problem to reduce time complexity.
   * Time Complexity O(n)
   * Space Complexity O(n)
   */
  public static int subarraySumWithHashMap(int[] nums, int k) {
    int result = 0;
    int sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int num : nums) {
      sum += num;
      int compliment = sum - k;
      if (map.containsKey(compliment)) {
        result += map.get(compliment);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return result;
  }

}
