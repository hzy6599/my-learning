package leetcode.q601_q700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q650Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int target, int expected) {
    int minNumberOfOperations = Q650.minSteps(target);
    Assertions.assertEquals(expected, minNumberOfOperations);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(3, 3),
        Arguments.of(1, 0),
        Arguments.of(9, 6)
    );
  }

}
