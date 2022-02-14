package leetcode.q101_q200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q162Test {

  Q162 question = new Q162();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int expectedResult) {
    Assertions.assertEquals(expectedResult, question.findPeakElement(nums));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,2,3,1}, 2),
        Arguments.of(new int[] {1,2,1,3,5,6,4}, 5)
    );
  }

}
