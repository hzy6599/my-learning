package leetcode.q201_q300;

import java.util.Random;

public class Q215 {

  public int findKthLargest(int[] nums, int k) {
    shuffle(nums);
    int left = 0;
    int right = nums.length - 1;
    int target = nums.length - k;
    while (left < right) {
      int mid = quickSort(nums, left, right);
      if (mid == target) {
        return nums[mid];
      } else if (mid < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return nums[target];
  }

  private void shuffle(int[] nums) {
    final Random random = new Random();
    for (int i = 1; i < nums.length; i++) {
      int j = random.nextInt(i + 1);
      swap(nums, i, j);
    }
  }

  private int quickSort(int[] nums, int start, int end) {
    int pivot = nums[start];
    int left = start;
    int right = end;
    while (left < right) {
      while (left < right && nums[right] >= pivot) {
        right--;
      }
      while (left < right && nums[left] <= pivot) {
        left++;
      }
      if (left <= right) {
        swap(nums, left, right);
      }
    }
    swap(nums, start, right);
    return right;
  }

  private void swap(int[] nums, int a, int b) {
    if (a == b) {
      return;
    }
    nums[a] = nums[a] ^ nums[b];
    nums[b] = nums[a] ^ nums[b];
    nums[a] = nums[a] ^ nums[b];
  }

}
