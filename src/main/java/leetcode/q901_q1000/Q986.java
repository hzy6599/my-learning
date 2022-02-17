package leetcode.q901_q1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q986 {

  public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    List<int[]> result = new ArrayList<>();

    int firstSize = firstList.length;
    int secondSize = secondList.length;

    int firstIndex = 0;
    int secondIndex = 0;

    while (firstIndex < firstSize && secondIndex < secondSize) {
      int[] firstRange = firstList[firstIndex];
      int[] secondRange = secondList[secondIndex];

      int min = Math.max(firstRange[0], secondRange[0]);
      int max = Math.min(firstRange[1], secondRange[1]);

      if (min <= max) {
        result.add(new int[] {min, max});
      }

      if (firstRange[1] == max) {
        firstIndex++;
      } else {
        secondIndex++;
      }
    }

    return result.toArray(new int[result.size()][2]);
  }

}
