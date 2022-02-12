package leetcode.q101_q200.q144;

import leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q144 {

  public List<Integer> preorderTraversalRecursion(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    preOrder(root, result);
    return result;
  }

  private void preOrder(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    result.add(root.val);
    preOrder(root.left, result);
    preOrder(root.right, result);
  }

  public List<Integer> preorderTraversalIteration(TreeNode root) {
    List<Integer> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode curr = stack.pop();
      result.add(curr.val);
      if (curr.right != null) {
        stack.push(curr.right);
      }
      if (curr.left != null) {
        stack.push(curr.left);
      }
    }

    return result;
  }

}
