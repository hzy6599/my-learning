package leetcode.q601_q700;

import leetcode.definition.TreeNode;
import leetcode.helper.treenode.TreeNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q701Test {

  Q701 question = new Q701();

  @Test
  public void testIterative() {
    TreeNode root = buildTreeNode();
    TreeNode expectedNode = buildAnswerNode();
    TreeNode actualNode = question.insertIntoBSTIterative(root, 5);
    Assertions.assertTrue(TreeNodeHelper.compareTreeNode(expectedNode, actualNode));
  }

  @Test
  public void testRecursive() {
    TreeNode root = buildTreeNode();
    TreeNode expectedNode = buildAnswerNode();
    TreeNode actualNode = question.insertIntoBSTRecursive(root, 5);
    Assertions.assertTrue(TreeNodeHelper.compareTreeNode(expectedNode, actualNode));
  }

  private TreeNode buildTreeNode() {
    TreeNode tn5 = new TreeNode(3);
    TreeNode tn4 = new TreeNode(1);
    TreeNode tn3 = new TreeNode(7);
    TreeNode tn2 = new TreeNode(2, tn4, tn5);
    TreeNode tn1 = new TreeNode(4, tn2, tn3);

    return tn1;
  }

  private TreeNode buildAnswerNode() {
    TreeNode tn6 = new TreeNode(5);
    TreeNode tn5 = new TreeNode(3);
    TreeNode tn4 = new TreeNode(1);
    TreeNode tn3 = new TreeNode(7, tn6, null);
    TreeNode tn2 = new TreeNode(2, tn4, tn5);
    TreeNode tn1 = new TreeNode(4, tn2, tn3);

    return tn1;
  }

}
