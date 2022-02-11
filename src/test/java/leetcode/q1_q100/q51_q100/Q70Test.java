package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q70Test {

  Q70 question = new Q70();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int input, int expected) {
    Assertions.assertEquals(expected, question.climbStairs(input));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodTwo(int input, int expected) {
    Assertions.assertEquals(expected, question.climbStairsTwo(input));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(2, 2),
        Arguments.of(3, 3)
    );
  }

}
