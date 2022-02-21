package leetcode.q401_q500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q406 {

  public int[][] reconstructQueue(int[][] people) {
    if (people.length == 1) {
      return people;
    }

    List<int[]> results = new ArrayList<>();

    Arrays.sort(people, (a1, a2) -> (a1[0] == a2[0]) ? a1[1] - a2[1] : a2[0] - a1[0]);

    for (int[] p: people) {
      results.add(p[1], p);
    }

    return results.toArray(new int[people.length][]);
  }

}
