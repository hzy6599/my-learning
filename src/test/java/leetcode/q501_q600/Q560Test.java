package leetcode.q501_q600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q560Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testBruteForce(int[] nums, int target, int expectedCount) {
    int actualCount = Q560.subarraySumBruteForce(nums, target);
    Assertions.assertEquals(expectedCount, actualCount);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testBruteForceWithCumulativeSum(int[] nums, int target, int expectedCount) {
    int actualCount = Q560.subarraySumEnhancedBruteForceWithCumulativeSum(nums, target);
    Assertions.assertEquals(expectedCount, actualCount);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testBruteForceWithConstantSpace(int[] nums, int target, int expectedCount) {
    int actualCount = Q560.subarraySumEnhancedBruteForceWithConstantSpace(nums, target);
    Assertions.assertEquals(expectedCount, actualCount);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testHashMap(int[] nums, int target, int expectedCount) {
    int actualCount = Q560.subarraySumWithHashMap(nums, target);
    Assertions.assertEquals(expectedCount, actualCount);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,1,1}, 2, 2),
        Arguments.of(new int[] {1,2,3}, 3, 2)
    );
  }
}
