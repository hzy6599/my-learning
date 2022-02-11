package leetcode.q1_q100.q51_q100;

import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q77Test {

  Q77 question = new Q77();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int n, int k, List<List<Integer>> expectedResult) {
    List<List<Integer>> actualResult = question.combine(n, k);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expectedResult, actualResult));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            4,
            2,
            Arrays.asList(
                Arrays.asList(2,4),
                Arrays.asList(3,4),
                Arrays.asList(2,3),
                Arrays.asList(1,2),
                Arrays.asList(1,3),
                Arrays.asList(1,4)
            )),
        Arguments.of(
            1,
            1,
            Arrays.asList(
                Arrays.asList(1)
            ))
    );
  }

}
