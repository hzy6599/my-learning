package leetcode.q801_q900;

import java.util.HashMap;
import java.util.Map;

public class Q828 {

  /**
   * This solution uses brute force, we generate all the substring and calculate the unique letter for each of them.
   * Time Complexity: O(n^3)
   * Space Complexity: O(n)
   */
  public static int uniqueLetterStringBruteForce(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        count += getUniqueLetter(s.substring(i, j + 1));
      }
    }
    return count;
  }

  private static int getUniqueLetter(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (char c: s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int unique = 0;
    for (char c: map.keySet()) {
      unique += map.get(c) == 1 ? 1 : 0;
    }

    return unique;
  }

  /**
   * This solution approaches from different perspective. We loop through the string once and at each index i we find curr[i].
   * curr[i] represents the total number of unique number in the substring which ends at index i.
   * To do that we find the contribution of the current letter and add to sum.
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static int uniqueLetterStringLinear(String s) {
    int ans = 0;
    int[] prevIndex = new int[26];
    int[] contribution = new int[26];

    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      count -= contribution[c - 'A'];
      contribution[c - 'A'] = i + 1 - prevIndex[c - 'A'];
      count += contribution[c - 'A'];
      prevIndex[c - 'A'] = i + 1;
      ans += count;
    }

    return ans;
  }

}
