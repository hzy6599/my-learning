package leetcode.q401_q500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q415Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s1, String s2, String expected) {
    String actual = Q415.addStrings(s1, s2);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("11", "123", "134"),
        Arguments.of("456", "77", "533"),
        Arguments.of("0", "0", "0")
    );
  }

}
