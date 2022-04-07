package leetcode.q101_q200.q151_q200;

import leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q199 {

  /**
   * We use BFS, go over each level from right to left and store the first element in each level.
   * Time Complexity: O(N)
   * Space Complexity: O(N)
   */
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<TreeNode> rootQueue = new LinkedList<>();
    rootQueue.offer(root);

    Queue<Integer> levelQueue = new LinkedList<>();
    levelQueue.offer(1);

    while (!rootQueue.isEmpty()) {
      TreeNode currNode = rootQueue.poll();
      Integer level = levelQueue.poll();
      if (result.size() < level) {
        result.add(currNode.val);
      }

      if (currNode.right != null) {
        rootQueue.offer(currNode.right);
        levelQueue.offer(level + 1);
      }

      if (currNode.left != null) {
        rootQueue.offer(currNode.left);
        levelQueue.offer(level + 1);
      }
    }

    return result;
  }

}
