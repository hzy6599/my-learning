package interview.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MinWaitingTimeTest {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodMinHeap(int[] arr, int m, int expected) {
    int actual = MinWaitingTime.waitingTimeMinHeap(arr, m);
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodBinarySearch(int[] arr, int m, int expected) {
    int actual = MinWaitingTime.waitingTimeBinarySearch(arr, m);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[] {2,3,5},
            6,
            5
        ));
  }

}
