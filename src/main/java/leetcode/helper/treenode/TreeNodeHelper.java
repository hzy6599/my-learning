package leetcode.helper.treenode;

import leetcode.definition.TreeNode;

import java.util.List;

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



  public static boolean powerOfTwo(int number) {
    int count = 0;
    while (number != 0) {
      count++;
      number = number & (number - 1);
    }
    return count == 1;
  }

}
