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

}
