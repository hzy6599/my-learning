package interview.facebook;

import java.util.PriorityQueue;

public class MedianStream {

  /**
   * Use two priority queue, leftHandSide and rightHandSide, to store the number.
   * Loop through the array, then:
   * 1. If index is odd, push to leftHandSide, then poll and push to rightHandSide, median will be the peek from rightHandSide.
   * 2. If index is even, push to rightHandSide, then poll and push to leftHandSide, median will be the average of peek
   * from leftHandSide and rightHandSide.
   * The reason to add/remove between priorityQueues is to sort the order.
   * Time Complexity: O(nlogn)
   * Space Complexity: O(n)
   */
  public static int[] findMedian(int[] arr) {
    PriorityQueue<Integer> leftHandSide = new PriorityQueue<>();
    PriorityQueue<Integer> rightHandSide = new PriorityQueue<>((n1, n2) -> (n2 - n1));

    int[] ans = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        leftHandSide.offer(arr[i]);
        rightHandSide.offer(leftHandSide.poll());
        ans[i] = rightHandSide.peek();
      } else {
        rightHandSide.offer(arr[i]);
        leftHandSide.offer(rightHandSide.poll());
        ans[i] = (leftHandSide.peek() + rightHandSide.peek()) / 2;
      }
    }

    return ans;
  }

}
