package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q4Test {

  Q4 q4 = new Q4();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums1, int[] nums2, double expected) {
    double actual = q4.findMedianSortedArrays(nums1, nums2);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,3}, new int[] {2}, 2.0D),
        Arguments.of(new int[] {1,2}, new int[] {3,4}, 2.5D)
    );
  }

}
