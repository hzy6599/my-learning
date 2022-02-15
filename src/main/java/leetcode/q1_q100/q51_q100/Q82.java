package leetcode.q1_q100.q51_q100;

import leetcode.definition.ListNode;

public class Q82 {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode();
    ListNode slow = dummy;
    ListNode fast = head;
    slow.next = head;

    while (fast != null) {
      while (fast.next != null && fast.val == fast.next.val) {
        fast = fast.next;
      }
      if (slow.next == fast) {
        slow = slow.next;
        fast = fast.next;
      } else {
        slow.next = fast.next;
        fast = slow.next;
      }
    }

    return dummy.next;
  }

}
