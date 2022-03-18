package interview.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * There is a tofu with size 10000 * 10000 * 10000
 * the bottom left corner at (0,0,0) and top right corner at (10000, 10000, 10000)
 * We will have a 2D array where each element [a,b] describe:
 * 1. a = dimension, range of a will be [1,2,3], represent three different axis
 * 2. b = location where we cut the tofu
 * Given a 2D array describing all the cuts, return the size of the largest sub-tofu
 */
public class CutTofuTest {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[][] cuts, long expected) {
    long actual = CutTofu.maxCut(cuts);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {
                {1,5000},
                {2,5000},
                {3,5000}
            },
            125000000000L
        )
    );
  }

}
