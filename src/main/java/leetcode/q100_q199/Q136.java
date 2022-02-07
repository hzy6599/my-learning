package leetcode.q100_q199;

public class Q136 {

  public int singleNumber(int[] nums) {
    int result = 0;
    for (int num: nums) {
      result ^= num;
    }
    return result;
  }

}
