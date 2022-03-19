package leetcode.q1_q100.q51_q100;

public class Q67 {

  public static String addBinary(String a, String b) {
    int p1 = a.length() - 1;
    int p2 = b.length() - 1;
    int carry = 0;

    StringBuilder sb = new StringBuilder();

    while (p1 >= 0 || p2 >= 0) {
      int x1 = p1 >= 0 ? a.charAt(p1) - '0' : 0;
      int x2 = p2 >= 0 ? b.charAt(p2) - '0' : 0;
      int sum = (x1 + x2 + carry) % 2;
      carry = (x1 + x2 + carry) >= 2 ? 1 : 0;
      sb.append(sum);
      p1--;
      p2--;
    }

    if (carry != 0) {
      sb.append(carry);
    }

    return sb.reverse().toString();
  }

}
