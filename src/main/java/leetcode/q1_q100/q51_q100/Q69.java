package leetcode.q1_q100.q51_q100;

public class Q69 {

  public int mySqrtBinarySearch(int x) {
    if (x == 0) {
      return 0;
    }

    int start = 1;
    int end = x;

    while (start < end) {
      int mid = start + ((end - start) >> 1) + 1;
      if (x / mid == mid) {
        return mid;
      } else if (mid > x / mid) {
        end = mid - 1;
      } else {
        start = mid;
      }
    }

    return start;
  }

  public int mySqrtNewtonsMethod(int x) {
    long a = x;

    while (a * a > x) {
      a = (a + x/a)/2;
    }

    return (int) a;
  }

}
