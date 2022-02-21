package leetcode.q601_q700;

public class Q633 {

  public boolean judgeSquareSum(int c) {
    if (c <= 1) {
      return true;
    }
    double start = 0;
    double end = Integer.MAX_VALUE;
    while (start < end) {
      double mid = (start + end) / 2 + 1;
      if (mid * mid == c) {
        return true;
      } else if (mid * mid > c) {
        end = mid - 1;
      } else {
        start = mid;
      }
    }

    start = 0;
    end = (int) end + 1;

    while (start <= end) {
      double sum = start * start + end * end;
      if (sum == c) {
        return true;
      } else if (sum < c) {
        start++;
      } else {
        end--;
      }
    }

    return false;
  }
}
