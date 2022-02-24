package leetcode.q201_q300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q215Test {

  Q215 q215 = new Q215();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int k, int expected) {
    int actual = q215.findKthLargest(nums, k);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {3,2,1,5,6,4}, 2, 5),
        Arguments.of(new int[] {3,2,3,1,2,4,5,5,6}, 4, 4)
    );
  }

}
