package leetcode.q1_q100.q51_q100;

import leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q94 {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inOrder(root, result);
    return result;
  }

  private void inOrder(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    inOrder(root.left, result);
    result.add(root.val);
    inOrder(root.right, result);
  }

}
