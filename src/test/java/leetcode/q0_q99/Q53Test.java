package leetcode.q0_q99;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q53Test {

  Q53 question = new Q53();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] input, int expected) {
    int actual = question.maxSubArray(input);
    Assertions.assertEquals(expected, actual);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6),
        Arguments.of(new int[]{1}, 1),
        Arguments.of(new int[]{5,4,-1,7,8}, 23)
    );
  }

}
