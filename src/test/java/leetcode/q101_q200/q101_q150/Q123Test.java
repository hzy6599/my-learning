package leetcode.q101_q200.q101_q150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q123Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testDP(int[] stocks, int expectedProfit) {
    int actualProfit = Q123.maxProfitDP(stocks);
    Assertions.assertEquals(expectedProfit, actualProfit);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testOneRun(int[] stocks, int expectedProfit) {
    int actualProfit = Q123.maxProfitOneRun(stocks);
    Assertions.assertEquals(expectedProfit, actualProfit);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {3,3,5,0,3,1,4}, 6),
        Arguments.of(new int[] {1,2,3,4,5}, 4),
        Arguments.of(new int[] {7,6,4,3,1}, 0));
  }


}
