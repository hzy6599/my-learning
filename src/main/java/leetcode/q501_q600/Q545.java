package leetcode.q501_q600;

import leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q545 {

  public List<Integer> boundaryOfBinaryTree(TreeNode root) {
    List<Integer> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    if (!isLeaf(root)) {
      result.add(root.val);
    }

    TreeNode left = root.left;
    while (left != null) {
      if (!isLeaf(left)) {
        result.add(left.val);
      }
      if (left.left != null) {
        left = left.left;
      } else{
        left = left.right;
      }
    }

    addLeaves(result, root);
    Stack<Integer> stack = new Stack<>();
    TreeNode right = root.right;
    while (right != null) {
      if (!isLeaf(right)) {
        stack.push(right.val);
      }
      if (right.right != null) {
        right = right.right;
      } else {
        right = right.left;
      }
    }
    while (!stack.isEmpty()) {
      result.add(stack.pop());
    }

    return result;
  }

  private boolean isLeaf(TreeNode node) {
    return node.left == null && node.right == null;
  }

  public void addLeaves(List<Integer> res, TreeNode node) {
    if (isLeaf(node)) {
      res.add(node.val);
    } else {
      if (node.left != null) {
        addLeaves(res, node.left);
      }
      if (node.right != null) {
        addLeaves(res, node.right);
      }
    }
  }

}
