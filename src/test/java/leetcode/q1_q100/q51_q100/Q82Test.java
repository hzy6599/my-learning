package leetcode.q1_q100.q51_q100;

import leetcode.definition.ListNode;
import leetcode.helper.listnode.ListNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q82Test {

  Q82 question = new Q82();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(ListNode head, ListNode expectedResult) {
    ListNode actualResult = question.deleteDuplicates(head);
    Assertions.assertTrue(ListNodeHelper.compareListNodes(expectedResult, actualResult));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            ListNodeHelper.buildListNode(new int[]{1,2,3,3,4,4,5}),
            ListNodeHelper.buildListNode(new int[]{1,2,5})
        ),
        Arguments.of(
            ListNodeHelper.buildListNode(new int[]{1,1,1,2,3}),
            ListNodeHelper.buildListNode(new int[]{2,3})
        ),
        Arguments.of(
            ListNodeHelper.buildListNode(new int[]{1,1}),
            ListNodeHelper.buildListNode(new int[]{})
        )
    );
  }
}
