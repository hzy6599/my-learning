package leetcode.q1_q100.q51_q100;

import java.util.ArrayList;
import java.util.List;

public class Q77 {

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();
    if (k == 0) {
      result.add(new ArrayList<>());
      return result;
    }

    if (k == n) {
      List<Integer> combination = new ArrayList<>();
      for (int i = 1; i <= k; i++) {
        combination.add(i);
      }
      result.add(combination);
      return result;
    }

    result = combine(n - 1, k - 1);
    result.forEach(combo -> combo.add(n));
    result.addAll(combine(n - 1, k));

    return result;
  }

}
