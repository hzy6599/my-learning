package leetcode.q1_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q74Test {

  Q74 question = new Q74();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[][] inputMatrix, int searchTarget, boolean expected) {
    boolean actual = question.searchMatrix(inputMatrix, searchTarget);
    Assertions.assertEquals(expected, actual);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60},
            },
            3,
            true),
        Arguments.of(
            new int[][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60},
            },
            13,
            false),
        Arguments.of(
            new int[][] {
                {1,1}
            },
            2,
            false)
    );
  }

}
