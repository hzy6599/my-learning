package leetcode.q701_q800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q721 {

  private static Set<String> visitedEmail;
  private static Map<String, Set<String>> graph;

  /**
   * The solution uses graph theory and DFS. We first create a connected graph from the accounts provided.
   * Then we apply DFS to go through the graph and create final result.
   * Time Complexity: O(M*N + M*N*log(M*N)).
   * Space Complexity: O(M*N).
   */
  public static List<List<String>> accountsMerge(List<List<String>> accounts) {
    visitedEmail = new HashSet<>();
    graph = new HashMap<>();

    for (List<String> account: accounts) {
      String firstEmail = account.get(1);
      for (int i = 2; i < account.size(); i++) {
        String email = account.get(i);
        if (!graph.containsKey(firstEmail)) {
          graph.put(firstEmail, new HashSet<>());
        }
        graph.get(firstEmail).add(email);

        if (!graph.containsKey(email)) {
          graph.put(email, new HashSet<>());
        }
        graph.get(email).add(firstEmail);
      }
    }

    List<List<String>> answers = new ArrayList<>();
    for (List<String> account: accounts) {
      String name = account.get(0);
      String firstEmail = account.get(1);

      if (!visitedEmail.contains(firstEmail)) {
        List<String> answer = new ArrayList<>();
        dfs(answer, firstEmail);
        Collections.sort(answer);
        answer.add(0, name);
        answers.add(answer);
      }
    }

    return answers;
  }

  public static void dfs(List<String> answer, String email) {
    visitedEmail.add(email);
    answer.add(email);
    if (!graph.containsKey(email)) {
      return;
    }
    for (String otherEmail: graph.get(email)) {
      if (!visitedEmail.contains(otherEmail)) {
        dfs(answer, otherEmail);
      }
    }
  }

}
