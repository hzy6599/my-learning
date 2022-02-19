package leetcode.q501_q600;

public class Q547 {

  public int findCircleNum(int[][] isConnected) {
    int[] visited = new int[isConnected.length];
    int result = 0;

    for (int i = 0; i < isConnected.length; i++) {
      if (visited[i] == 0) {
        result++;
        removeProvinces(isConnected, visited, i);
      }
    }

    return result;
  }

  private void removeProvinces(int[][] isConnected, int[] visited, int curr) {
    if (visited[curr] == 0) {
      visited[curr] = 1;
      for (int i = 0; i < isConnected.length; i++) {
        if (i == curr) {
          continue;
        }
        if (isConnected[curr][i] == 1 && visited[i] == 0) {
          removeProvinces(isConnected, visited, i);
        }
      }
    }
  }

}
