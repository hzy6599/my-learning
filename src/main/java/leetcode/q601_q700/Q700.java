package leetcode.q601_q700;

import leetcode.definition.TreeNode;

public class Q700 {

  public TreeNode searchBSTRecursive(TreeNode root, int val) {
    if (root == null || root.val == val) {
      return root;
    }

    if (root.val < val) {
      return searchBSTRecursive(root.right, val);
    } else {
      return searchBSTRecursive(root.left, val);
    }
  }

  public TreeNode searchBSTIterative(TreeNode root, int val) {
    while (root != null && root.val != val) {
      if (root.val < val) {
        root = root.right;
      } else {
        root = root.left;
      }
    }

    return root;
  }

}
