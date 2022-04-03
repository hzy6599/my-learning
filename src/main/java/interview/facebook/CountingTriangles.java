package interview.facebook;

import interview.facebook.definition.Sides;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingTriangles {

  /**
   * To identify unique triangle we use set to remove duplicates.
   * For each Side object we construct an array list to store the three points.
   * Then we sort it and add to the set. Set will remove duplicates for us.
   * Time Complexity: (3*log3 * m), m is the size of arr.
   * Space Complexity: O(n)
   */
  int countDistinctTriangles(ArrayList<Sides> arr) {
    Set<List<Integer>> answer = new HashSet<>();

    for (Sides side: arr) {
      List<Integer> currTriangle = Arrays.asList(side.a, side.b, side.c);
      Collections.sort(currTriangle);
      answer.add(currTriangle);
    }

    return answer.size();
  }

}
