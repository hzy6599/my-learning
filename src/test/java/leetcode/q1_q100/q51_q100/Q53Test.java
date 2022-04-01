package leetcode.q1_q100.q51_q100;

import leetcode.q1_q100.q51_q100.Q53;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q53Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void maxSubArrayDPWithArray(int[] input, int expected) {
    int actual = Q53.maxSubArrayDPWithArray(input);
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void maxSubArrayDPWithConstantSpace(int[] input, int expected) {
    int actual = Q53.maxSubArrayDPWithConstantSpace(input);
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
