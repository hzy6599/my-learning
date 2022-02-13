package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q33Test {

  Q33 question = new Q33();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int target, int expectedResult) {
    int actualResult = question.search(nums, target);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {4,5,6,7,0,1,2}, 0, 4),
        Arguments.of(new int[] {4,5,6,7,0,1,2}, 3, -1,
        Arguments.of(new int[] {1}, 0, -1)));
  }

}
