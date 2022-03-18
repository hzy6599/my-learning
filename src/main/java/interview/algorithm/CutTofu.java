package interview.algorithm;

import java.util.Arrays;

/**
 * There is a tofu with size 10000 * 10000 * 10000
 * the bottom left corner at (0,0,0) and top right corner at (10000, 10000, 10000)
 * We will have a 2D array where each element [a,b] describe:
 * 1. a = dimension, range of a will be [1,2,3], represent three different axis
 * 2. b = location where we cut the tofu
 * Given a 2D array describing all the cuts, return the size of the largest sub-tofu
 */
public class CutTofu {

  public static long maxCut(int[][] cuts) {
    if (cuts == null || cuts[0].length == 0) {
      return 10000L * 10000L * 10000L;
    }

    Arrays.sort(cuts, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

    int start = 0;
    int totalCuts = cuts.length;
    int maxX = 0;
    int maxY = 0;
    int maxZ = 0;
    int prevCut = 0;

    while (start < totalCuts && cuts[start][0] == 1) {
      maxX = Math.max(maxX, cuts[start][1] - prevCut);
      prevCut = cuts[start][1];
      start++;
    }
    maxX = Math.max(maxX, 10000 - prevCut);
    prevCut = 0;

    while (start < totalCuts && cuts[start][0] == 2) {
      maxY = Math.max(maxY, cuts[start][1] - prevCut);
      prevCut = cuts[start][1];
      start++;
    }
    maxY = Math.max(maxY, 10000 - prevCut);
    prevCut = 0;

    while (start < totalCuts && cuts[start][0] == 3) {
      maxZ = Math.max(maxZ, cuts[start][1] - prevCut);
      prevCut = cuts[start][1];
      start++;
    }
    maxZ = Math.max(maxZ, 10000 - prevCut);

    return (long) maxX * (long) maxY * (long) maxZ;
  }

}
