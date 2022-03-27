package leetcode.q101_q200.q101_q150;

public class Q125 {

  /**
   * Use two pointer method, compare from two ends. We use 128 ascii code to check if a character is digit/letter.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static boolean isPalindrome(String s) {
    int[] ascii = new int[128];

    for (int i = 0; i < 10; i++) {
      ascii[i + '0']++;
    }
    for (int i = 0; i < 26; i++) {
      ascii[i + 'a']++;
    }

    int start = 0;
    int end = s.length() - 1;

    while (start <= end) {
      while (start <= end && ascii[Character.toLowerCase(s.charAt(start))] == 0) {
        start++;
      }
      while (start <= end && ascii[Character.toLowerCase(s.charAt(end))] == 0) {
        end--;
      }
      if (start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
        return false;
      }
      start++;
      end--;
    }

    return true;
  }

}
