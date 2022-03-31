package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q16Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void threeSumClosestSortingWithTwoPointer(int[] input, int target, int expectedSum) {
    int actualSum = Q16.threeSumClosestSortingWithTwoPointer(input, target);
    Assertions.assertEquals(expectedSum, actualSum);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[]{-1,2,1,-4}, 1, 2),
        Arguments.of(new int[]{0,0,0}, 1, 0),
        Arguments.of(new int[]{0,1,2}, 3, 3));
  }


}
