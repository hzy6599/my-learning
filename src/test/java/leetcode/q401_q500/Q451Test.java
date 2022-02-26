package leetcode.q401_q500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q451Test {

  Q451 q451 = new Q451();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String input, String expected) {
    String actual = q451.frequencySort(input);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("tree", "eetr"),
        Arguments.of("cccaaa", "cccaaa"),
        Arguments.of("Aabb", "bbAa")
    );
  }

}
