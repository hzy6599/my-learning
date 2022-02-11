package leetcode.q100_q199;

import leetcode.definition.ListNode;
import leetcode.helper.listnode.ListNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q141Test {

  Q141 question = new Q141();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void test(ListNode listNode, int pos, boolean expectedResult) {
    if (pos != -1) {
      processListNode(listNode, pos);
    }
    boolean actualResult = question.hasCycle(listNode);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testMethodWithTwoPointer(ListNode listNode, int pos, boolean expectedResult) {
    if (pos != -1) {
      processListNode(listNode, pos);
    }
    boolean actualResult = question.hasCycleTwoPointer(listNode);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  private void processListNode(ListNode listNode, int pos) {
    ListNode position = null;
    int index = 0;
    while (listNode.next != null) {
      if (index == pos) {
        position = listNode;
      }
      listNode = listNode.next;
      index++;
    }
    listNode.next = position;
  }

  public static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(ListNodeHelper.buildListNodeWithIntegerArray(new int[]{3,2,0,-4}), 1, true),
        Arguments.of(ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1,2}), 0, true),
        Arguments.of(ListNodeHelper.buildListNodeWithIntegerArray(new int[]{1}), -1, false)
    );
  }
}
