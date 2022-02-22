package leetcode.q501_q600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q540Test {

                                                                                                Q540 q540 = new Q540();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] nums, int expected) {
    int actual = q540.singleNonDuplicate(nums);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,1,2,3,3,4,4,8,8}, 2),
        Arguments.of(new int[] {3,3,7,7,10,11,11}, 10)
    );
  }



}
