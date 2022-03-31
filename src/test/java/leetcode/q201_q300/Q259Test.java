package leetcode.q201_q300;

import leetcode.q1_q100.q1_q50.Q16;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q259Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void threeSumSmallerSortingWithTwoPointer(int[] input, int target, int expectedSum) {
    int actualSum = Q259.threeSumSmallerSortingWithTwoPointer(input, target);
    Assertions.assertEquals(expectedSum, actualSum);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[]{-1,1,-1,-1}, -1, 1),
        Arguments.of(new int[]{0,-4,-1,1,-1,2}, -5, 1),
        Arguments.of(new int[]{-2,0,1,3}, 2, 2),
        Arguments.of(new int[]{}, 0, 0),
        Arguments.of(new int[]{0}, 0, 0));
  }

}
