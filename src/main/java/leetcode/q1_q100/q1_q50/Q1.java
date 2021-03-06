package leetcode.q1_q100.q1_q50;

import java.util.HashMap;

public class Q1 {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int compliment = target - nums[i];
      if (map.containsKey(compliment)) {
        return new int[] {map.get(compliment), i};
      }
      map.put(nums[i], i);
    }
    return new int[2];
  }
}
