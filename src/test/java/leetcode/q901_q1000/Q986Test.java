package leetcode.q901_q1000;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q986Test {

  Q986 q986 = new Q986();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[][] firstList, int[][] secondList, int[][] expectedList) {
    int[][] actualList = q986.intervalIntersection(firstList, secondList);
    Assertions.assertArrayEquals(expectedList, actualList);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {{0,2},{5,10},{13,23},{24,25}},
            new int[][] {{1,5},{8,12},{15,24},{25,26}},
            new int[][] {{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}}
        ),
        Arguments.of(
            new int[][] {{1,3},{5,9}},
            new int[][] {},
            new int[][] {}
        ));
  }
}
