package leetcode.q301_q400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q347Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void topKFrequentWithHeap(int[] nums, int target, int[] expected) {
    int[] actual = Q347.topKFrequentWithHeap(nums, target);
    Assertions.assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void topKFrequentBucket(int[] nums, int target, int[] expected) {
    int[] actual = Q347.topKFrequentBucket(nums, target);
    Assertions.assertArrayEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,1,1,2,2,3}, 2, new int[] {1,2}),
        Arguments.of(new int[] {1}, 1, new int[] {1})
    );
  }

}
