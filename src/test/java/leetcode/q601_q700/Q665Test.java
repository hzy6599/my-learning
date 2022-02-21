package leetcode.q601_q700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q665Test {

  Q665 q665 = new Q665();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, boolean expected) {
    boolean actual = q665.checkPossibility(nums);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {4,2,3}, true),
        Arguments.of(new int[] {4,2,1}, false),
        Arguments.of(new int[] {5,7,1,8}, true)
    );
  }

}
