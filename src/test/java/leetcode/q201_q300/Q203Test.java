package leetcode.q201_q300;

import leetcode.definition.ListNode;
import leetcode.helper.listnode.ListNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q203Test {

  Q203 question = new Q203();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethod(ListNode input, int target, ListNode expectedResult) {
    ListNode actualResult = question.removeElements(input, target);
    Assertions.assertTrue(ListNodeHelper.compareListNodes(expectedResult, actualResult));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithRecursion(ListNode input, int target, ListNode expectedResult) {
    ListNode actualResult = question.removeElementsRecursion(input, target);
    Assertions.assertTrue(ListNodeHelper.compareListNodes(expectedResult, actualResult));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2,6,3,4,5,6}),
            6,
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2,3,4,5})
        ),
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{}),
            1,
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{})
        ),
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{7,7,7,7}),
            7,
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{})
        )
    );
  }

}
