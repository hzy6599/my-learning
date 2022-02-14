package leetcode.q201_q300;

import leetcode.definition.TreeNode;

import java.util.Stack;

public class Q226 {

  public TreeNode invertTreeRecursive(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode left = root.left;
    TreeNode right = root.right;

    root.left = invertTreeRecursive(right);
    root.right = invertTreeRecursive(left);

    return root;
  }

  public TreeNode invertTreeIterative(TreeNode root) {
    if (root == null) {
      return null;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode curr = stack.pop();
      TreeNode left = curr.left;
      TreeNode right = curr.right;

      if (left != null) {
        stack.push(left);
      }
      if (right != null) {
        stack.push(right);
      }

      curr.left = right;
      curr.right = left;
    }

    return root;
  }

}
