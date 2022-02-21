package leetcode.q501_q600;

import java.util.List;

public class Q524 {

  public String findLongestWord(String s, List<String> dictionary) {
    String result = "";

    for (String string: dictionary) {
      if (isSubString(s, string)) {
        if (result.length() < string.length()) {
          result = string;
        } else if (result.length() == string.length()) {
          result = result.compareTo(string) > 0 ? string : result;
        } else {
          //doNothing
        }
      }
    }

    return result;
  }

  private boolean isSubString(String s, String subString) {
    int first = 0;
    int second = 0;
    while (first < s.length() && second < subString.length()) {
      if (s.charAt(first) == subString.charAt(second)) {
        second++;
      }
      first++;
    }
    return second == subString.length();
  }

}
