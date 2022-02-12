package leetcode.q1_q100.q51_q100;

import leetcode.definition.TreeNode;
import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Q94Test {

  Q94 question = new Q94();

  @Test
  public void test() {
    TreeNode tn3 = new TreeNode(3);
    TreeNode tn2 = new TreeNode(2, tn3, null);
    TreeNode tn1 = new TreeNode(1, null, tn2);

    List<Integer> actualResult = question.inorderTraversal(tn1);
    List<Integer> expectedResult = Arrays.asList(1,3,2);

    Assertions.assertTrue(ArrayListHelper.compareArrayList(expectedResult, actualResult));
  }

}
