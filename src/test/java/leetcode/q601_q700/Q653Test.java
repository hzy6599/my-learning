package leetcode.q601_q700;

import leetcode.definition.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q653Test {

  Q653 question = new Q653();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testOneLoop(TreeNode root, int target, boolean expectedResult) {
    boolean actualResult = question.findTargetOneLoop(root, target);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testBinarySearch(TreeNode root, int target, boolean expectedResult) {
    boolean actualResult = question.findTargetBinarySearch(root, target);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(buildTreeNode(), 9, true),
        Arguments.of(buildTreeNode(), 28, false)
    );
  }

  private static TreeNode buildTreeNode() {
    TreeNode tn6 = new TreeNode(7);
    TreeNode tn5 = new TreeNode(4);
    TreeNode tn4 = new TreeNode(2);
    TreeNode tn3 = new TreeNode(6, null, tn6);
    TreeNode tn2 = new TreeNode(3, tn4, tn5);
    TreeNode tn1 = new TreeNode(5, tn2, tn3);

    return tn1;
  }

}
