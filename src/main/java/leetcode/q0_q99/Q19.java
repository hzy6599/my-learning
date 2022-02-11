package leetcode.q0_q99;

import leetcode.definition.ListNode;

public class Q19 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode start = new ListNode();
    ListNode slow = start;
    ListNode fast = start;
    start.next = head;

    while (n > 0) {
      fast = fast.next;
      n--;
    }

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    slow.next = slow.next.next;

    return start.next;
  }
}
