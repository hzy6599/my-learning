package leetcode.q200_q299;

import leetcode.definition.ListNode;

public class Q203 {

  public ListNode removeElements(ListNode head, int val) {
    ListNode start = new ListNode();
    ListNode prev = start;

    start.next = head;

    while (head != null) {
      if (head.val == val) {
        prev.next = head.next;
      } else {
        prev = prev.next;
      }
      head = head.next;
    }

    return start.next;
  }

  public ListNode removeElementsRecursion(ListNode head, int val) {
    if (head == null) {
      return null;
    }
    head.next = removeElements(head.next, val);
    return (head.val == val) ? head.next : head;
  }

}
