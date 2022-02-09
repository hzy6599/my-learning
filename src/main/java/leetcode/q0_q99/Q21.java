package leetcode.q0_q99;

import leetcode.definition.ListNode;

public class Q21 {

  public ListNode mergeTwoListsRecursion(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    if (list1.val <= list2.val) {
      list1.next = mergeTwoListsRecursion(list1.next, list2);
      return list1;
    } else {
      list2.next = mergeTwoListsRecursion(list1, list2.next);
      return list2;
    }
  }

}
