package leetcode.q101_q200.q101_q150;

public class Q136 {

  public int singleNumber(int[] nums) {
    int result = 0;
    for (int num: nums) {
      result ^= num;
    }
    return result;
  }

}
