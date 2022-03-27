package leetcode.q1201_q1300;

import java.util.Stack;

public class Q1249 {

  /**
   * Go over String twice, first time remove invalid ')', second time remove invalid '(', use Stack as helper.
   * Space Complexity: O(n)
   * Time Complexity: O(n)
   */
  public static String minRemoveToMakeValidTwoPassWithStack(String s) {
    int left = 0;
    int right = 0;
    Stack<Character> stack = new Stack<>();

    char[] chars = s.toCharArray();

    for (char c : chars) {
      if (c == ')' && left <= right) {
        continue;
      }
      stack.push(c);
      if (c == '(') {
        left++;
      }
      if (c == ')') {
        right++;
      }
    }

    StringBuilder sb = new StringBuilder();

    while (!stack.isEmpty()) {
      char curr = stack.pop();
      if (curr == '(' && left > right) {
        left--;
        continue;
      }
      sb.append(curr);
    }

    return sb.reverse().toString();
  }

  /**
   * Go over String twice, first time remove invalid ')', second time remove invalid '(', use StringBuilder as helper.
   * Space Complexity: O(n)
   * Time Complexity: O(n)
   */
  public static String minRemoveToMakeValidTwoPassWithStringBuilder(String s) {
    StringBuilder result = removeInvalidClosing(s, '(', ')');
    result = removeInvalidClosing(result.reverse().toString(), ')', '(');
    return result.reverse().toString();
  }

  private static StringBuilder removeInvalidClosing(String s, char open, char close) {
    StringBuilder sb = new StringBuilder();
    char[] chars = s.toCharArray();
    int balance = 0;
    for (char c : chars) {
      if (c == open) {
        balance++;
      }
      if (c == close) {
        if (balance == 0) {
          continue;
        }
        balance--;
      }
      sb.append(c);
    }
    return sb;
  }

  /**
   * Same as previous one but different implementation
   * Space Complexity: O(n)
   * Time Complexity: O(n)
   */
  public static String minRemoveToMakeValidTwoPassWithStringBuilderTwo(String s) {
    StringBuilder sb = new StringBuilder();
    char[] chars = s.toCharArray();
    int balance = 0;
    for (char c : chars) {
      if (c == '(') {
        balance++;
      }
      if (c == ')') {
        if (balance == 0) {
          continue;
        }
        balance--;
      }
      sb.append(c);
    }

    StringBuilder result = new StringBuilder();
    for (int i = sb.length() - 1; i >= 0; i--) {
      if (sb.charAt(i) == '(' && balance != 0) {
        balance--;
        continue;
      }
      result.append(sb.charAt(i));
    }

    return result.reverse().toString();
  }

}
