package leetcode.q101_q200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q135Test {

  Q135 q135 = new Q135();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] rating, int expected) {
    int actual = q135.candy(rating);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,0,2}, 5),
        Arguments.of(new int[] {1,2,2}, 4),
        Arguments.of(new int[] {1,3,4,5,2}, 11)
    );
  }

}
