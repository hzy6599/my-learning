package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q31Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] input, int[] expectedNextPermutation) {
    Q31.nextPermutation(input);
    Assertions.assertArrayEquals(expectedNextPermutation, input);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,2,3}, new int[] {1,3,2}),
        Arguments.of(new int[] {3,2,1}, new int[] {1,2,3}),
        Arguments.of(new int[] {1,1,5}, new int[] {1,5,1}),
        Arguments.of(new int[] {6,4,2,3,1,5}, new int[] {6,4,2,3,5,1})
    );
  }

}
