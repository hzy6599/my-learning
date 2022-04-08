package leetcode.q401_q500;

import leetcode.definition.Node;

public class Q426 {

  private Node first = null;
  private Node last = null;

  /**
   * The solution use in-order traverse and keep two variable to store the head and previously traversed node.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public Node treeToDoublyList(Node root) {
    if (root == null) {
      return null;
    }
    helper(root);
    last.right = first;
    first.left = last;
    return first;
  }

  private void helper(Node node) {
    if (node != null) {
      helper(node.left);
      if (last != null) {
        last.right = node;
        node.left = last;
      } else {
        first = node;
      }
      last = node;
      helper(node.right);
    }
  }

}
