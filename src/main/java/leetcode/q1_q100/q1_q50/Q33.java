package leetcode.q1_q100.q1_q50;

public class Q33 {

  public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return -1;
    }

    int start = 0;
    int end = nums.length - 1;
    int pivot = 0;

    while (start < end) {
      int middle = start + ((end - start) >> 1);
      if (nums[middle] < nums[end]) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }

    pivot = start;
    start = 0;
    end = nums.length - 1;

    while (start <= end) {
      int mid = start + ((end - start) >> 1);
      int realMid = (mid + pivot) % nums.length;
      if (nums[realMid] == target) {
        return realMid;
      }
      if (nums[realMid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

}
