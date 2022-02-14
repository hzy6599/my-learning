package leetcode.q201_q300;

import leetcode.definition.TreeNode;
import leetcode.helper.treenode.TreeNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q226Test {

  Q226 question = new Q226();

  @Test
  public void testRecursive() {
    TreeNode root = buildTreeNode();
    TreeNode actual = question.invertTreeRecursive(root);
    TreeNode expected = buildAnswerTreeNode();
    Assertions.assertTrue(TreeNodeHelper.compareTreeNode(expected, actual));
  }

  @Test
  public void testIterative() {
    TreeNode root = buildTreeNode();
    TreeNode actual = question.invertTreeIterative(root);
    TreeNode expected = buildAnswerTreeNode();
    Assertions.assertTrue(TreeNodeHelper.compareTreeNode(expected, actual));
  }

  private TreeNode buildTreeNode() {
    TreeNode tn7 = new TreeNode(9);
    TreeNode tn6 = new TreeNode(6);
    TreeNode tn5 = new TreeNode(3);
    TreeNode tn4 = new TreeNode(1);
    TreeNode tn3 = new TreeNode(7, tn6, tn7);
    TreeNode tn2 = new TreeNode(2, tn4, tn5);
    TreeNode tn1 = new TreeNode(4, tn2, tn3);

    return tn1;
  }

  private TreeNode buildAnswerTreeNode() {
    TreeNode tn7 = new TreeNode(9);
    TreeNode tn6 = new TreeNode(6);
    TreeNode tn5 = new TreeNode(3);
    TreeNode tn4 = new TreeNode(1);
    TreeNode tn3 = new TreeNode(7, tn7, tn6);
    TreeNode tn2 = new TreeNode(2, tn5, tn4);
    TreeNode tn1 = new TreeNode(4, tn3, tn2);

    return tn1;
  }

}
