package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q90Test {

    Q90 q90 = new Q90();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, List<List<Integer>> expected) {
    List<List<Integer>> actual = q90.subsetsWithDupBackTracking(nums);
    Assertions.assertEquals(expected.size(), actual.size());
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[] {1,2,2},
            Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(1,2),
                Arrays.asList(1,2,2),
                Arrays.asList(2),
                Arrays.asList(2,2)
            )),
        Arguments.of(
            new int[] {0},
            Arrays.asList(
                Arrays.asList(),
                Arrays.asList(0)
            ))
    );
  }

}
