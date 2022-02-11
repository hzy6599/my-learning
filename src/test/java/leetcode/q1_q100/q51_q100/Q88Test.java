package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q88Test {

  Q88 question = new Q88();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums1, int m, int[] num2, int n, int[] expectedResult) {
    question.merge(nums1, m, num2, n);
    Assertions.assertArrayEquals(expectedResult, nums1);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[] {1,2,3,0,0,0},
            3,
            new int[] {2,5,6},
            3,
            new int[] {1,2,2,3,5,6}),
        Arguments.of(
            new int[] {1},
            1,
            new int[] {},
            0,
            new int[] {1}),
        Arguments.of(
            new int[] {0},
            0,
            new int[] {1},
            1,
            new int[] {1})
    );
  }

}
