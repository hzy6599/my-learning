package leetcode.q1701_q1800;

import java.util.ArrayList;
import java.util.List;

public class Q1762 {

  /**
   * We solve the question by traverse the array from right to left and keep record of the maximum height.
   * Then add number into list or stack.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int[] findBuildings(int[] heights) {
    List<Integer> buildings = new ArrayList<>();
    int maxHeight = 0;
    for (int i = heights.length - 1; i >=0; i--) {
      if (heights[i] > maxHeight) {
        buildings.add(i);
      }
      maxHeight = Math.max(maxHeight, heights[i]);
    }
    int[] ans = new int[buildings.size()];
    for (int i = ans.length - 1; i >=0; i--) {
      ans[ans.length - 1 - i] = buildings.get(i);
    }
    return ans;
  }

}
