package leetcode.q401_q500;

public class Q415 {

  public static String addStrings(String num1, String num2) {
    int p1 = num1.length() - 1;
    int p2 = num2.length() - 1;
    int carryOver = 0;
    StringBuilder sb = new StringBuilder();

    while (p1 >= 0 || p2 >= 0) {
      int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
      int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
      int sum = (x1 + x2 + carryOver) % 10;
      carryOver = (x1 + x2 + carryOver) / 10;
      sb.append(sum);
      p1--;
      p2--;
    }

    if (carryOver != 0) {
      sb.append(carryOver);
    }

    return sb.reverse().toString();
  }

}
