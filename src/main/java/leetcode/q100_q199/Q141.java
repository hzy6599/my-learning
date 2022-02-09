package leetcode.q100_q199;

import leetcode.definition.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Q141 {

  public boolean hasCycle(ListNode head) {
    Set<ListNode> set = new HashSet<>();
    while (head != null) {
      if (set.contains(head)) {
        return true;
      }
      set.add(head);
      head = head.next;
    }
    return false;
  }

  public boolean hasCycleTwoPointer(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode slow = head;
    ListNode fast = head;
    while (slow.next != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;
      if (fast.next != null) {
        fast = fast.next;
        if (slow == fast) {
          return true;
        }
      }

    }
    return false;
  }

}
