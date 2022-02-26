package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q75Test {

  Q75 q75 = new Q75();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] actual, int[] expected) {
    q75.sortColors(actual);
    Assertions.assertArrayEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {2,0,2,1,1,0}, new int[] {0,0,1,1,2,2}),
        Arguments.of(new int[] {2,0,1}, new int[] {0,1,2})
    );
  }

}
