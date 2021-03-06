package leetcode.helper.treenode;

import leetcode.definition.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TreeNodeHelperTest {

  @Test
  public void testCompareListNode() {
    TreeNode tn1 = buildTreeNode();
    TreeNode tn2 = buildTreeNode();
    Assertions.assertTrue(TreeNodeHelper.compareTreeNode(tn1, tn2));
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

  @ParameterizedTest
  @MethodSource("dataProviderPowerOfTwo")
  public void testPowerOfTwo(int number, boolean expected) {
    boolean actual = TreeNodeHelper.isPowerOfTwo(number);
    Assertions.assertEquals(expected, actual);
  }

  private static Stream<Arguments> dataProviderPowerOfTwo() {
    return Stream.of(
        Arguments.of(1, true),
        Arguments.of(2, true),
        Arguments.of(3, false),
        Arguments.of(1024, true));
  }

}
