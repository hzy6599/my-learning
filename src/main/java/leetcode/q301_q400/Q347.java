package leetcode.q301_q400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q347 {

  public int[] topKFrequent(int[] nums, int k) {
    List<Integer>[] bucket = new List[nums.length + 1];
    Map<Integer, Integer> frequency = new HashMap<>();

    for (int number: nums) {
      frequency.put(number, frequency.getOrDefault(number, 0) + 1);
    }

    for (int number: frequency.keySet()) {
      int freq = frequency.get(number);
      if (bucket[freq] == null) {
        bucket[freq] = new ArrayList<>();
      }
      bucket[freq].add(number);
    }

    List<Integer> result = new ArrayList<>();

    for (int i = bucket.length - 1; i >= 0; i--) {
      if (result.size() < k && bucket[i] != null) {
        result.addAll(bucket[i]);
      }
    }

    int[] res = new int[result.size()];

    for (int i = 0; i < result.size(); i++) {
      res[i] = result.get(i);
    }

    return res;
  }

}
