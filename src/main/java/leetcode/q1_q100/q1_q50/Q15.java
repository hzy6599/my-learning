package leetcode.q1_q100.q1_q50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q15 {

  /**
   * Sort the array then loop through with two pointers.
   * Time Complexity: O(nlogn + n^2) = O(n^2)
   * Space Complexity: O(logn) to O(n)
   */
  public List<List<Integer>> threeSumSortingWithTwoPointer(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int low = i + 1;
        int high = nums.length - 1;
        int target = 0 - nums[i];
        while (low < high) {
          if (nums[low] + nums[high] == target) {
            result.add(Arrays.asList(nums[i], nums[low], nums[high]));
            while (low < high && nums[low] == nums[low + 1]) {
              low++;
            }
            while (low < high && nums[high] == nums[high - 1]) {
              high--;
            }
            low++;
            high--;
          } else if (nums[low] + nums[high] > target) {
            high--;
          } else {
            low++;
          }
        }
      }
    }

    return result;
  }

  /**
   * Sort the array then loop through with two sum, use hashset as helper variable.
   * Time Complexity: O(nlogn + n^2) = O(n^2)
   * Space Complexity: O(logn) to O(n)
   */
  public List<List<Integer>> threeSumSortingWithTwoSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        break;
      }
      if (i == 0 || nums[i - 1] != nums[i]) {
        twoSum(nums, i, result);
      }
    }
    return result;
  }

  private void twoSum(int[] nums, int start, List<List<Integer>> result) {
    Set<Integer> numberVisited = new HashSet<>();
    for (int i = start + 1; i < nums.length; i++) {
      int complement = 0 - nums[start] - nums[i];
      if (numberVisited.contains(complement)) {
        result.add(Arrays.asList(nums[start], nums[i], complement));
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
          i++;
        }
      }
      numberVisited.add(nums[i]);
    }
  }

  /**
   * In case we cannot modify the original array or use extra space to sort it,
   * we can apply two sum solution, use set to remove duplicates. Need to sort each result to guarantee uniqueness.
   * Time Complexity: O(3log3 + n^2) = O(n^2)
   * Space Complexity: O(n)
   */
  public List<List<Integer>> threeSumNoSortingWithTwoSum(int[] nums) {
    Set<List<Integer>> result = new HashSet<>();
    Set<Integer> outerDuplicates = new HashSet<>();
    Map<Integer, Integer> innerDuplicates = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (!outerDuplicates.contains(nums[i])) {
        for (int j = i + 1; j < nums.length; j++) {
          int complement = 0 - nums[i] - nums[j];
          if (innerDuplicates.containsKey(complement) && innerDuplicates.get(complement) == i) {
            List<Integer> triplet = Arrays.asList(nums[i], complement, nums[j]);
            Collections.sort(triplet);
            result.add(triplet);
          }
          innerDuplicates.put(nums[j], i);
        }
      }
      outerDuplicates.add(nums[i]);
    }

    return new ArrayList<>(result);
  }

}
