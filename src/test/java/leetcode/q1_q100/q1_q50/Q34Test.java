package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q34Test {

  Q34 question = new Q34();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int target, int[] expectedResult) {
    int[] actualResult = question.searchRange(nums, target);
    Assertions.assertArrayEquals(expectedResult, actualResult);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {5,7,7,8,8,10}, 8, new int[] {3,4}),
        Arguments.of(new int[] {5,7,7,8,8,10}, 6, new int[] {-1,-1}),
        Arguments.of(new int[] {}, 0, new int[] {-1,-1}));
  }

}
