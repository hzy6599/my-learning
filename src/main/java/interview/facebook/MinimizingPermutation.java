package interview.facebook;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinimizingPermutation {

  /**
   * We use BFS approach to solve this problem. We start from the first array, and for each array we do the following:
   * 1. Find all possible close permutation and compare with target, if match then we return current moves.
   * 2. If no match, we check if we have seen this permutation before, it not we add to BFS process and record it.
   * 3. For each BFS level we increase move by 1.
   * Time Complexity: O(n!)
   * Space Complexity: O(n);
   */
  public static int minOperations(int[] arr) {
    int numberOfMoves = 0;

    int[] target = arr.clone();
    Arrays.sort(target);

    Set<String> seenInBFS = new HashSet<>();
    seenInBFS.add(Arrays.toString(arr));

    Queue<int[]> queue = new LinkedList<>();
    queue.offer(arr);

    while(!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int[] currPermutation = queue.poll();
        if (Arrays.equals(target, currPermutation)) {
          return numberOfMoves;
        }
        for (int j = 0; j < currPermutation.length; j++) {
          for (int k = j + 1; k < currPermutation.length; k++) {
            int[] newPermutation = currPermutation.clone();
            switchIndex(newPermutation, j, k);
            if (!seenInBFS.contains(Arrays.toString(newPermutation))) {
              queue.offer(newPermutation);
              seenInBFS.add(Arrays.toString(newPermutation));
            }
          }
        }
      }
      numberOfMoves++;
    }

    return numberOfMoves;
  }

  private static void switchIndex(int[] arr, int index1, int index2) {
    for (; index1 < index2; index1++, index2--) {
      arr[index1] = arr[index1] ^ arr[index2];
      arr[index2] = arr[index1] ^ arr[index2];
      arr[index1] = arr[index1] ^ arr[index2];
    }
  }

}
