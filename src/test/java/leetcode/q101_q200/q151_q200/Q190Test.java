package leetcode.q101_q200.q151_q200;

import leetcode.q101_q200.q151_q200.Q190;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q190Test {

  Q190 question = new Q190();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodOne(int input, int expected) {
    int actual = question.reverseBitsOne(input);
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodTwo(int input, int expected) {
    int actual = question.reverseBitsTwo(input);
    Assertions.assertEquals(expected, actual);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(43261596, 964176192),
        Arguments.of(805306368, 12)
    );
  }

}
