package leetcode.q101_q200.q101_q150;

import leetcode.definition.ListNode;
import leetcode.helper.listnode.ListNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q142Test {

  Q142 q142 = new Q142();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(ListNode head, ListNode expected) {
    ListNode actual = q142.detectCycle(head);
    if (null == expected) {
      Assertions.assertNull(actual);
    } else {
      Assertions.assertEquals(expected.val, actual.val);
    }
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(ListNodeHelper.buildCyclicListNode(new int[] {3,2,0,-4}, 1), new ListNode(2)),
        Arguments.of(ListNodeHelper.buildCyclicListNode(new int[] {1,2}, 0), new ListNode(1)),
        Arguments.of(ListNodeHelper.buildCyclicListNode(new int[] {1}, -1), null)
    );
  }

}
