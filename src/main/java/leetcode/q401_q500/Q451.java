package leetcode.q401_q500;

import java.util.ArrayList;
import java.util.List;

public class Q451 {

  public String frequencySort(String s) {
    List<Character>[] buckets = new List[s.length() + 1];
    int[] map = new int[128];

    for (char c: s.toCharArray()) {
      map[c]++;
    }

    for (char c: s.toCharArray()) {
      int index = map[c];
      if (buckets[index] == null) {
        buckets[index] = new ArrayList<>();
      }
      if (!buckets[index].contains(c)) {
        buckets[index].add(c);
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int i = buckets.length - 1; i >= 0; i--) {
      if (buckets[i] != null) {
        for (int j = 0; j < buckets[i].size(); j++) {
          char current = buckets[i].get(j);
          int frequency = i;
          while (frequency > 0) {
            sb.append(current);
            frequency--;
          }
        }
      }
    }

    return sb.toString();
  }

}
