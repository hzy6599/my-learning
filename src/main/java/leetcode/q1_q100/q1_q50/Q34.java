package leetcode.q1_q100.q1_q50;

public class Q34 {

  public int[] searchRange(int[] nums, int target) {
    int[] result = new int[] {-1, -1};

    if (nums == null || nums.length == 0) {
      return result;
    }

    int start = 0;
    int end = nums.length - 1;

    while (start < end) {
      int middle = start + ((end - start) >> 1);
      if (nums[middle] >= target) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }

    if (nums[start] != target) {
      return result;
    }

    result[0] = start;
    end = nums.length - 1;

    while (start < end) {
      int middle = start + ((end - start) >> 1) + 1;
      if (nums[middle] <= target) {
        start = middle;
      } else {
        end = middle - 1;
      }
    }

    result[1] = end;
    return result;
  }

}
