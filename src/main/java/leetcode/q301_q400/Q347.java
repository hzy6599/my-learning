package leetcode.q301_q400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q347 {

  /**
   * This solution uses max heap to store the top k elements.
   * First traverse the array to get frequencies into map. Then for each number in the map we add it to max heap.
   * When size is larger than k we remove an element from heap. At the end we return the k element from heap.
   * Time Complexity: O(nlogn)
   * Space Complexity: O(n)
   */
  public static int[] topKFrequentWithHeap(int[] nums, int k) {
    Map<Integer, Integer> frequency = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
    }

    Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> frequency.get(n1) - frequency.get(n2));

    for (int num : frequency.keySet()) {
      heap.add(num);
    }

    int[] topK = new int[k];

    while (heap.size() > k) {
      heap.poll();
    }

    for (int i = k - 1; i >= 0; i--) {
      topK[i] = heap.poll();
    }

    return topK;
  }

  /**
   * Similar idea but use bucket solution. We find the frequency for every number, then store them in bucket format.
   * The intuition behind is that for an array of size n, the maximum frequency of a number would be <= n.
   * We can build an array bucket with size n + 1 and each bucket will hold the numbers with that frequency.
   * When return top K, we loop through the end and add number one by one.
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static int[] topKFrequentBucket(int[] nums, int k) {
    Map<Integer, Integer> frequency = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
    }

    List<Integer>[] buckets = new List[nums.length + 1];

    for (int num: frequency.keySet()) {
      int value = frequency.get(num);
      if (buckets[value] == null) {
        buckets[value] = new ArrayList<>();
      }
      buckets[value].add(num);
    }

    int[] topK = new int[k];
    int topKIndex = 0;

    for (int i = buckets.length - 1; i >= 0 && topKIndex < k; i--) {
      if (buckets[i] != null) {
        for (int j = 0; j < buckets[i].size() && topKIndex < k; j++) {
          topK[topKIndex++] = buckets[i].get(j);
        }
      }
    }

    return topK;
  }

}
