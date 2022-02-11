package leetcode.q1_q100.q1_q50;

import leetcode.q1_q100.q1_q50.Q10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q10Test {

  Q10 question = new Q10();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s, String p, boolean expected) {
    boolean actual = question.isMatch(s, p);
    Assertions.assertEquals(actual, expected);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("aa", "a", false),
        Arguments.of("aa", "a*", true),
        Arguments.of("ab", ".*", true)
    );
  }
}
