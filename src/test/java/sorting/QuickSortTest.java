package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class QuickSortTest {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] actual, int[] expected) {
    QuickSort.quickSort(actual, 0, actual.length - 1);
    Assertions.assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethod2(int[] actual, int[] expected) {
    QuickSort.quickSortTwo(actual, 0, actual.length - 1);
    Assertions.assertArrayEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[] {5,4,3,2,1},
            new int[] {1,2,3,4,5}
        ),
        Arguments.of(
            new int[] {1,5,3,2,4},
            new int[] {1,2,3,4,5}
        )
    );
  }

}
