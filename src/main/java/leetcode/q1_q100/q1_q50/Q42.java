package leetcode.q1_q100.q1_q50;

import java.util.Stack;

public class Q42 {

  /**
   * Brute Force Method, for each height we find the max height on both sides and use the minimum of two to calculate number of water.
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static int trapBruteForce(int[] height) {
    int ans = 0;
    for (int i = 0; i < height.length; i++) {
      int leftMax = height[i];
      for (int left = 0; left < i; left++) {
        leftMax = Math.max(leftMax, height[left]);
      }
      int rightMax = height[i];
      for (int right = i + 1; right < height.length; right++) {
        rightMax = Math.max(rightMax, height[right]);
      }
      ans += Math.min(leftMax, rightMax) - height[i];
    }
    return ans;
  }

  /**
   * Improved method using DP. We traverse the array twice to find max for both sides.
   * Then calculate again.
   * Time Complexity: O(3*n)
   * Space Complexity: O(n)
   */
  public static int trapDP(int[] height) {
    int ans = 0;
    int[] leftMax = new int[height.length];
    leftMax[0] = height[0];
    int[] rightMax = new int[height.length];
    rightMax[height.length - 1] = height[height.length - 1];
    for (int i = 1; i < height.length; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    }
    for (int i = height.length - 2; i >= 0; i--) {
      rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    }

    for (int i = 0; i < height.length; i++) {
      ans += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return ans;
  }

  /**
   * Improved DP using stack. We only traverse the array once and keep height in stack. When current height is greater than the one on
   * the top of the stack, it means we can hold water, pop it and calculate the result.
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static int trapStack(int[] height) {
    int ans = 0;
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < height.length; i++) {
      int curr = height[i];
      while (!stack.isEmpty() && curr > height[stack.peek()]) {
        int prev = stack.pop();
        if (stack.isEmpty()) {
          break;
        }
        int distance = i - stack.peek() - 1;
        int minHeight = Math.min(curr, height[stack.peek()]);
        ans += distance * (minHeight - height[prev]);
      }
      stack.push(i);
    }

    return ans;
  }

  /**
   * Improved algorithm with two pointer. We store of left/right max, keep moving pointer to the middle and calculate the sum based on max.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int trapTwoPointer(int[] height) {
    int ans = 0;
    int left = 0;
    int leftMax = height[left];
    int right = height.length - 1;
    int rightMax = height[right];

    while (left < right) {
      if (height[left] < height[right]) {
        if (height[left] >= leftMax) {
          leftMax = height[left];
        } else {
          ans += leftMax - height[left];
        }
        left++;
      } else {
        if (height[right] >= rightMax) {
          rightMax = height[right];
        } else {
          ans += rightMax - height[right];
        }
        right--;
      }
    }

    return ans;
  }

}
