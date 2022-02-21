package leetcode.q101_q200.q151_q200;

public class Q162 {

  /**
   * Return the location of the peak element with an array of n elements. Consider nums[-1] = nums[n] = negative infinity.
   * 1. If nums.length == 1, the only element is the peak element.
   * 2. Check if nums[0] > nums[1], if true 0 is a peak.
   * 3. Check if nums[n-1] > nums[n-2], if true n - 1 is a peak.
   * 4. Do binary search:
   * 4.1 Check if mid is a peak, if true return current mid
   * 4.2 Else if nums[mid] < nums[mid + 1], peak must be on left-hand side, increase start = mid + 1. Current mid cannot be peak.
   * 4.3 Else if nums[mid] < nums[mid - 1], peak must be on right-hand side, reduce end = mid - 1. Current mid cannot be peak.
   * 4.4 If nums[mid] < nums[mid + 1] and nums[mid] < nums[mid - 1] we can go either direction, based on code order we chose one of the direction.
   *
   * @param nums Array contains a list of unnique elements
   * @return the integer index of the peak elemennt
   */
  public int findPeakElement(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }

    if (nums[0] > nums[1]) {
      return 0;
    }
    if (nums[nums.length - 1] > nums[nums.length - 2]) {
      return nums.length - 1;
    }

    int start = 1;
    int end = nums.length - 2;

    while (start <= end) {
      int mid = start + ((end - start) >> 1);

      if (nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) {
        return mid;
      } else if (nums[mid] < nums[mid+1]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

}
