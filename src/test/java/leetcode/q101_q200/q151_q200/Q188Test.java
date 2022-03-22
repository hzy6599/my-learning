package leetcode.q101_q200.q151_q200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q188Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int maxTransaction, int[] stocks, int expectedProfits) {
    int actualProfit = Q188.maxProfit(maxTransaction, stocks);
    Assertions.assertEquals(expectedProfits, actualProfit);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(2, new int[] {2,4,1}, 2),
        Arguments.of(2, new int[] {3,2,6,5,0,3}, 7));
  }

}
