package leetcode.q401_q500;

import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q417Test {

  Q417 q417 = new Q417();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testRecursiveMethod(int[][] heights, List<List<Integer>> expected) {
    List<List<Integer>> actual = q417.pacificAtlanticRecursive(heights);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expected, actual));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testIterativeMethod(int[][] heights, List<List<Integer>> expected) {
    List<List<Integer>> actual = q417.pacificAtlanticIterative(heights);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expected, actual));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}
            },
            Arrays.asList(
                Arrays.asList(0,4),
                Arrays.asList(1,3),
                Arrays.asList(1,4),
                Arrays.asList(2,2),
                Arrays.asList(3,0),
                Arrays.asList(3,1),
                Arrays.asList(4,0)
            )
        ),
        Arguments.of(
            new int[][] {
                {2,1},
                {1,2}
            },
            Arrays.asList(
                Arrays.asList(0,0),
                Arrays.asList(0,1),
                Arrays.asList(1,0),
                Arrays.asList(1,1)
            )
        )
    );
  }

}
