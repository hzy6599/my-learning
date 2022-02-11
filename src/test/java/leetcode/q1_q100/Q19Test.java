package leetcode.q1_q100;

import leetcode.definition.ListNode;
import leetcode.helper.listnode.ListNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q19Test {

  Q19 question = new Q19();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(int[] listNodes, int n, int[] expectedNodes) {
    ListNode head = ListNodeHelper.buildListNodeWithIntegerArray(listNodes);
    ListNode expected = ListNodeHelper.buildListNodeWithIntegerArray(expectedNodes);
    ListNode actual = question.removeNthFromEnd(head, n);
    Assertions.assertTrue(ListNodeHelper.compareListNodes(expected, actual));
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(new int[]{1,2,3,4,5}, 2, new int[] {1,2,3,5}),
        Arguments.of(new int[]{1}, 1, new int[] {}),
        Arguments.of(new int[]{1,2}, 1, new int[] {1})
    );
  }
}
