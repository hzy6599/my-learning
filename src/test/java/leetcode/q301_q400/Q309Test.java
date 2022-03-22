package leetcode.q301_q400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q309Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testDP1(int[] prices, int expectedProfit) {
    int actualProfit = Q309.maxProfitDP1(prices);
    Assertions.assertEquals(expectedProfit, actualProfit);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testDP2(int[] prices, int expectedProfit) {
    int actualProfit = Q309.maxProfitDP2(prices);
    Assertions.assertEquals(expectedProfit, actualProfit);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,2,3,0,2}, 3),
        Arguments.of(new int[] {1}, 0)
    );
  }
}
