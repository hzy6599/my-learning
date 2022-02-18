package leetcode.q1_q100.q51_q100;

public class Q76 {

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
