package leetcode.q101_q200.q101_q150;

import leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q145 {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    postOrder(root, result);
    return result;
  }

  private void postOrder(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    postOrder(root.left, result);
    postOrder(root.right, result);
    result.add(root.val);
  }

}
