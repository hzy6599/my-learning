package leetcode.q401_q500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q474Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String[] strings, int m, int n, int expected) {
    int actual = Q474.findMaxForm(strings, m, n);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new String[] {"10","0001","111001","1","0"}, 5, 3, 4),
        Arguments.of(new String[] {"10","0","1"}, 1, 1, 2)
    );
  }

}
