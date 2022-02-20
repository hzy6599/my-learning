package leetcode.q101_q200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q130Test {

  Q130 q130 = new Q130();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(char[][] board, char[][] expected) {
    q130.solve(board);
    Assertions.assertArrayEquals(expected, board);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new char[][] {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}},
            new char[][] {
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','O','X','X'}}
        ),
        Arguments.of(
            new char[][] {{'X'}},
            new char[][] {{'X'}}
        )
    );
  }

}
