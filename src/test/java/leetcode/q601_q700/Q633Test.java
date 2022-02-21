package leetcode.q601_q700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q633Test {

  Q633 q633 = new Q633();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int number, boolean expected) {
    boolean actual = q633.judgeSquareSum(number);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(5, true),
        Arguments.of(3, false),
        Arguments.of(36900, true),
        Arguments.of(2, true)
    );
  }

}
