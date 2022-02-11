package leetcode.q0_q99;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q20Test {

  Q20 question = new Q20();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s, boolean expectedResult) {
    boolean actualResult = question.isValid(s);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("()", true),
        Arguments.of("()[]{}", true),
        Arguments.of("(]", false)
    );
  }

}
