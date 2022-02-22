package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q81Test {

  Q81 q81 = new Q81();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int target, boolean expected) {
    boolean actual = q81.search(nums, target);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {2,5,6,0,0,1,2}, 0, true),
        Arguments.of(new int[] {2,5,6,0,0,1,2}, 3, false)
    );
  }

}
