package leetcode.q1601_1700;

import leetcode.definition.Node;

public class Q1650 {

  /**
   * Similar to Q1644 but with parent we can iterate instead of doing searching.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public Node lowestCommonAncestor(Node p, Node q) {
    Node dummyP = p;
    Node dummyQ = q;
    while (dummyP != dummyQ) {
      dummyP = dummyP == null ? q : dummyP.parent;
      dummyQ = dummyQ == null ? p : dummyQ.parent;
    }
    return dummyP;
  }

}
