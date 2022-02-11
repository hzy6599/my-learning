package leetcode.helper.listnode;

import leetcode.definition.ListNode;

public class ListNodeBuilder {

  private ListNode head;
  private ListNode current;
  private int size;

  public ListNodeBuilder() {
    this.head = new ListNode(0);
    this.current = head;
    this.size = 0;
  }

  public ListNodeBuilder nextNode(int value) {
    ListNode newNode = new ListNode(value);
    current.next = newNode;
    current = current.next;
    this.size++;
    return this;
  }

  public ListNode build() {
    return this.head.next;
  }

  public int size() {
    return this.size;
  }

}
