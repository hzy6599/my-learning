package leetcode.helper.treenode;

import leetcode.definition.TreeNode;

public class TreeNodeHelper {

  public static boolean compareTreeNode(TreeNode tn1, TreeNode tn2) {
    if (tn1 == null && tn2 == null) {
      return true;
    }
    if (tn1 == null || tn2 == null) {
      return false;
    }
    return (tn1.val == tn2.val)
               && compareTreeNode(tn1.left, tn2.left)
               && compareTreeNode(tn1.right, tn2.right);
  }

}
