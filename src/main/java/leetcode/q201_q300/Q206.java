package leetcode.q201_q300;

import leetcode.definition.ListNode;

public class Q206 {

  /**
   * Method revert linked list with three pointers
   * @param head head of the original ListNode
   * @return new head for the reversed ListNode
   */
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    ListNode next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }

}
