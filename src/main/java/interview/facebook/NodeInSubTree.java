package interview.facebook;

import interview.facebook.definition.Node;
import interview.facebook.definition.Query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NodeInSubTree {

  private static Map<Integer, Map<Character, Integer>> countMap;

  /**
   * Use map, for any given node and index store all the characters from its sub-node.
   * We use depth first search to build countMap for child nodes, then add each child into parent countMap.
   * Time Complexity: O(m * n), m is the size of the tree, n is the length of the String.
   * Space Complexity: O(m + m * n), m is the size of the tree, n is the length of the String.
   */
  public static int[] countOfNodes(Node root, ArrayList<Query> queries, String s) {
    // Write your code here
    countMap = new HashMap<>();

    buildCountMap(root, s);

    int[] answer = new int[queries.size()];

    for (int i = 0; i < queries.size(); i++) {
      int targetNode = queries.get(i).u;
      char targetChar = queries.get(i).c;
      answer[i] = countMap.getOrDefault(targetNode, new HashMap<Character, Integer>()).getOrDefault(targetChar, 0);
    }

    return answer;
  }

  private static void buildCountMap(Node root, String s) {
    if (root == null) {
      return;
    }

    Map<Character, Integer> frequencyMap = new HashMap<>();
    frequencyMap.put(s.charAt(root.val - 1), 1);

    for (Node node: root.children) {
      buildCountMap(node, s);
      Map<Character, Integer> childMap = countMap.get(node.val);
      for (Character c: childMap.keySet()) {
        frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + childMap.get(c));
      }
    }

    countMap.put(root.val, frequencyMap);
  }

}
