package interview.facebook;

public class EncryptedWords {

  /**
   * Solution uses recursion to recursively go through Substrings.
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static String findEncryptedWord(String s) {
    char[] charArray = s.toCharArray();
    return encrypt(charArray, 0, charArray.length - 1);
  }

  public static String encrypt(char[] array, int start, int end) {
    if (start > end) {
      return "";
    }
    if (start == end) {
      return "" + array[start];
    }

    int mid = (end + start) / 2;

    String left = encrypt(array, start, mid - 1);
    String curr = String.valueOf(array[mid]);
    String right = encrypt(array, mid + 1, end);

    return curr + left + right;
  }

}
