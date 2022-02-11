package leetcode.q200_q299;

import java.util.Stack;

public class Q232 {

  class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> helper;
    int size;

    public MyQueue() {
      stack = new Stack<>();
      helper = new Stack<>();
      size = 0;
    }

    public void push(int x) {
      stack.push(x);
      size++;
    }

    public int pop() {
      fillHelper();
      size--;
      return helper.pop();
    }

    public int peek() {
      fillHelper();
      return helper.peek();
    }

    public boolean empty() {
      return size == 0;
    }

    public void fillHelper() {
      if (helper.isEmpty()) {
        while(!stack.isEmpty()) {
          helper.push(stack.pop());
        }
      }
    }
  }

}
