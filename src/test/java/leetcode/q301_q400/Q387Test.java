package leetcode.q301_q400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q387Test {

  Q387 question = new Q387();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithTwoLoops(String input, int expectedIndex) {
    int actualIndex = question.firstUniqCharTwoLoops(input);
    Assertions.assertEquals(expectedIndex, actualIndex);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithOneLoops(String input, int expectedIndex) {
    int actualIndex = question.firstUniqCharOneLoop(input);
    Assertions.assertEquals(expectedIndex, actualIndex);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("leetcode", 0),
        Arguments.of("loveleetcode", 2),
        Arguments.of("aabb", -1)
    );
  }

}
