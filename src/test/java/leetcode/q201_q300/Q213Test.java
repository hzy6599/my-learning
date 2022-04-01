package leetcode.q201_q300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q213Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] arr, int expectedMoney) {
    int actualMoney = Q213.rob(arr);
    Assertions.assertEquals(expectedMoney, actualMoney);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {3,2,1}, 3),
        Arguments.of(new int[] {1,2,3,1}, 4),
        Arguments.of(new int[] {1,2}, 2),
        Arguments.of(new int[] {3}, 3)
    );
  }

}
