package leetcode.q301_q400;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q383Test {

  Q383 question = new Q383();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithMap(String ransomNote, String magazine, boolean expectedResult) {
    boolean actualResult = question.canConstructWithMap(ransomNote, magazine);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithArray(String ransomNote, String magazine, boolean expectedResult) {
    boolean actualResult = question.canConstructArray(ransomNote, magazine);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("a", "b", false),
        Arguments.of("aa", "ab", false),
        Arguments.of("aa", "aab", true)
    );
  }

}
