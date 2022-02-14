package leetcode.q101_q200;

public class Q153 {

  public int findMin(int[] nums) {
    int start = 0;
    int end = nums.length - 1;

    while (start < end) {
      int mid = start + ((end - start) >> 1);
      if (nums[mid] <= nums[end]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }

    return nums[start];
  }

}
