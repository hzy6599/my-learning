package leetcode.helper.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListHelperTest {

  @ParameterizedTest
  @MethodSource("dataForCompareArray")
  public void testCompareArrayListTrue(List<Integer> l1, List<Integer> l2, boolean expectedResult) {
    Assertions.assertEquals(expectedResult, ArrayListHelper.compareArrayList(l1, l2));
  }

  public static Stream<Arguments> dataForCompareArray() {
    return Stream.of(
        Arguments.of(Arrays.asList(1,2,3,4), Arrays.asList(1,2,3,4), true),
        Arguments.of(Arrays.asList(1,2,3,4), Arrays.asList(1,2,3), false),
        Arguments.of(Arrays.asList(1,2,3,4), Arrays.asList(1,2,3,5), false)
    );
  }

  @ParameterizedTest
  @MethodSource("dataForCompare2DArray")
  public void testCompare2DArrayListTrue(List<List<Integer>> l1, List<List<Integer>> l2, boolean expectedResult) {
    Assertions.assertEquals(expectedResult, ArrayListHelper.compare2DArrayList(l1, l2));
  }

  public static Stream<Arguments> dataForCompare2DArray() {
    return Stream.of(
        Arguments.of(
            Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(1,3)),
            Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(1,3)),
            true),
        Arguments.of(
            Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(1,3)),
            Arrays.asList(
                Arrays.asList(1,2)),
            false),
        Arguments.of(
            Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(1,3)),
            Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(2,3)),
            false)
    );
  }

}
