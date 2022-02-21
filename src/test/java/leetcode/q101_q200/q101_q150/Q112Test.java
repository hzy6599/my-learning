package leetcode.q101_q200.q101_q150;

import leetcode.definition.TreeNode;
import leetcode.q101_q200.q101_q150.Q112;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q112Test {

  Q112 question = new Q112();

  @Test
  public void testIterativeOne() {
    TreeNode root = buildTreeNodeOne();
    Assertions.assertTrue(question.hasPathSumIterative(root, 22));
  }

  @Test
  public void testIterativeTwo() {
    TreeNode root = buildTreeNodeTwo();
    Assertions.assertFalse(question.hasPathSumIterative(root, 5));
  }

  @Test
  public void testRecursiveOne() {
    TreeNode root = buildTreeNodeOne();
    Assertions.assertTrue(question.hasPathSumRecursive(root, 22));
  }

  @Test
  public void testRecursiveTwo() {
    TreeNode root = buildTreeNodeTwo();
    Assertions.assertFalse(question.hasPathSumRecursive(root, 5));
  }

  private TreeNode buildTreeNodeOne() {
    TreeNode tn8 = new TreeNode(2);
    TreeNode tn7 = new TreeNode(7);
    TreeNode tn6 = new TreeNode(4);
    TreeNode tn5 = new TreeNode(13);
    TreeNode tn4 = new TreeNode(11, tn7, tn8);
    TreeNode tn3 = new TreeNode(8, tn5, tn6);
    TreeNode tn2 = new TreeNode(4, tn4, null);
    TreeNode tn1 = new TreeNode(5, tn2, tn3);

    return tn1;
  }

  private TreeNode buildTreeNodeTwo() {
    TreeNode tn3 = new TreeNode(3);
    TreeNode tn2 = new TreeNode(2);
    TreeNode tn1 = new TreeNode(1, tn2, tn3);

    return tn1;
  }

}
