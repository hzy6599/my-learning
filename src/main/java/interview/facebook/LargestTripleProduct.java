package interview.facebook;

import java.util.PriorityQueue;

public class LargestTripleProduct {

  /**
   * Use max heap to store the largest three element. When the number in the heap is greater than 3, we add in new one and pop the top one.
   * Time Complexity: O(nlogn)
   * Space Complexity: O(1)
   */
  public static int[] findMaxProduct(int[] arr) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    int[] ans = new int[arr.length];
    int product = 1;

    for (int i = 0; i < arr.length; i++) {
      maxHeap.offer(arr[i]);
      product *= arr[i];
      if (maxHeap.size() < 3) {
        ans[i] = -1;
      } else if (maxHeap.size() == 3) {
        ans[i] = product;
      } else {
        product /= maxHeap.poll();
        ans[i] = product;
      }
    }

    return ans;
  }

}
