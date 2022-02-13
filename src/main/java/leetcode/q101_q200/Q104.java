package leetcode.q101_q200;

import leetcode.definition.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q104 {

  public int maxDepthRecursive(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right)) + 1;
  }

  public int maxDepthIterativeBFS(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    int level = 0;
    queue.offer(root);

    while (!queue.isEmpty()) {
      level++;
      int size = queue.size();
      while (size > 0) {
        TreeNode curr = queue.poll();
        if (curr.left != null) {
          queue.offer(curr.left);
        }
        if (curr.right != null) {
          queue.offer(curr.right);
        }
        size--;
      }
    }

    return level;
  }

  public int maxDepthIterativeDFS(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int result = 0;
    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> level = new Stack<>();
    stack.push(root);
    level.push(1);

    while (!stack.isEmpty()) {
      TreeNode currNode = stack.pop();
      int currLevel = level.pop();
      result = Math.max(result, currLevel);

      if (currNode.right != null) {
        stack.push(currNode.right);
        level.push(currLevel + 1);
      }
      if (currNode.left != null) {
        stack.push(currNode.left);
        level.push(currLevel + 1);
      }
    }

    return result;
  }

}
