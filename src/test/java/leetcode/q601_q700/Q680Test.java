package leetcode.q601_q700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q680Test {

  Q680 q680 = new Q680();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s, boolean expected) {
    boolean actual = q680.validPalindrome(s);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("aba", true),
        Arguments.of("abca", true),
        Arguments.of("abc", false),
        Arguments.of("abbca", true),
        Arguments.of("acbba", true),
        Arguments.of("acdbbcda", false),
        Arguments.of("acdbbefa", false),
        Arguments.of("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga", true)
    );
  }
}
