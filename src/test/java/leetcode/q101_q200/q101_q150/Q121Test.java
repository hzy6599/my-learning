package leetcode.q101_q200.q101_q150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q121Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithConstantSpace(int[] stocks, int expectedProfit) {
    int actualProfit = Q121.maxProfit(stocks);
    Assertions.assertEquals(expectedProfit, actualProfit);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {7,1,5,3,6,4}, 5),
        Arguments.of(new int[] {7,6,4,3,1}, 0)
    );
  }

}
