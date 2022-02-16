package leetcode.q701_q800;

import leetcode.definition.TreeNode;

public class Q701 {

  public TreeNode insertIntoBSTIterative(TreeNode root, int val) {
    TreeNode dummy = root;
    TreeNode prev = null;

    while (root != null) {
      prev = root;
      if (root.val > val) {
        root = root.left;
      } else {
        root = root.right;
      }
    }

    TreeNode result = new TreeNode(val);

    if (prev != null) {
      if (val < prev.val) {
        prev.left = result;
      } else {
        prev.right = result;
      }
      return dummy;
    }

    return result;
  }

  public TreeNode insertIntoBSTRecursive(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }
    if (root.val < val) {
      root.right = insertIntoBSTRecursive(root.right, val);
    } else {
      root.left = insertIntoBSTRecursive(root.left, val);
    }
    return root;
  }

}
