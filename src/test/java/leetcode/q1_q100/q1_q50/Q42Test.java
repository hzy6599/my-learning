package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q42Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void trapBruteForce(int[] heights, int expectedWater) {
    int actualWater = Q42.trapBruteForce(heights);
    Assertions.assertEquals(expectedWater, actualWater);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void trapDP(int[] heights, int expectedWater) {
    int actualWater = Q42.trapDP(heights);
    Assertions.assertEquals(expectedWater, actualWater);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void trapStack(int[] heights, int expectedWater) {
    int actualWater = Q42.trapStack(heights);
    Assertions.assertEquals(expectedWater, actualWater);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void trapTwoPointer(int[] heights, int expectedWater) {
    int actualWater = Q42.trapTwoPointer(heights);
    Assertions.assertEquals(expectedWater, actualWater);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}, 6),
        Arguments.of(new int[] {4,2,0,3,2,5}, 9)
    );
  }

}
