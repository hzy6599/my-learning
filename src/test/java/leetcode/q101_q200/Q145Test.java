package leetcode.q101_q200;

import leetcode.definition.TreeNode;
import leetcode.helper.arraylist.ArrayListHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Q145Test {

  Q145 question = new Q145();

  @Test
  public void test() {
    TreeNode tn3 = new TreeNode(3);
    TreeNode tn2 = new TreeNode(2, tn3, null);
    TreeNode tn1 = new TreeNode(1, null, tn2);

    List<Integer> actualResult = question.postorderTraversal(tn1);
    List<Integer> expectedResult = Arrays.asList(3,2,1);

    Assertions.assertTrue(ArrayListHelper.compareArrayList(expectedResult, actualResult));
  }

}
