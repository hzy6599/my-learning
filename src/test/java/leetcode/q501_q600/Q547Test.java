package leetcode.q501_q600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q547Test {

  Q547 q547 = new Q547();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[][] isConnected, int expected) {
    int actual = q547.findCircleNum(isConnected);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[][] {{1,1,0},{1,1,0},{0,0,1}}, 2),
        Arguments.of(new int[][] {{1,0,0},{0,1,0},{0,0,1}}, 3)
    );
  }

}
