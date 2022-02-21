package leetcode.q401_q500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q406Test {

  Q406 q406 = new Q406();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[][] people, int[][] expected) {
    int[][] actual = q406.reconstructQueue(people);
    Assertions.assertArrayEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}},
            new int[][]{{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}}),
        Arguments.of(
            new int[][]{{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}},
            new int[][]{{4,0},{5,0},{2,2},{3,2},{1,4},{6,0}})
    );
  }

}
