package leetcode.q1_q100;

public class Q35 {

  public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length;

    while (start < end) {
      int middle = start + ((end - start) >> 1);
      if (nums[middle] == target) {
        return middle;
      } else if (nums[middle] > target) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }

    return start;
  }

}
