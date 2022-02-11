package leetcode.q1_q100;

import leetcode.definition.ListNode;

public class Q83 {

  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode dummy = head;

    while (head.next != null) {
      if (head.val == head.next.val) {
        head.next = head.next.next;
      } else {
        head = head.next;
      }
    }

    return dummy;
  }

}
