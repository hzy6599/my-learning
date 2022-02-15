package leetcode.q201_q300;

import leetcode.definition.ListNode;
import leetcode.helper.listnode.ListNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q206Test {

  Q206 question = new Q206();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethod(ListNode input, ListNode expectedResult) {
    ListNode actualResult = question.reverseList(input);
    Assertions.assertTrue(ListNodeHelper.compareListNodes(expectedResult, actualResult));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            ListNodeHelper.buildListNode(new int[]{1,2,3,4,5}),
            ListNodeHelper.buildListNode(new int[]{5,4,3,2,1})
        ),
        Arguments.of(
            ListNodeHelper.buildListNode(new int[]{1,2}),
            ListNodeHelper.buildListNode(new int[]{2,1})
        ),
        Arguments.of(
            ListNodeHelper.buildListNode(new int[]{}),
            ListNodeHelper.buildListNode(new int[]{})
        )
    );
  }
}
