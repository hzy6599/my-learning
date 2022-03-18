package interview.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NumberOfSumDivisibleByMTest {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] arr, int target, int expected) {
    int actual = NumberOfSumDivisibleByM.numberOfSumDivisibleByM(arr, target);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1, 3, 2, 6, 4}, 6, 1),
        Arguments.of(new int[] {2, 2, 3, 3}, 5, 4),
        Arguments.of(new int[] {1, 3, 5}, 12, 0));
  }

}
