package leetcode.q1201_q1300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q1249Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testWithStack(String input, String expectedOutput) {
    String actualOutput = Q1249.minRemoveToMakeValidTwoPassWithStack(input);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testWithStringBuilderOne(String input, String expectedOutput) {
    String actualOutput = Q1249.minRemoveToMakeValidTwoPassWithStringBuilder(input);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testWithStringBuilderTwo(String input, String expectedOutput) {
    String actualOutput = Q1249.minRemoveToMakeValidTwoPassWithStringBuilderTwo(input);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("lee(t(c)o)de)", "lee(t(c)o)de"),
        Arguments.of("a)b(c)d", "ab(c)d"),
        Arguments.of("))((", "")
    );
  }

}
