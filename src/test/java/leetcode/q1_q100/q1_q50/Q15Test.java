package leetcode.q1_q100.q1_q50;

import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q15Test {

  Q15 question = new Q15();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void threeSumSortingWithTwoPointer(int[] input, List<List<Integer>> expectedResult) {
    List<List<Integer>> actualResult = question.threeSumSortingWithTwoPointer(input);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expectedResult, actualResult));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void threeSumSortingWithTwoSum(int[] input, List<List<Integer>> expectedResult) {
    List<List<Integer>> actualResult = question.threeSumSortingWithTwoSum(input);
    ArrayListHelper.sort2DArrayList(actualResult);
    ArrayListHelper.sort2DArrayList(expectedResult);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expectedResult, actualResult));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void threeSumNoSortingWithTwoSum(int[] input, List<List<Integer>> expectedResult) {
    List<List<Integer>> actualResult = question.threeSumNoSortingWithTwoSum(input);
    ArrayListHelper.sort2DArrayList(actualResult);
    ArrayListHelper.sort2DArrayList(expectedResult);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expectedResult, actualResult));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[]{-1,0,1,2,-1,4},
            Arrays.asList(
                Arrays.asList(-1,-1,2),
                Arrays.asList(-1,0,1))),
        Arguments.of(
            new int[]{},
            Arrays.asList()),
        Arguments.of(
            new int[]{0},
            Arrays.asList())
    );
  }


}
