package leetcode.q901_q1000;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q921Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testStack(String input, int expectedMinimumAdd) {
    int actualMinimumAdd = Q921.minAddToMakeValidStack(input);
    Assertions.assertEquals(expectedMinimumAdd, actualMinimumAdd);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String input, int expectedMinimumAdd) {
    int actualMinimumAdd = Q921.minAddToMakeValid(input);
    Assertions.assertEquals(expectedMinimumAdd, actualMinimumAdd);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("())", 1),
        Arguments.of("(((", 3));
  }

}
