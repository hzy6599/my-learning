package leetcode.q1_q100.q1_q50;

public class Q4 {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
      return findMedianSortedArrays(nums2, nums1);
    }

    int start = 0;
    int end = nums1.length;

    while (start <= end) {
      int mid1 = start + ((end - start) >> 1);
      int mid2 = ((nums1.length + nums2.length + 1) >> 1) - mid1;

      int left1 = mid1 == 0 ? Integer.MIN_VALUE : nums1[mid1 - 1];
      int right1 = mid1 == nums1.length ? Integer.MAX_VALUE : nums1[mid1];
      int left2 = mid2 == 0 ? Integer.MIN_VALUE : nums2[mid2 - 1];
      int right2 = mid2 == nums2.length ? Integer.MAX_VALUE : nums2[mid2];

      if (left1 <= right2 && left2 <= right1) {
        int median1 = Math.max(left1, left2);
        int median2 = Math.min(right1, right2);
        int totalSize = nums1.length + nums2.length;
        return (totalSize % 2 == 0) ? (median1 + median2) / 2.0 : median1;
      } else if (left1 > right2) {
        end = mid1 - 1;
      } else {
        start = mid1 + 1;
      }
    }

    return -1;
  }

}
