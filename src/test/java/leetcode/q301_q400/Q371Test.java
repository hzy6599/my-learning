package leetcode.q301_q400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q371Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int s1, int s2, int expected) {
    int actual = Q371.getSum(s1, s2);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(-5, 3, -2),
        Arguments.of(1, 2, 3),
        Arguments.of(2, 3, 5),
        Arguments.of(33, 22, 55),
        Arguments.of(-3, 5, 2)
    );
  }

}
