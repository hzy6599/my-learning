package leetcode.q1_q100.q1_q50;

public class Q31 {

  /**
   * We use single pass to solve the issue. To find the next permutation we first need to find the index where arr[index] < arr[index + 1].
   * Then we find the next largest number on the right-hand side and switch the numbers.
   * After that we reverse the number between index + 1 and end.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    while (i >= 0 && nums[i + 1] <= nums[i]) {
      i--;
    }

    if (i >= 0) {
      int j = nums.length - 1;
      while (nums[j] <= nums[i]) {
        j--;
      }
      swap(nums, i, j);
    }

    reverse(nums, i + 1);
  }

  private static void reverse(int[] nums, int start) {
    int begin = start;
    int end = nums.length - 1;
    while (begin < end) {
      swap(nums, begin, end);
      begin++;
      end--;
    }
  }

  private static void swap(int[] nums, int a, int b) {
    nums[a] = nums[a] ^ nums[b];
    nums[b] = nums[a] ^ nums[b];
    nums[a] = nums[a] ^ nums[b];
  }

}
