package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q11Test {

  Q11 q11 = new Q11();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test() {

  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,8,6,2,5,4,8,3,7}, 49),
        Arguments.of(new int[] {1,1}, 1));
  }

}
