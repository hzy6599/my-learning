package leetcode.q601_q700;

import leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q653 {

  public boolean findTargetOneLoop(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();

    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (list.contains(k - root.val)) {
        return true;
      }
      list.add(root.val);
      root = root.right;
    }

    return false;
  }

  public boolean findTargetBinarySearch(TreeNode root, int k) {
    Stack<TreeNode> leftStack = new Stack<>();
    Stack<TreeNode> rightStack = new Stack<>();

    addStack(leftStack, root, true);
    addStack(rightStack, root, false);

    while (leftStack.peek() != rightStack.peek()) {
      int left = leftStack.peek().val;
      int right = rightStack.peek().val;
      int sum = left + right;

      if (sum == k) {
        return true;
      } else if (sum > k) {
        nextStack(rightStack, false);
      } else {
        nextStack(leftStack, true);
      }
    }

    return false;
  }

  private void addStack(Stack<TreeNode> stack, TreeNode root, boolean isLeft) {
    while (root != null) {
      stack.push(root);
      root = isLeft ? root.left : root.right;
    }
  }

  private void nextStack(Stack<TreeNode> stack, boolean isLeft) {
    TreeNode node = stack.pop();
    if (isLeft) {
      addStack(stack, node.right, isLeft);
    } else {
      addStack(stack, node.left, isLeft);
    }
  }

}
