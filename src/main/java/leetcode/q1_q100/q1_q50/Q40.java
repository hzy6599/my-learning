package leetcode.q1_q100.q1_q50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q40 {

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> results = new ArrayList<>();

    Map<Integer, Integer> counter = getUniqueNumber(candidates);

    backTracking(candidates, target, counter, new ArrayList<Integer>(), results);

    return results;
  }

  private Map<Integer, Integer> getUniqueNumber(int[] candidates) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int number: candidates) {
      map.put(number, map.getOrDefault(number, 0) + 1);
    }
    return map;
  }

  private void backTracking(
      int[] candidates,
      int remaining,
      Map<Integer, Integer> counter,
      List<Integer> num,
      List<List<Integer>> results) {

    if (remaining < 0) {
      return;
    }

    if (remaining == 0) {
      results.add(new ArrayList<Integer>(num));
      return;
    }

    for (Integer number: counter.keySet()) {
      int count = counter.get(number);

      if (count == 0) {
        continue;
      }

      num.add(number);

      backTracking(candidates, remaining - number, counter, num, results);

      num.remove(num.size() - 1);
    }
  }

}
