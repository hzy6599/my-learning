package leetcode.q701_q800;

import java.util.ArrayList;
import java.util.List;

public class Q763 {

  public List<Integer> partitionLabels(String s) {
    List<Integer> results = new ArrayList<>();

    if (s.length() == 1) {
      results.add(1);
      return results;
    }

    int[] lastIndex = new int[128];

    for (int i = 0; i < s.length(); i++) {
      lastIndex[s.charAt(i)] = i;
    }

    int start = 0;
    int end = lastIndex[s.charAt(0)];

    for (int i = 0; i < s.length(); i++) {
      if (lastIndex[s.charAt(i)] > end) {
        end = lastIndex[s.charAt(i)];
      }
      if (i == end) {
        results.add(end - start + 1);
        start = end + 1;
      }
    }

    return results;
  }

}
