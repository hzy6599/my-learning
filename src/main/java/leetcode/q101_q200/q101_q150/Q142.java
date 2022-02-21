package leetcode.q101_q200.q101_q150;

import leetcode.definition.ListNode;

public class Q142 {

  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }

    ListNode fast = head;
    ListNode slow = head;

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
      if (fast.next == null) {
        return null;
      }
      fast = fast.next;
      if (slow == fast) {
        fast = head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        return slow;
      }
    }

    return null;
  }

}
