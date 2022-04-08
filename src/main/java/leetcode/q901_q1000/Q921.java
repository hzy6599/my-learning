package leetcode.q901_q1000;

import java.util.Stack;

public class Q921 {

  /**
   * Solve with the help of stack.
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static int minAddToMakeValidStack(String s) {
    Stack<Character> stack = new Stack<>();
    for (Character c : s.toCharArray()) {
      if (stack.isEmpty()) {
        stack.push(c);
      } else if (c == ')' && stack.peek() == '(') {
        stack.pop();
      } else {
        stack.push(c);
      }
    }

    return stack.size();
  }

  /**
   * Solve with the help of two variable.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int minAddToMakeValid(String s) {
    int ans = 0;
    int balance = 0;
    for (char c : s.toCharArray()) {
      balance += c == '(' ? 1 : -1;
      if (balance == -1) {
        ans++;
        balance++;
      }
    }
    return ans + balance;
  }

}
