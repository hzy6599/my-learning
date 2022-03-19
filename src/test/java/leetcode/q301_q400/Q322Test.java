package leetcode.q301_q400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q322Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] coins, int amount, int expected) {
    int minCoinsNeeded = Q322.coinChange(coins, amount);
    Assertions.assertEquals(expected, minCoinsNeeded);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,2,5}, 11, 3),
        Arguments.of(new int[] {2}, 3, -1),
        Arguments.of(new int[] {1}, 0, 0)
    );
  }

}
