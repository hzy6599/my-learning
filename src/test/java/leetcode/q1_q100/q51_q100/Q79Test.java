package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q79Test {

  Q79 q79 = new Q79();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(char[][] board, String word, boolean expected) {
    boolean actual = q79.exist(board, word);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new char[][] {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}},
            "ABCCED",
            true
        ),
        Arguments.of(
            new char[][] {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}},
            "SEE",
            true
        ),
        Arguments.of(
            new char[][] {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}},
            "ABCB",
            false
        )
    );
  }

}
