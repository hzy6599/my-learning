package leetcode.q201_q300;

import leetcode.definition.TreeNode;

public class Q236 {

  /**
   * We recursively solve the issue by doing DFS.
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
      return root;
    }
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if (left == null) {
      return right;
    } else if (right == null) {
      return left;
    } else {
      return root;
    }
  }

}
