package leetcode.q1_q100.q1_q50;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q20 {

  public boolean isValid(String s) {
    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      if (map.containsKey(current)) {
        stack.push(current);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char last = stack.pop();
        if (map.get(last) != current) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

}
