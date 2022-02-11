package leetcode.q0_q99;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q1Test {

  Q1 question = new Q1();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int target, int[] expected) {
    int[] actual = question.twoSum(nums, target);
    Assertions.assertArrayEquals(expected, actual);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
        Arguments.of(new int[]{3,2,4}, 6, new int[]{1,2}),
        Arguments.of(new int[]{3,3}, 6, new int[]{0,1})
    );
  }

}
