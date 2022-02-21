package leetcode.q701_q800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q763Test {

  Q763 q763 = new Q763();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(String s, List<Integer> expected) {
    List<Integer> actual = q763.partitionLabels(s);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("ababcbacadefegdehijhklij", Arrays.asList(9,7,8)),
        Arguments.of("eccbbbbdec", Arrays.asList(10)),
        Arguments.of("caedbdedda", Arrays.asList(1, 9))
    );
  }

}
