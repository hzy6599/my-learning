package leetcode.q401_q500;

import java.util.Arrays;
import java.util.Comparator;

public class Q452 {

  public int findMinArrowShots(int[][] points) {
    if (points.length < 2) {
      return 1;
    }

    int numberOfShots = 0;

    // Customized comparator fails
    Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

    int prevEnd = points[0][1];

    for (int i = 1; i < points.length; i++) {
      if (points[i][0] > prevEnd) {
        numberOfShots++;
        prevEnd = points[i][1];
      }
    }

    return numberOfShots + 1;
  }

}
