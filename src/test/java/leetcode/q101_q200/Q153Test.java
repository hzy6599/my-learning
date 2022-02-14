package leetcode.q101_q200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q153Test {

  Q153 question = new Q153();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int expectedResult) {
    Assertions.assertEquals(expectedResult, question.findMin(nums));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {3,4,5,1,2}, 1),
        Arguments.of(new int[] {4,5,6,7,0,1,2}, 0),
        Arguments.of(new int[] {11,13,15,17}, 11)
    );
  }
}
