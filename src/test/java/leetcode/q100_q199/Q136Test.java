package leetcode.q100_q199;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q136Test {

  Q136 question = new Q136();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] input, int expected) {
    int actual = question.singleNumber(input);
    Assertions.assertEquals(expected, actual);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[]{2,2,1}, 1),
        Arguments.of(new int[]{4,1,2,1,2}, 4),
        Arguments.of(new int[]{1}, 1)
    );
  }

}
