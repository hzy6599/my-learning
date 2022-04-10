package leetcode.q1_q100.q1_q50;

import leetcode.definition.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q23 {

  public ListNode mergeKLists(ListNode[] lists) {
    ListNode dummy = new ListNode();
    ListNode curr = dummy;

    PriorityQueue<ListNode> queue = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);

    for (ListNode listnode: lists) {
      if (listnode != null) {
        queue.offer(listnode);
      }
    }

    while (!queue.isEmpty()) {
      ListNode currNode = queue.poll();
      curr.next = currNode;
      curr = curr.next;
      if (curr.next != null) {
        queue.offer(curr.next);
      }
    }
    return dummy.next;
  }

}
