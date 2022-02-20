package leetcode.q401_q500;

import java.util.Arrays;
import java.util.Comparator;

public class Q435 {

  public int eraseOverlapIntervals(int[][] intervals) {
    if (intervals.length < 2) {
      return 0;
    }

    Comparator<int[]> comparator = (i1, i2) -> {
      return i1[1] - i2[1];
    };
    Arrays.sort(intervals, comparator);

    int removed = 0;
    int prevEnd = intervals[0][1];

    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] < prevEnd) {
        removed++;
      } else {
        prevEnd = intervals[i][1];
      }
    }

    return removed;
  }

}
