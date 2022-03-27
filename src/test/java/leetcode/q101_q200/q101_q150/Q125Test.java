package leetcode.q101_q200.q101_q150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q125Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String inputString, boolean expected) {
    boolean isPalindrome = Q125.isPalindrome(inputString);
    Assertions.assertEquals(expected, isPalindrome);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("A man, a plan, a canal: Panama", true),
        Arguments.of("race a car", false),
        Arguments.of(" ", true),
        Arguments.of("ab_a", true)
    );
  }

}
