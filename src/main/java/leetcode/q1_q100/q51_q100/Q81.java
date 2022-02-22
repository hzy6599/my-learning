package leetcode.q1_q100.q51_q100;

public class Q81 {

  public boolean search(int[] nums, int target) {
    if (nums.length == 1) {
      return nums[0] == target;
    }

    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int mid = start + ((end - start) >> 1);
      if (nums[mid] == target) {
        return true;
      }
      if (nums[mid] == nums[start]) {
        start++;
      } else if (nums[mid] <= nums[end]){
        if (nums[mid] < target && target <= nums[end]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (nums[mid] > target && target >= nums[start]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }

    return false;
  }

}
