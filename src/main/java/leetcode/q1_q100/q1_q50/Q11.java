package leetcode.q1_q100.q1_q50;

public class Q11 {

  public int maxArea(int[] height) {
    int start = 0;
    int end = height.length - 1;
    int result = 0;

    while (start < end) {
      int volume = (end - start) * Math.min(height[start], height[end]);
      result = Math.max(result, volume);
      if (height[start] <= height[end]) {
        start++;
      } else {
        end--;
      }
    }

    return result;
  }

}
