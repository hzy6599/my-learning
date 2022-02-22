package leetcode.q101_q200.q151_q200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q154Test {

  Q154 q154 = new Q154();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int expected) {
    int actual = q154.findMin(nums);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,3,5}, 1),
        Arguments.of(new int[] {2,2,2,0,1}, 0)
    );
  }

}
