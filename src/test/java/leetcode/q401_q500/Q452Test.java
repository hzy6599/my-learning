package leetcode.q401_q500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q452Test {

  Q452 q452 = new Q452();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[][] points, int expected) {
    int actual = q452.findMinArrowShots(points);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[][] {{-2147483646,-2147483645},{2147483646,2147483647}}, 2),
        Arguments.of(new int[][] {{10,16},{2,8},{1,6},{7,12}}, 2),
        Arguments.of(new int[][] {{1,2},{3,4},{5,6},{7,8}}, 4),
        Arguments.of(new int[][] {{1,2},{2,3},{3,4},{4,5}}, 2)
    );
  }

}
