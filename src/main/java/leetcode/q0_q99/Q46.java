package leetcode.q0_q99;

import java.util.ArrayList;
import java.util.List;

public class Q46 {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> permutations = new ArrayList<>();
    getPermutation(nums, 0, new ArrayList<Integer>(), permutations);
    return permutations;
  }

  public void getPermutation(
      int[] nums,
      int start,
      List<Integer> permutation,
      List<List<Integer>> permutations) {
    if (permutation.size() == nums.length) {
      permutations.add(permutation);
      return;
    }

    for (int i = 0; i <= permutation.size(); i++) {
      List<Integer> newPermutation = new ArrayList<>(permutation);
      newPermutation.add(i, nums[start]);
      getPermutation(nums, start + 1, newPermutation, permutations);
    }
  }
}
