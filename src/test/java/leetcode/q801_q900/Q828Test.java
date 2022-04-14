package leetcode.q801_q900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q828Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void uniqueLetterStringBruteForce(String s, int expectedUniqueNumber) {
    int actualUniqueNumber = Q828.uniqueLetterStringBruteForce(s);
    Assertions.assertEquals(expectedUniqueNumber, actualUniqueNumber);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void uniqueLetterStringLinear(String s, int expectedUniqueNumber) {
    int actualUniqueNumber = Q828.uniqueLetterStringLinear(s);
    Assertions.assertEquals(expectedUniqueNumber, actualUniqueNumber);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("ABCBD", 27),
        Arguments.of("ABC", 10),
        Arguments.of("ABA", 8),
        Arguments.of("LEETCODE", 92)
    );
  }


}
