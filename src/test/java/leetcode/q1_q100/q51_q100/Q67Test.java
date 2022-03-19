package leetcode.q1_q100.q51_q100;

import leetcode.q401_q500.Q415;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q67Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s1, String s2, String expected) {
    String actual = Q67.addBinary(s1, s2);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("11", "1", "100"),
        Arguments.of("1010", "1011", "10101"),
        Arguments.of("0", "0", "0")
    );
  }

}
