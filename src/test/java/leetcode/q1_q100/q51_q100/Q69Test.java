package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q69Test {

  Q69 q69 = new Q69();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testBinarySearch(int x, int expected) {
    int actual = q69.mySqrtBinarySearch(x);
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testNewtonsMethod(int x, int expected) {
    int actual = q69.mySqrtNewtonsMethod(x);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(4, 2),
        Arguments.of(8, 2)
    );
  }

}
