package leetcode.q301_q400;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Q387 {

  public int firstUniqCharTwoLoops(String s) {
    int[] freq = new int[26];
    for (char c: s.toCharArray()) {
      freq[c - 'a']++;
    }

    for (int i = 0; i < s.length(); i++) {
      if (freq[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }

    return -1;
  }

  /**
   * Solve question with one loop, but with additional space.
   * Used when string are input as stream of characters.
   *
   * @param s the string
   * @return index of the first non-repeating letter
   */
  public int firstUniqCharOneLoop(String s) {
    Set<Character> set = new HashSet<>();
    Map<Character, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (set.contains(c)) {
        map.remove(c);
      } else {
        set.add(c);
        map.put(c, i);
      }
    }

    return map.size() == 0 ? - 1 : map.entrySet().iterator().next().getValue();
  }

}
