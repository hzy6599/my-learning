package leetcode.q801_q900;

import java.util.Stack;

public class Q844 {

  public boolean backspaceCompareStack(String s, String t) {
    Stack<Character> sStack = buildStack(s);
    Stack<Character> tStack = buildStack(t);

    if (sStack.size() != tStack.size()) {
      return false;
    }

    while (!sStack.isEmpty()) {
      if (sStack.pop() != tStack.pop()) {
        return false;
      }
    }

    return true;
  }

  private Stack<Character> buildStack(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != '#') {
        stack.push(s.charAt(i));
      } else if (stack.size() != 0){
        stack.pop();
      }
    }
    return stack;
  }

  public boolean backspaceCompareBackward(String s, String t) {
    int sizeOne = s.length() - 1;
    int sizeTwo = t.length() - 1;
    int delete;

    while (true) {
      delete = 0;
      while (sizeOne >= 0 && (delete > 0 || s.charAt(sizeOne) == '#')) {
        delete += s.charAt(sizeOne) == '#' ? 1 : -1;
        sizeOne--;
      }

      delete = 0;
      while (sizeTwo >=0 && (delete >0 || t.charAt(sizeTwo) == '#')) {
        delete += t.charAt(sizeTwo) == '#' ? 1 : -1;
        sizeTwo--;
      }

      if ((sizeOne >= 0 && sizeTwo >= 0) && s.charAt(sizeOne) == t.charAt(sizeTwo)) {
        sizeOne--;
        sizeTwo--;
      } else {
        break;
      }
    }

    return sizeOne == -1 && sizeTwo == -1;
  }
}
