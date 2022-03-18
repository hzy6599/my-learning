package interview.algorithm;

import java.util.PriorityQueue;

/**
 * Given a list of numbers [arr], with length N
 * where N represents the number of waiters in the restaurant
 * and arr[N] represent the time waiter N needs to serve a customer
 * given an integer M where M stands for the number of customers need to be served
 * You are the M + 1 visitor. Find the time when you will be served.
 *
 * Bonus: if M is far greater than N, for example N <= 1000 and M is 10^9, can we still keep good time complexity??
 */
public class MinWaitingTime {

  public static int waitingTimeMinHeap(int[] arr, int m) {
    if (arr == null || arr.length == 0) {
      return -1;
    }

    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
      if (a[0] == b[0]) {
        return a[1] - b[1];
      }
      return a[0] - b[0];
    });

    for (int timeNeeded: arr) {
      minHeap.offer(new int[] {0, timeNeeded});
    }

    for (int i = 0; i < m; i++) {
      int[] curr = minHeap.poll();
      curr[0] += curr[1];
      minHeap.offer(curr);
    }

    return minHeap.peek()[0];
  }

  public static int waitingTimeBinarySearch(int[] arr, int m) {
    if (arr == null || arr.length == 0) {
      return -1;
    }

    int bestWaiter = Integer.MAX_VALUE;
    for (int time: arr) {
      bestWaiter = Math.min(bestWaiter, time);
    }

    int start = 0;
    int end = bestWaiter * m;
    int nearest = 0;

    while (start <= end) {
      int mid = start + ((end - start) >> 1);
      int maxServed = 0;
      for (int time: arr) {
        maxServed += (mid / time) + 1;
      }
      if (maxServed < m + 1) {
        start = mid + 1;
      } else {
        nearest = mid;
        end = mid - 1;
      }
    }

    return nearest;
  }

}
