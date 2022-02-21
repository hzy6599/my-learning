package leetcode.q601_q700;

public class Q665 {

  public boolean checkPossibility(int[] nums) {
    if (nums.length == 1) {
      return true;
    }

    int count = 1;

    for (int i = 0; i < nums.length; i++) {
      int prev = i == 0 ? Integer.MIN_VALUE : nums[i - 1];
      int next = i == nums.length - 1 ? Integer.MAX_VALUE : nums[i + 1];
      if (nums[i] > next) {
        if (count == 0) {
          return false;
        }
        if (prev <= next) {
          nums[i] = next;
        } else if (prev > next) {
          nums[i + 1] = nums[i];
        }
        count--;
      }
    }

    return true;
  }

}
