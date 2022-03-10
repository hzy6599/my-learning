package leetcode.q201_q300;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q221Test {

  Q221 q221 = new Q221();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(char[][] matrix, int expected) {
    int actual = q221.maximalSquare(matrix);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new char[][] {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}},
            4
        ),
        Arguments.of(
            new char[][] {
                {'1','1','1','1','1'},
                {'1','1','1','1','1'},
                {'0','0','0','0','0'},
                {'1','1','1','1','1'},
                {'1','1','1','1','1'}},
            4
        )
    );
  }

}
