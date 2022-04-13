package leetcode.q101_q200.q101_q150;

import java.util.HashMap;
import java.util.Map;

public class Q146 {

  /**
   * Create a double linked list node to keep track of the key and value. Use map to store the reference of the node object.
   * Each time when we get/set we update the value and move it to the head.
   * While size go over capacity we remove one from tail.
   * Time Complexity: O(1) for both operation
   * Space Complexity: O(n) n is the capacity
   */
  class DoubleLinkedNode {
    public int key;
    public int value;
    public DoubleLinkedNode prev;
    public DoubleLinkedNode next;
  }

  private Map<Integer, DoubleLinkedNode> map;
  private int size;
  private int capacity;
  private DoubleLinkedNode head;
  private DoubleLinkedNode tail;

  public Q146(int capacity) {
    this.map = new HashMap<>();
    this.size = 0;
    this.capacity = capacity;
    this.head = new DoubleLinkedNode();
    this.tail = new DoubleLinkedNode();
    this.head.next = tail;
    this.tail.prev = head;
  }

  public int get(int key) {
    DoubleLinkedNode currNode = map.get(key);
    if (currNode == null) {
      return -1;
    }
    moveToHead(currNode);
    return currNode.value;
  }

  public void put(int key, int value) {
    if (map.containsKey(key)) {
      DoubleLinkedNode keyNode = map.get(key);
      keyNode.value = value;
      moveToHead(keyNode);
    } else {
      DoubleLinkedNode newNode = new DoubleLinkedNode();
      newNode.key = key;
      newNode.value = value;
      map.put(key, newNode);

      addToHead(newNode);

      size++;
      if (size > capacity) {
        DoubleLinkedNode removed = removeFromTail();
        map.remove(removed.key);
        size--;
      }

    }
  }

  public void moveToHead(DoubleLinkedNode node) {
    DoubleLinkedNode nodePrev = node.prev;
    DoubleLinkedNode nodeNext = node.next;

    nodePrev.next = nodeNext;
    nodeNext.prev = nodePrev;

    addToHead(node);
  }

  public void addToHead(DoubleLinkedNode node) {
    DoubleLinkedNode headNext = head.next;

    head.next = node;
    node.prev = head;

    headNext.prev = node;
    node.next = headNext;
  }

  public DoubleLinkedNode removeFromTail() {
    DoubleLinkedNode prev = tail.prev;
    tail.prev = prev.prev;
    prev.prev.next = tail;
    return prev;
  }

}
