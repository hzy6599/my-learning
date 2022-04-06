package leetcode.q1301_q1400;

import leetcode.definition.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q1382 {

  /**
   * This solution applied recursion. It first uses DFS to generate a sorted list from the node,
   * then re-build node from the sorted list by using binary split.
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public TreeNode balanceBSTRecursion(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return root;
    }

    ArrayList<Integer> sortedValue = new ArrayList<>();
    getSortedList1(root, sortedValue);
    return buildFromSortedList1(sortedValue, 0 , sortedValue.size() - 1);
  }

  private void getSortedList1(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    getSortedList1(root.left, list);
    list.add(root.val);
    getSortedList1(root.right, list);
  }

  private TreeNode buildFromSortedList1(List<Integer> list, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = start + ((end - start) >> 1);
    TreeNode node = new TreeNode(list.get(mid));
    node.left = buildFromSortedList1(list, start, mid - 1);
    node.right = buildFromSortedList1(list, mid + 1, end);
    return node;
  }

  /**
   * This solution also applied recursion. It uses the same idea by save some space by store Node directly.
   * Time Complexity: O(n)
   * Space Complexity: O(n) -> O(logn)
   */
  public TreeNode balanceBST(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return root;
    }

    List<TreeNode> sortedNode = new ArrayList<>();
    getSortedList2(root, sortedNode);
    return buildFromSortedList2(sortedNode, 0 , sortedNode.size() - 1);
  }

  private void getSortedList2(TreeNode root, List<TreeNode> list) {
    if (root == null) {
      return;
    }
    getSortedList2(root.left, list);
    list.add(root);
    getSortedList2(root.right, list);
  }

  private TreeNode buildFromSortedList2(List<TreeNode> list, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = start + ((end - start) >> 1);
    TreeNode node = list.get(mid);
    node.left = buildFromSortedList2(list, start, mid - 1);
    node.right = buildFromSortedList2(list, mid + 1, end);
    return node;
  }

}
