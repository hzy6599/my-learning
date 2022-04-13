package leetcode.q1401_q1500;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * We Use queue to store the array of numbers we have and use map to keep track of the occurrence.
 */
public class Q1429 {

  private Queue<Integer> queue;
  private Map<Integer, Integer> map;

  public Q1429(int[] nums) {
    queue = new LinkedList<>();
    map = new HashMap<>();
    for (int num : nums) {
      this.add(num);
    }
  }

  public int showFirstUnique() {
    return queue.isEmpty() ? -1 : queue.peek();
  }

  public void add(int value) {
    queue.offer(value);
    map.put(value, map.getOrDefault(value, 0) + 1);
    while (!queue.isEmpty() && map.get(queue.peek()) > 1) {
      int curr = queue.poll();
    }
  }

}
