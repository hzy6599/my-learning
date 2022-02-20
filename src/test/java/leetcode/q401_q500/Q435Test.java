package leetcode.q401_q500;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q435Test {

  Q435 q435 = new Q435();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test() {

  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[][] {{1,2},{2,3},{3,4},{1,3}}, 1),
        Arguments.of(new int[][] {{1,2},{1,2},{1,2}}, 2),
        Arguments.of(new int[][] {{1,2},{2,3}}, 0)
    );
  }

}
