package leetcode.q101_q200;

import leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Q102 {

  public List<List<Integer>> levelOrderBFS(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while(!queue.isEmpty()) {
      List<Integer> row = new ArrayList<>();
      int size = queue.size();

      while (size > 0) {
        TreeNode currNode = queue.poll();
        row.add(currNode.val);
        if (currNode.left != null) {
          queue.offer(currNode.left);
        }
        if (currNode.right != null) {
          queue.offer(currNode.right);
        }
        size--;
      }

      result.add(row);
    }

    return result;
  }

  public List<List<Integer>> levelOrderDFS(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> level = new Stack<>();
    stack.push(root);
    level.push(0);

    while(!stack.isEmpty()) {
      TreeNode currNode = stack.pop();
      int currLevel = level.pop();

      if (result.size() < currLevel + 1) {
        result.add(new ArrayList<>());
      }

      result.get(currLevel).add(currNode.val);

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
