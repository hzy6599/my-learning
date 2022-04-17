package javacore.functionalInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

  public static void main(String[] args) {
    String result = example1(Arrays.asList(
        "1",
        "2",
        "bilibili",
        "of",
        "codesheep",
        "5",
        "at",
        "BILIBILI",
        "codesheep",
        "23",
        "CHEERS",
        "6"
    ));
    System.out.println(result);
  }

  /**
   * The purpose of this method is to find the Strings which matches the following requirement.
   * 1. Length >= 5
   * 2. Ignore upper/lower cases, remove duplicates
   * 3. Sort by alphabetic order
   * 4. Connect with underscore
   * @param strings
   */
  private static String example1(List<String> strings) {
    String result = strings.stream()
                        .filter(i -> !isNum(i))
                        .filter(i -> i.length() >= 5)
                        .map(i -> i.toLowerCase())
                        .distinct()
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.joining("_"));
    return result;
  }

  private static boolean isNum(String input) {
    for (char c : input.toCharArray()) {
      if (!Character.isDigit(c)) {
        return false;
      }
    }
    return true;
  }

}
