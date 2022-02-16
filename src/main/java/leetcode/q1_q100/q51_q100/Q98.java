package leetcode.q1_q100.q51_q100;

import leetcode.definition.TreeNode;

import java.util.Stack;

public class Q98 {

  public boolean isValidBSTRecursive(TreeNode root) {
    return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
  }

  private boolean isValidBST(TreeNode root, long max, long min) {
    if (root == null) {
      return true;
    }
    if (root.val <= min || root.val >= max) {
      return false;
    }
    return isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val);
  }

  public boolean isValidBSIterative(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode prev = null;

    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();

      if (prev != null && prev.val >= root.val) {
        return false;
      }

      prev = root;
      root = root.right;
    }

    return true;
  }

}
