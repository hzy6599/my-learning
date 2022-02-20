package leetcode.q701_q800;

import java.util.ArrayList;
import java.util.List;

public class Q797 {

  public List<List<Integer>> allPathsSourceTargetDFS(int[][] graph) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < graph[0].length; i++) {
      List<Integer> path = new ArrayList<>();
      path.add(0);
      findPath(graph, graph[0][i], path, result);
    }
    return result;
  }

  private void findPath(int[][] graph, int currNode, List<Integer> path, List<List<Integer>> result) {
    if (currNode == graph.length - 1) {
      path.add(currNode);
      result.add(path);
      return;
    }
    path.add(currNode);
    for (int i = 0; i < graph[currNode].length; i++) {
      List<Integer> newPath = new ArrayList<>(path);
      findPath(graph, graph[currNode][i], newPath, result);
    }
  }

}
