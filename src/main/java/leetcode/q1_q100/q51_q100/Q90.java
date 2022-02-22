package leetcode.q1_q100.q51_q100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90 {

  public List<List<Integer>> subsetsWithDupBackTracking(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    Arrays.sort(nums);
    backTrack(results, new ArrayList<>(), nums, 0);
    return results;
  }

  private void backTrack(List<List<Integer>> results, List<Integer> subset, int[] nums, int curr) {
    results.add(new ArrayList<>(subset));
    for (int i = curr; i < nums.length; i++) {
      if (i > curr && nums[i] == nums[i - 1]) {
        continue;
      }
      subset.add(nums[i]);
      backTrack(results, subset, nums, i + 1);
      subset.remove(subset.size() - 1);
    }
  }

}
