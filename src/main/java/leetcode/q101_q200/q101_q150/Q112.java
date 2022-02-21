package leetcode.q101_q200.q101_q150;

import leetcode.definition.TreeNode;

import java.util.Stack;

public class Q112 {

  public boolean hasPathSumIterative(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> sum = new Stack<>();
    stack.push(root);
    sum.push(0);

    int result = 0;

    while (!stack.isEmpty()) {
      TreeNode currNode = stack.pop();
      int currSum = sum.pop();
      int pathSum = currSum + currNode.val;

      if (currNode.left == null && currNode.right == null) {
        if (pathSum == targetSum) {
          return true;
        }
      } else {
        if (currNode.right != null) {
          stack.push(currNode.right);
          sum.push(currSum + currNode.val);
        }
        if (currNode.left != null) {
          stack.push(currNode.left);
          sum.push(currSum + currNode.val);
        }
      }
    }

    return false;
  }

  public boolean hasPathSumRecursive(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    if (root.left == null && root.right == null && root.val == targetSum) {
      return true;
    }

    return hasPathSumRecursive(root.left, targetSum - root.val)
               || hasPathSumRecursive(root.right, targetSum - root.val);
  }
}
