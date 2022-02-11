package leetcode.q0_q99;

import java.util.HashSet;

public class Q3 {

  public int lengthOfLongestSubstring(String s) {
    int first = 0;
    int second = 0;
    int longest = 0;
    HashSet<Character> set = new HashSet<>();

    while (second < s.length()) {
      while (set.contains(s.charAt(second))) {
        set.remove(s.charAt(first++));
      }
      longest = Math.max(longest, second - first + 1);
      set.add(s.charAt(second++));
    }

    return longest;
  }

}
