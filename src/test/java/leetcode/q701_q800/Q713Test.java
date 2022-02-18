package leetcode.q701_q800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q713Test {

  Q713 q713 = new Q713();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int k, int expected) {
    int actual = q713.numSubarrayProductLessThanK(nums, k);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {10,5,2,6}, 100, 8),
        Arguments.of(new int[] {1,2,3}, 0, 0)
    );
  }

}
