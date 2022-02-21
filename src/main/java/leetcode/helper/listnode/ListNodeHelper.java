package leetcode.helper.listnode;

import leetcode.definition.ListNode;

public class ListNodeHelper {

  public static boolean compareListNodes(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return true;
    }

    if (l1 == null || l2 == null) {
      return false;
    }

    return (l1.val == l2.val) && compareListNodes(l1.next, l2.next);
  }

  public static ListNode buildListNode(int[] array) {
    ListNodeBuilder builder = new ListNodeBuilder();

    for (int number: array) {
      builder.nextNode(number);
    }

    return builder.build();
  }

  public static ListNode buildCyclicListNode(int[] array, int circleStart) {
    ListNode listNode = buildListNode(array);
    if (circleStart == -1) {
      return listNode;
    }
    ListNode start = null;
    ListNode dummy = listNode;
    int index = 0;
    while (dummy.next != null) {
      if (index == circleStart) {
        start = dummy;
      }
      dummy = dummy.next;
      index++;
    }
    dummy.next = start;
    return listNode;
  }

}
