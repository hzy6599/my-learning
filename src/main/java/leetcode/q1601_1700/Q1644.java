package leetcode.q1601_1700;

import leetcode.definition.TreeNode;

public class Q1644 {

  /**
   * Alternated version of Question 236, but this time an answer is not guaranteed.
   * We need to locate the first element, then do a second search under that element.
   * Time Complexity: O(n)
   * Space Complexity: O(logn = h), h means the height
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || p == null || q == null) {
      return null;
    }
    TreeNode answer = findAncestor(root, p, q);
    if (answer == p) {
      return findAncestor(p, q, q) != null ? answer : null;
    } else if (answer == q) {
      return findAncestor(q, p, p) != null ? answer : null;
    }
    return answer;
  }


  public TreeNode findAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
      return root;
    }
    TreeNode left = findAncestor(root.left, p, q);
    TreeNode right = findAncestor(root.right, p, q);
    if (left != null && right != null) {
      return root;
    } else {
      return left == null ? right : left;
    }
  }

}
