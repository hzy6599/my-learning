package leetcode.q601_q700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q605Test {

  Q605 q605 = new Q605();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] flowerbed, int n, boolean expected) {
    boolean actual = q605.canPlaceFlowers(flowerbed, n);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,0,0,0,1}, 1, true),
        Arguments.of(new int[] {1,0,0,0,1}, 2, false),
        Arguments.of(new int[] {1,0,0,1}, 1, false)
    );
  }

}
