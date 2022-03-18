package interview.algorithm;

public class CheckSubString {

  public static boolean dictionary(String s1, String s2) {
    if (s1.length() < s2.length()) {
      return false;
    }

    int[] dic = new int[26];

    for (char c: s2.toCharArray()) {
      dic[c - 'a']++;
    }

    int slow = 0;
    int fast = 0;

    while (fast < s1.length()) {
      char fastChar = s1.charAt(fast);
      dic[fastChar - 'a']--;

      while (dic[fastChar - 'a'] < 0) {
        char slowChar = s1.charAt(slow);
        dic[slowChar - 'a']++;
        slow++;
      }

      if (fast - slow + 1 == s2.length()) {
        return true;
      }

      fast++;
    }

    return false;
  }

}
