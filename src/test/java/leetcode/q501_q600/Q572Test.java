package leetcode.q501_q600;

import leetcode.definition.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q572Test {

  Q572 q572 = new Q572();

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testRecursive(TreeNode root, TreeNode subRoot, boolean expected) {
    boolean actual = q572.isSubtreeRecursive(root, subRoot);
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testKMP(TreeNode root, TreeNode subRoot, boolean expected) {
    boolean actual = q572.isSubtreeKMP(root, subRoot);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(getRootOne(), getSubRootOne(), true),
        Arguments.of(getRootTwo(), getSubRootOne(), false),
        Arguments.of(getRootThree(), getSubRootTwo(), true)
    );
  }

  private static TreeNode getRootOne() {
    TreeNode tn5 = new TreeNode(2);
    TreeNode tn4 = new TreeNode(1);
    TreeNode tn3 = new TreeNode(5);
    TreeNode tn2 = new TreeNode(4, tn4, tn5);
    TreeNode tn1 = new TreeNode(3, tn2, tn3);

    return tn1;
  }

  private static TreeNode getSubRootOne() {
    TreeNode tn3 = new TreeNode(2);
    TreeNode tn2 = new TreeNode(1);
    TreeNode tn1 = new TreeNode(4, tn2, tn3);

    return tn1;
  }

  private static TreeNode getRootTwo() {
    TreeNode tn6 = new TreeNode(0);
    TreeNode tn5 = new TreeNode(2, tn6, null);
    TreeNode tn4 = new TreeNode(1);
    TreeNode tn3 = new TreeNode(5);
    TreeNode tn2 = new TreeNode(4, tn4, tn5);
    TreeNode tn1 = new TreeNode(3, tn2, tn3);

    return tn1;
  }

  private static TreeNode getRootThree() {
    TreeNode tn2 = new TreeNode(1);
    TreeNode tn1 = new TreeNode(1, tn2, null);

    return tn1;
  }

  private static TreeNode getSubRootTwo() {
    TreeNode tn1 = new TreeNode(1);

    return tn1;
  }

}
