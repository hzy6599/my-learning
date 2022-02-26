package leetcode.q1_q100.q51_q100;

public class Q75 {

  public void sortColors(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    int index = start;

    while (index <= end) {
      if (nums[index] == 0) {
        swap(nums, index, start);
        start++;
        index++;
      } else if (nums[index] == 2) {
        swap(nums, index, end);
        end--;
      } else {
        index++;
      }
    }
  }

  private void swap(int[] nums, int a, int b) {
    if (a != b) {
      nums[a] = nums[a] ^ nums[b];
      nums[b] = nums[a] ^ nums[b];
      nums[a] = nums[a] ^ nums[b];
    }
  }

}
