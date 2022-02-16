package leetcode.q1_q100.q51_q100;

import leetcode.definition.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q98Test {
  
  Q98 question = new Q98();
  
  @Test
  public void testRecursiveOne() {
    TreeNode root = buildTreeNodeOne();
    Assertions.assertEquals(true, question.isValidBSTRecursive(root));
  }

  @Test
  public void testRecursiveTwo() {
    TreeNode root = buildTreeNodeTwo();
    Assertions.assertEquals(false, question.isValidBSTRecursive(root));
  }

  @Test
  public void testIterativeOne() {
    TreeNode root = buildTreeNodeOne();
    Assertions.assertEquals(true, question.isValidBSIterative(root));
  }

  @Test
  public void testIterativeTwo() {
    TreeNode root = buildTreeNodeTwo();
    Assertions.assertEquals(false, question.isValidBSIterative(root));
  }

  private TreeNode buildTreeNodeOne() {
    TreeNode tn3 = new TreeNode(3);
    TreeNode tn2 = new TreeNode(1);
    TreeNode tn1 = new TreeNode(2, tn2, tn3);

    return tn1;
  }

  private TreeNode buildTreeNodeTwo() {
    TreeNode tn5 = new TreeNode(6);
    TreeNode tn4 = new TreeNode(3);
    TreeNode tn3 = new TreeNode(4, tn4, tn5);
    TreeNode tn2 = new TreeNode(1);
    TreeNode tn1 = new TreeNode(5, tn2, tn3);

    return tn1;
  }

}
