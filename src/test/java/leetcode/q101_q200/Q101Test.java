package leetcode.q101_q200;

import leetcode.definition.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q101Test {

  Q101 question = new Q101();

  @Test
  public void testRecursive() {
    TreeNode root = buildTreeNode();
    Assertions.assertTrue(question.isSymmetricRecursive(root));
  }

  @Test
  public void testIterative() {
    TreeNode root = buildTreeNode();
    Assertions.assertTrue(question.isSymmetricIterative(root));
  }

  private TreeNode buildTreeNode() {
    TreeNode tn7 = new TreeNode(3);
    TreeNode tn6 = new TreeNode(4);
    TreeNode tn5 = new TreeNode(4);
    TreeNode tn4 = new TreeNode(3);
    TreeNode tn3 = new TreeNode(2, tn6, tn7);
    TreeNode tn2 = new TreeNode(2, tn4, tn5);
    TreeNode tn1 = new TreeNode(1, tn2, tn3);

    return tn1;
  }



}
