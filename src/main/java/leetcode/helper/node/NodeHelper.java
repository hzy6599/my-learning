package leetcode.helper.node;

import leetcode.definition.Node;

public class NodeHelper {

  public static boolean compareNodes(Node n1, Node n2) {
    if (n1 == null && n2 == null) {
      return true;
    }

    if (n1 == null || n2 == null) {
      return false;
    }

    return (n1.val == n2.val)
               && compareNodes(n1.next, n2.next)
               && compareNodes(n1.left, n2.left)
               && compareNodes(n1.right, n2.right);
  }

}
