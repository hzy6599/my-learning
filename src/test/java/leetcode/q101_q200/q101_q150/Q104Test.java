package leetcode.q101_q200.q101_q150;

import leetcode.definition.TreeNode;
import leetcode.q101_q200.q101_q150.Q104;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q104Test {

  Q104 question = new Q104();

  @Test
  public void testRecursive() {
    TreeNode root = buildTreeNode();
    int actual = question.maxDepthRecursive(root);
    Assertions.assertEquals(3, actual);
  }

  @Test
  public void testIterativeBFS() {
    TreeNode root = buildTreeNodeTwo();
    int actual = question.maxDepthIterativeBFS(root);
    Assertions.assertEquals(3, actual);
  }

  @Test
  public void testIterativeDFS() {
    TreeNode root = buildTreeNodeTwo();
    int actual = question.maxDepthIterativeDFS(root);
    Assertions.assertEquals(3, actual);
  }

  private TreeNode buildTreeNode() {
    TreeNode tn5 = new TreeNode(7);
    TreeNode tn4 = new TreeNode(15);
    TreeNode tn3 = new TreeNode(20, tn4, tn5);
    TreeNode tn2 = new TreeNode(9);
    TreeNode tn1 = new TreeNode(3, tn2, tn3);

    return tn1;
  }

  private TreeNode buildTreeNodeTwo() {
    TreeNode tn5 = new TreeNode(5);
    TreeNode tn4 = new TreeNode(4);
    TreeNode tn3 = new TreeNode(3, null, tn5);
    TreeNode tn2 = new TreeNode(2, tn4, null);
    TreeNode tn1 = new TreeNode(1, tn2, tn3);

    return tn1;
  }

}
