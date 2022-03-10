package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class Q39Test {

  Q39 q39 = new Q39();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] candidates, int target, int[][] expected) {
    List<List<Integer>> actual = q39.combinationSum(candidates, target);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {2,3,6,7}, 7, new int[][] {{2,2,3},{7}}),
        Arguments.of(new int[] {2,3,5}, 8, new int[][] {{2,2,2,2},{2,3,3},{3,5}}),
        Arguments.of(new int[] {2}, 1, new int[][] {})
    );
  }

}
