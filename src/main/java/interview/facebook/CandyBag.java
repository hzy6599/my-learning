package interview.facebook;

import java.util.PriorityQueue;

public class CandyBag {

  /**
   * Use priority list to store all the candies. Then do the following for k times:
   * 1. Poll from max heap
   * 2. Add the result to answer.
   * 3. Add half of the current candy back into heap.
   * Time Complexity: O(n + k*logn)
   * Space Complexity: O(n)
   */
  public static int maxCandies(int[] arr, int k) {
    PriorityQueue<Integer> maxCandy = new PriorityQueue<>((n1, n2) -> (n2 - n1));
    for (int candies: arr) {
      maxCandy.offer(candies);
    }

    int ans = 0;

    for (int i = 0; i < k; i++) {
      int candies = maxCandy.poll();
      ans += candies;
      maxCandy.offer(candies / 2);
    }

    return ans;
  }

}
