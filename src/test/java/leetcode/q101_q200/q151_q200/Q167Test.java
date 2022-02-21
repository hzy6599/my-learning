package leetcode.q101_q200.q151_q200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q167Test {

  Q167 q167 = new Q167();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] numbers, int target, int[] expected) {
    int[] actual = q167.twoSum(numbers, target);
    Assertions.assertArrayEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {2,7,11,15}, 9, new int[] {1,2}),
        Arguments.of(new int[] {2,3,4}, 6, new int[] {1,3}),
        Arguments.of(new int[] {-1,0}, -1, new int[] {1,2})
    );
  }

}
