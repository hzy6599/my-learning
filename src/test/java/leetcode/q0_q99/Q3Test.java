package leetcode.q0_q99;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q3Test {

  Q3 question = new Q3();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s, int expected) {
    int actual = question.lengthOfLongestSubstring(s);
    Assertions.assertEquals(expected, actual);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("abcabcbb", 3),
        Arguments.of("bbbbb", 1),
        Arguments.of("pwwkew", 3)
    );
  }

}
