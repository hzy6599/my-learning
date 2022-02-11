package leetcode.q1_q100.q1_q50;

import leetcode.q1_q100.q1_q50.Q46;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q46Test {

  Q46 question = new Q46();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, List<List<Integer>> expected) {
    List<List<Integer>> actual = question.permute(nums);
//    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(actual, expected));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[]{1,2,3},
            Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,2,1),
                Arrays.asList(3,1,2)
            )),
        Arguments.of(
            new int[]{0,1},
            Arrays.asList(
                Arrays.asList(0,1),
                Arrays.asList(1,0)
            )),
        Arguments.of(
            new int[]{1},
            Arrays.asList(Arrays.asList(1)))
    );
  }

}
