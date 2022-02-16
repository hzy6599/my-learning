package leetcode.q801_q900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q844Test {

  Q844 question = new Q844();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testStack(String a, String b, boolean expected) {
    boolean actual = question.backspaceCompareStack(a, b);
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testBackwardMethod(String a, String b, boolean expected) {
    boolean actual = question.backspaceCompareBackward(a, b);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("ab#c", "ad#c", true),
        Arguments.of("ab##", "c#d#", true),
        Arguments.of("a#c", "b", false),
        Arguments.of("a##c", "#a#c", true),
        Arguments.of("y#fo##f", "y#f#o##f", true),
        Arguments.of("abcd", "bbcd", false)
    );
  }














}
