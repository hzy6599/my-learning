package leetcode.q301_q400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q346Test {

  @Test
  public void test() {
    Q346 question = new Q346(3);
    Assertions.assertEquals(1.0, question.next(1));
    Assertions.assertEquals(5.5, question.next(10));
    Assertions.assertEquals(14.0/3, question.next(3));
    Assertions.assertEquals(18.0/3, question.next(5));
  }

}
