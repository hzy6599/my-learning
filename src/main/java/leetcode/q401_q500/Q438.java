package leetcode.q401_q500;

import java.util.ArrayList;
import java.util.List;

public class Q438 {

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> locations = new ArrayList<>();
    int[] letters = new int[26];
    int size = 0;

    for (char c: p.toCharArray()) {
      letters[c - 'a']++;
    }

    int start = 0;
    int end = 0;

    while (end < s.length()) {
      letters[s.charAt(end) - 'a']--;
      size++;
      while (letters[s.charAt(end) - 'a'] < 0) {
        letters[s.charAt(start) - 'a']++;
        size--;
        start++;
      }
      if (size == p.length()) {
        locations.add(start);
      }
      end++;
    }

    return locations;
  }

}
