package leetcode.q501_q600;

import leetcode.definition.TreeNode;

import java.util.Arrays;

public class Q572 {

  public boolean isSubtreeRecursive(TreeNode root, TreeNode subRoot) {
    if (root == null && subRoot == null) {
      return true;
    }
    if (root == null || subRoot == null) {
      return false;
    }
    return sameRoot(root, subRoot)
               || isSubtreeRecursive(root.left, subRoot)
               || isSubtreeRecursive(root.right, subRoot);
  }

  private boolean sameRoot(TreeNode root, TreeNode subRoot) {
    if (root == null && subRoot == null) {
      return true;
    }
    if (root == null || subRoot == null) {
      return false;
    }
    return (root.val == subRoot.val)
               && sameRoot(root.left, subRoot.left)
               && sameRoot(root.right, subRoot.right);
  }

  public boolean isSubtreeKMP(TreeNode root, TreeNode subRoot) {
    String serializeRoot = serialize(root);
    String serializeSubRoot = serialize(subRoot);

    int[] lps2 = buildLPS(serializeSubRoot);
    int[] lps = getLPS(serializeSubRoot);
    int i = 0;
    int j = 0;

    while (i < serializeRoot.length()) {
      while (serializeRoot.charAt(i) != serializeSubRoot.charAt(j) && j != 0) {
        j = lps[j - 1];
      }
      if (serializeRoot.charAt(i) == serializeSubRoot.charAt(j)) {
        j++;
      }
      if (j == serializeSubRoot.length()) {
        return true;
      }
      i++;
    }

    return false;
  }

  private String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    serialize(root, sb);
    return sb.toString();
  }

  private void serialize(TreeNode root, StringBuilder sb) {
    if (root == null) {
      sb.append(",#");
    } else {
      sb.append("," + root.val);
      serialize(root.left, sb);
      serialize(root.right, sb);
    }
  }

  private int[] buildLPS(String string) {
    int size = string.length();
    int[] lps = new int[size];
    int start = 0;
    int end = 1;

    while (end < size) {
      while (string.charAt(end) != string.charAt(start) && start > 0) {
        start = lps[start - 1];
      }
      if (string.charAt(end) == string.charAt(start)) {
        lps[end] = start + 1;
        start++;
      }
      end++;
    }

    return lps;
  }

  int[] getLPS(String p) {
    int m = p.length();
    int[] lps = new int[m];
    for (int i = 1, j = 0; i < m; ++i) {
      while (p.charAt(i) != p.charAt(j) && j > 0) j = lps[j-1];
      if (p.charAt(i) == p.charAt(j)) lps[i] = ++j;
    }
    return lps;
  }

}
