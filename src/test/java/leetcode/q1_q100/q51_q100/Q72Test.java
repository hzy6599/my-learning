package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q72Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String string1, String string2, int expected) {
    int minOperations = Q72.minDistance(string1, string2);
    Assertions.assertEquals(expected, minOperations);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("horse", "ros", 3),
        Arguments.of("intention", "execution", 5));
  }

}
