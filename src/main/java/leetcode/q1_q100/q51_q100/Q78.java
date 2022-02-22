package leetcode.q1_q100.q51_q100;

import java.util.ArrayList;
import java.util.List;

public class Q78 {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    results.add(new ArrayList<>());

    for (int i = 0; i < nums.length; i++) {
      getSubsets(results, nums[i]);
    }

    return results;
  }

  private void getSubsets(List<List<Integer>> results, int curr) {
    int size = results.size();
    for (int i = 0; i < size; i++) {
      List<Integer> newSet = new ArrayList<>(results.get(i));
      newSet.add(curr);
      results.add(newSet);
    }
  }

  public List<List<Integer>> subsetsBackTracking(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    backTrack(results, new ArrayList<>(), nums, 0);
    return results;
  }

  private void backTrack(List<List<Integer>> results, List<Integer> subset, int[] nums, int curr) {
    results.add(new ArrayList<>(subset));
    for (int i = curr; i < nums.length; i++) {
      subset.add(nums[i]);
      backTrack(results, subset, nums, i + 1);
      subset.remove(subset.size() - 1);
    }
  }

}
