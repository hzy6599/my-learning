package leetcode.q401_q500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q455Test {

  Q455 q455 = new Q455();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] g, int[] s, int expected) {
    int actual = q455.findContentChildren(g, s);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[] {1,2,3}, new int[] {1,1}, 1),
        Arguments.of(new int[] {1,2}, new int[] {1,2,3}, 2)
    );
  }

}
