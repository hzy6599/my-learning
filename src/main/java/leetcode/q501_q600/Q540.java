package leetcode.q501_q600;

public class Q540 {

  public int singleNonDuplicate(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int start = 0;
    int end = nums.length - 1;

    while (start < end) {
      int mid = start + ((end - start) >> 1);
      if (mid % 2 != 0) {
        mid--;
      }
      if (nums[mid] != nums[mid + 1]) {
        end = mid;
      } else {
        start = mid + 2;
      }
    }

    return nums[start];
  }

}
