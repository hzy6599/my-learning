package leetcode.q701_q800;

import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q797Test {

  Q797 q797 = new Q797();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testBFSMethod(int[][] graph, List<List<Integer>> expected) {
    List<List<Integer>> actual = q797.allPathsSourceTargetDFS(graph);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expected, actual));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {{1,2},{3},{3},{}},
            Arrays.asList(
                Arrays.asList(0,1,3),
                Arrays.asList(0,2,3)
            )
        ),
        Arguments.of(
            new int[][] {{4,3,1},{3,2,4},{3},{4},{}},
            Arrays.asList(
                Arrays.asList(0,4),
                Arrays.asList(0,3,4),
                Arrays.asList(0,1,3,4),
                Arrays.asList(0,1,2,3,4),
                Arrays.asList(0,1,4)
            )
        )
    );
  }

}
