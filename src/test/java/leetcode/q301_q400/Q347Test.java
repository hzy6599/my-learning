package leetcode.q301_q400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q347Test {

  Q347 q347 = new Q347();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int target, int[] expected) {
    int[] actual = q347.topKFrequent(nums, target);
    Assertions.assertArrayEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,1,1,2,2,3}, 2, new int[] {1,2}),
        Arguments.of(new int[] {1}, 1, new int[] {1})
    );
  }

}
