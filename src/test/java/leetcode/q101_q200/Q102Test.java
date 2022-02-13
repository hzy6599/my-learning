package leetcode.q101_q200;

import leetcode.definition.TreeNode;
import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Q102Test {

  Q102 question = new Q102();

  @Test
  public void testBFS() {
    TreeNode root = buildTreeNode();
    List<List<Integer>> expectedResult =
        Arrays.asList(
            Arrays.asList(3),
            Arrays.asList(9, 20),
            Arrays.asList(15, 7));
    List<List<Integer>> actualResult =
        question.levelOrderBFS(root);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expectedResult, actualResult));
  }

  @Test
  public void testDFS() {
    TreeNode root = buildTreeNode();
    List<List<Integer>> expectedResult =
        Arrays.asList(
            Arrays.asList(3),
            Arrays.asList(9, 20),
            Arrays.asList(15, 7));
    List<List<Integer>> actualResult =
        question.levelOrderDFS(root);
    Assertions.assertTrue(ArrayListHelper.compare2DArrayList(expectedResult, actualResult));
  }

  private TreeNode buildTreeNode() {
    TreeNode tn5 = new TreeNode(7);
    TreeNode tn4 = new TreeNode(15);
    TreeNode tn3 = new TreeNode(20, tn4, tn5);
    TreeNode tn2 = new TreeNode(9);
    TreeNode tn1 = new TreeNode(3, tn2, tn3);

    return tn1;
  }

}
