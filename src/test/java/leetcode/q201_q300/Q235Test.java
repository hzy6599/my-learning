package leetcode.q201_q300;

import leetcode.definition.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q235Test {

  Q235 question = new Q235();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testIterative(TreeNode root, TreeNode p, TreeNode q, TreeNode expected) {
    TreeNode actual = question.lowestCommonAncestorIterative(root, p, q);
    Assertions.assertEquals(expected.val, actual.val);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testRecursive(TreeNode root, TreeNode p, TreeNode q, TreeNode expected) {
    TreeNode actual = question.lowestCommonAncestorRecursive(root, p, q);
    Assertions.assertEquals(expected.val, actual.val);
  }


  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(buildTreeNode(), new TreeNode(2), new TreeNode(8), new TreeNode(6)),
        Arguments.of(buildTreeNode(), new TreeNode(2), new TreeNode(4), new TreeNode(2))
    );
  }

  private static TreeNode buildTreeNode() {
    TreeNode tn9 = new TreeNode(5);
    TreeNode tn8 = new TreeNode(3);
    TreeNode tn7 = new TreeNode(9);
    TreeNode tn6 = new TreeNode(7);
    TreeNode tn5 = new TreeNode(4, tn8, tn9);
    TreeNode tn4 = new TreeNode(0);
    TreeNode tn3 = new TreeNode(8, tn6, tn7);
    TreeNode tn2 = new TreeNode(2, tn4, tn5);
    TreeNode tn1 = new TreeNode(6, tn2, tn3);

    return tn1;
  }

}
