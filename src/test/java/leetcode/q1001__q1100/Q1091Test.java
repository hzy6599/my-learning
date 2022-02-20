package leetcode.q1001__q1100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q1091Test {

  Q1091 q1091 = new Q1091();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[][] grid, int expected) {
    int actual = q1091.shortestPathBinaryMatrix(grid);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[][] {{0,1},{1,0}}, 2),
        Arguments.of(new int[][] {{0,0,0},{1,1,0},{1,1,0}}, 4),
        Arguments.of(new int[][] {{1,0,0},{1,1,0},{1,1,0}}, -1));
  }
}
