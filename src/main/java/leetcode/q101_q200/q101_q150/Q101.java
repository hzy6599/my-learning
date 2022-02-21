package leetcode.q101_q200.q101_q150;

import leetcode.definition.TreeNode;

import java.util.Stack;

public class Q101 {

  public boolean isSymmetricRecursive(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isMirror(root.left, root.right);
  }

  private boolean isMirror(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    return (left.val == right.val) && (isMirror(left.left, right.right)) && (isMirror(left.right, right.left));
  }

  public boolean isSymmetricIterative(TreeNode root) {
    if (root == null) {
      return true;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root.left);
    stack.push(root.right);

    while (!stack.isEmpty()) {
      TreeNode left = stack.pop();
      TreeNode right = stack.pop();

      if (left == null && right == null) {
        continue;
      }
      if (left == null || right == null) {
        return false;
      }
      if (left.val != right.val) {
        return false;
      }
      stack.push(left.left);
      stack.push(right.right);
      stack.push(left.right);
      stack.push(right.left);
    }

    return true;
  }

}
