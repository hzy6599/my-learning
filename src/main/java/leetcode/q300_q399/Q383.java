package leetcode.q300_q399;

import java.util.HashMap;
import java.util.Map;

public class Q383 {
  public boolean canConstructWithMap(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++) {
      char c = magazine.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      char c = ransomNote.charAt(i);
      if (!map.containsKey(c) || map.get(c) <= 0) {
        return false;
      }
      map.put(c, map.get(c) - 1);
    }

    return true;
  }

  public boolean canConstructArray(String ransomNote, String magazine) {
    int[] freq = new int[26];
    for (int i = 0; i < magazine.length(); i++) {
      char c = magazine.charAt(i);
      freq[c - 'a']++;
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      char c = ransomNote.charAt(i);
      if (--freq[c - 'a'] < 0) {
        return false;
      }
    }

    return true;
  }
}
