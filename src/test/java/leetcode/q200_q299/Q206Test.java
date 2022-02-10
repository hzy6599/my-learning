package leetcode.q200_q299;

import leetcode.definition.ListNode;
import leetcode.helper.listNode.ListNodeHelper;
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
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2,3,4,5}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{5,4,3,2,1})
        ),
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{2,1})
        ),
        Arguments.of(
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{}),
            ListNodeHelper.buildListNodeWithIntegerArray(new int[]{})
        )
    );
  }
}
