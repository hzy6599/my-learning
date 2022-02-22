package leetcode.q101_q200.q151_q200;

public class Q154 {

  public int findMin(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int start = 0;
    int end = nums.length - 1;

    while (start < end) {
      int mid = start + ((end - start) >> 1);
      if (mid != start && nums[start] == nums[mid]) {
        start++;
      } else if (nums[mid] <= nums[end]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }

    return nums[start];
  }

}
