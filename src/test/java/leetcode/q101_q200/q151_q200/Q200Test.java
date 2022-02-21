package leetcode.q101_q200.q151_q200;

import leetcode.q101_q200.q151_q200.Q200;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q200Test {

  Q200 q200 = new Q200();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(char[][] grid, int expected) {
    int actual = q200.numIslands(grid);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
            }, 1),
        Arguments.of(
            new char[][] {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','1','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','0'}
            }, 3)
    );
  }
}
