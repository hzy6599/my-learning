package leetcode.q1_q100.q51_q100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q76Test {

  Q76 q76 = new Q76();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s, String t, String expected) {
    String actual = q76.minWindow(s, t);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("ADOBECODEBANC", "ABC", "BANC"),
        Arguments.of("a", "a", "a"),
        Arguments.of("a", "aa", "")
    );
  }


}
