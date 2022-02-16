package leetcode.q201_q300;

import leetcode.definition.TreeNode;

public class Q235 {

  public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
    while (true) {
      if (root.val - p.val > 0 && root.val - q.val > 0) {
        root = root.left;
      } else if (root.val - p.val < 0 && root.val - q.val < 0) {
        root = root.right;
      } else {
        break;
      }
    }

    return root;
  }

  public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val - p.val > 0 && root.val - q.val > 0) {
      return lowestCommonAncestorRecursive(root.left, p, q);
    } else if (root.val - p.val < 0 && root.val - q.val < 0) {
      return lowestCommonAncestorRecursive(root.right, p, q);
    } else {
      return root;
    }
  }

}
