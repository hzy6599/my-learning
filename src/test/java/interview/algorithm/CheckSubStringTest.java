package interview.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CheckSubStringTest {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s1, String s2, boolean expected) {
    boolean actual = CheckSubString.dictionary(s1, s2);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("abcdefg", "dfe", true),
        Arguments.of("leetcode", "tce", true),
        Arguments.of("testcase", "no", false));
  }
}
