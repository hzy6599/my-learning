package leetcode.q101_q200.q101_q150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q122Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] prices, int expected) {
    int actual = Q122.maxProfit(prices);
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMath(int[] prices, int expected) {
    int actual = Q122.maxProfitMath(prices);
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testPeakValley(int[] prices, int expected) {
    int actual = Q122.maxProfitPeakValley(prices);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {7,1,5,3,6,4}, 7),
        Arguments.of(new int[] {1,2,3,4,5}, 4),
        Arguments.of(new int[] {7,6,4,3,1}, 0)
    );
  }

}
