package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SortingTest {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testQuickSortOne(int[] actual, int[] expected) {
    Sorting.quickSort(actual, 0, actual.length - 1);
    Assertions.assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMergeSort(int[] actual, int[] expected) {
    Sorting.mergeSort(actual, 0, actual.length - 1);
    Assertions.assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testInsertionSort(int[] actual, int[] expected) {
    Sorting.insertionSort(actual);
    Assertions.assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testBubbleSort(int[] actual, int[] expected) {
    Sorting.bubbleSort(actual);
    Assertions.assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testSelectionSort(int[] actual, int[] expected) {
    Sorting.selectionSort(actual);
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
