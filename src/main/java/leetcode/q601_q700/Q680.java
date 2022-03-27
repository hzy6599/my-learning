package leetcode.q601_q700;

public class Q680 {

  /**
   * Use two pointer to loop through the String, when first difference is meet, switch to helper method.
   * If additional differences exists, helper method would return false;
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public boolean validPalindromeOnePass(String s) {
    int start = 0;
    int end = s.length() - 1;
    while (start <= end) {
      if (s.charAt(start) != s.charAt(end)) {
        return validPalidrome(s, start + 1, end) || validPalidrome(s, start, end - 1);
      }
      start++;
      end--;
    }
    return true;
  }

  private boolean validPalidrome(String s, int start, int end) {
    while (start <= end) {
      if (s.charAt(start) != s.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

}
