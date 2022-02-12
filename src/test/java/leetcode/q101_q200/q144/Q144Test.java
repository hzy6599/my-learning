package leetcode.q101_q200.q144;

import leetcode.definition.ListNode;
import leetcode.definition.TreeNode;
import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Q144Test {

  Q144 question = new Q144();

  @Test
  public void testIteration() {
    TreeNode tn3 = new TreeNode(3);
    TreeNode tn2 = new TreeNode(2, tn3, null);
    TreeNode tn1 = new TreeNode(1, null, tn2);

    List<Integer> actualResult = question.preorderTraversalIteration(tn1);
    List<Integer> expectedResult = Arrays.asList(1,2,3);

    Assertions.assertTrue(ArrayListHelper.compareArrayList(expectedResult, actualResult));
  }

  @Test
  public void testRecursion() {
    TreeNode tn3 = new TreeNode(3);
    TreeNode tn2 = new TreeNode(2, tn3, null);
    TreeNode tn1 = new TreeNode(1, null, tn2);

    List<Integer> actualResult = question.preorderTraversalRecursion(tn1);
    List<Integer> expectedResult = Arrays.asList(1,2,3);

    Assertions.assertTrue(ArrayListHelper.compareArrayList(expectedResult, actualResult));
  }

}
