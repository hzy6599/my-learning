package leetcode.q1_q100.q1_q50;

import leetcode.definition.ListNode;
import leetcode.helper.listnode.ListNodeHelper;
import leetcode.q1_q100.q1_q50.Q21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q21Test {

  Q21 question = new Q21();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(ListNode l1, ListNode l2, ListNode expectedResult) {
    ListNode actualResult = question.mergeTwoListsRecursion(l1, l2);
    Assertions.assertTrue(ListNodeHelper.compareListNodes(expectedResult, actualResult));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2,4}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,3,4}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,1,2,3,4,4})),
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{})),
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{0}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{0}))
    );
  }

}
