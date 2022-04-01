package leetcode.q201_q300;

import leetcode.q301_q400.Q343;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q343Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int number, int expectedProduct) {
    int actualProduct = Q343.integerBreak(number);
    Assertions.assertEquals(expectedProduct, actualProduct);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(2, 1),
        Arguments.of(3, 2),
        Arguments.of(4, 4),
        Arguments.of(5, 6),
        Arguments.of(6, 9),
        Arguments.of(7, 12),
        Arguments.of(8, 18));
  }
}
