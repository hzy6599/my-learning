package leetcode.q1701_q1800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q1762Test {

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] heights, int[] expectedBuildingIndexes) {
    int[] actualBuildingIndexes = Q1762.findBuildings(heights);
    Assertions.assertArrayEquals(expectedBuildingIndexes, actualBuildingIndexes);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[]{4,2,3,1}, new int[]{0,2,3}),
        Arguments.of(new int[]{4,3,2,1}, new int[]{0,1,2,3}),
        Arguments.of(new int[]{1,3,2,4}, new int[]{3})

    );
  }

}
