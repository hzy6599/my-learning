package leetcode.q501_q600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q524Test {

  Q524 q524 = new Q524();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String string, List<String> dictionary, String expected) {
    String actual = q524.findLongestWord(string, dictionary);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            "abpcplea",
            Arrays.asList("ale","apple","monkey","plea"),
            "apple"),
        Arguments.of(
            "abpcplea",
            Arrays.asList("a","b","c"),
            "a")
    );
  }

}
