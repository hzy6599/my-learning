package leetcode.q1_q100.q1_q50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q5Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String input, String expectedOutput) {
    String actualOutput = Q5.longestPalindrome(input);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("babad", "aba"),
        Arguments.of("cbbd", "bb"));
  }

}
