package leetcode.q201_q300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q232Test {

  Q232 question = new Q232();
  Q232.MyQueue queue = question.new MyQueue();

  @Test
  public void test() {
    queue.push(1);
    queue.push(2);
    Assertions.assertEquals(1, queue.peek());
    queue.pop();
    Assertions.assertFalse(queue.empty());
  }

}
