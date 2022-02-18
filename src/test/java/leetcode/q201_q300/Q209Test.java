package leetcode.q201_q300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q209Test {

  Q209 q209 = new Q209();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testSlicingWindow(int target, int[] nums, int expected) {
    int actual = q209.minSubArrayLenSlicingWindow(target, nums);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(7, new int[] {2,3,1,2,4,3}, 2),
        Arguments.of(4, new int[] {1,4,4}, 1),
        Arguments.of(11, new int[] {1,1,1,1,1,1,1,1}, 0)
    );
  }

}
