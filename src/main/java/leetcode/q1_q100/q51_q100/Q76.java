package leetcode.q1_q100.q51_q100;

public class Q76 {

  /**
   * The solution uses two pointer method. We first loop through String t and use an array to keep track of the occurrence of the letters.
   * Then we use two pointer p1 and p2 where p2 is the faster one. While p2 is less than the less of s, we subtract occurrence of current letter,
   * if we find a match, then we try to shrink the size by increase p1.
   * Time Complexity: O(m + n), m is the size of s, n is the size of t.
   * Space Complexity: O(1)
   */
  public String minWindow(String s, String t) {
    int[] count = new int[128];
    int counter = t.length();
    int size = s.length() + 1;
    int head = s.length() + 1;
    int start = 0;
    int end = 0;

    for (int i = 0; i < t.length(); i++) {
      count[t.charAt(i)]++;
    }

    while (end < s.length()) {
      count[s.charAt(end)]--;
      if (count[s.charAt(end)] >= 0) {
        counter--;
      }
      while (counter == 0) {
        if (end - start + 1 < size) {
          size = end - start + 1;
          head = start;
        }
        count[s.charAt(start)]++;
        if (count[s.charAt(start)] > 0) {
          counter++;
        }
        start++;
      }
      end++;
    }

    return head == s.length() + 1 ? "" : s.substring(head, head + size);
  }

}
