package leetcode.q1_q100.q1_q50;

import java.util.ArrayList;
import java.util.List;

public class Q39 {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> results = new ArrayList<>();

    backTracking(candidates, target, 0, new ArrayList<Integer>(), results);

    return results;
  }

  private void backTracking(int[] candidates, int remaining, int start, List<Integer> num, List<List<Integer>> results) {
    if (remaining < 0) {
      return;
    }

    if (remaining == 0) {
      results.add(new ArrayList<Integer>(num));
      return;
    }

    for (int i = start; i < candidates.length; i++) {
      num.add(candidates[i]);

      backTracking(candidates, remaining - candidates[i], i, num, results);

      num.remove(num.size() - 1);
    }
  }

}
