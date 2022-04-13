package leetcode.definition;

public class Node {

  public int val;
  public Node left;
  public Node right;
  public Node next;
  public Node parent;

  public Node() {}

  public Node(int val) {
    this.val = val;
  }

  public Node(int val, Node left, Node right, Node next) {
    this.val = val;
    this.left = left;
    this.right = right;
    this.next = next;
  }

  public Node(int val, Node left, Node right, Node next, Node parent) {
    this.val = val;
    this.left = left;
    this.right = right;
    this.next = next;
    this.parent = parent;
  }

}
