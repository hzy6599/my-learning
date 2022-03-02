package leetcode.q1_q100.q51_q100;

import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q51Test {

  Q51 q51 = new Q51();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int n, List<List<String>> expected) {
    List<List<String>> actual = q51.solveNQueens(n);
    Assertions.assertEquals(expected.size(), actual.size());
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            4,
            Arrays.asList(
                Arrays.asList(".Q..","...Q","Q...","..Q."),
                Arrays.asList("..Q.","Q...","...Q",".Q.."))
        ),
        Arguments.of(
            1,
            Arrays.asList(
                Arrays.asList("Q")
            )
        )
    );
  }

}
