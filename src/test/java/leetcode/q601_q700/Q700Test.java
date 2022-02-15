package leetcode.q601_q700;

import leetcode.definition.TreeNode;
import leetcode.helper.treenode.TreeNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q700Test {

  Q700 question = new Q700();

  @Test
  public void testRecursive() {
    TreeNode root = buildTreeNode();
    TreeNode expectedNode = buildAnswerNode();
    TreeNode actualNode = question.searchBSTRecursive(root, 2);
    Assertions.assertTrue(TreeNodeHelper.compareTreeNode(expectedNode, actualNode));
  }

  @Test
  public void testIterative() {
    TreeNode root = buildTreeNode();
    TreeNode expectedNode = buildAnswerNode();
    TreeNode actualNode = question.searchBSTIterative(root, 2);
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
    TreeNode tn3 = new TreeNode(3);
    TreeNode tn2 = new TreeNode(1);
    TreeNode tn1 = new TreeNode(2, tn2, tn3);

    return tn1;
  }


}
