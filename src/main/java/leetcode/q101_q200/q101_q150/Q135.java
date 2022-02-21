package leetcode.q101_q200.q101_q150;

public class Q135 {

  public int candy(int[] ratings) {
    if (ratings.length < 2) {
      return 1;
    }
    int[] cookies = new int[ratings.length];
    cookies[0] = 1;
    int result = 0;

    for (int i = 1; i < cookies.length; i++) {
      cookies[i] = (ratings[i] > ratings[i - 1]) ? cookies[i - 1] + 1 : 1;
    }

    result += cookies[cookies.length - 1];

    for (int j = cookies.length - 2; j >= 0; j--) {
      cookies[j] = (ratings[j] > ratings[j + 1]) && (cookies[j] <= cookies[j + 1]) ? cookies[j + 1] + 1 : cookies[j];
      result += cookies[j];
    }

    return result;
  }

}
