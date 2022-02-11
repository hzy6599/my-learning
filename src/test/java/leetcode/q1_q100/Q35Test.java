package leetcode.q1_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q35Test {

  private Q35 solution = new Q35();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int target, int expected) {
    int actual = solution.searchInsert(nums, target);
    Assertions.assertEquals(expected, actual);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[]{1,3,5,6}, 5, 2),
        Arguments.of(new int[]{1,3,5,6}, 2, 1),
        Arguments.of(new int[]{1,3,5,6}, 7, 4)
    );
  }


}
