package leetcode.q201_q300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q242Test {

  Q242 question = new Q242();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithArray(String origin, String result, boolean expectedResult) {
    boolean actualResult = question.isAnagram(origin, result);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("anagram", "nagaram", true),
        Arguments.of("rat", "car", false),
        Arguments.of("car", "rat", false)
    );
  }

}
