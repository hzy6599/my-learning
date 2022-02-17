package leetcode.q401_q500;

import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q438Test {

  Q438 q438 = new Q438();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s, String p, List<Integer> expected) {
    List<Integer> actual = q438.findAnagrams(s, p);
    Assertions.assertTrue(ArrayListHelper.compareArrayList(expected, actual));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("cbaebabacd", "abc", Arrays.asList(0, 6)),
        Arguments.of("abab", "ab", Arrays.asList(0,1,2))
    );
  }

}
