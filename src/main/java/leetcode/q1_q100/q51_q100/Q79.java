package leetcode.q1_q100.q51_q100;

public class Q79 {

  public boolean exist(char[][] board, String word) {
    int row = board.length;
    int col = board[0].length;

    if (row * col < word.length()) {
      return false;
    }

    boolean[][] visited = new boolean[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (backTracking(i, j, board, word, visited, 0)) {
          return true;
        }
      }
    }

    return false;
  }

  private boolean backTracking(int row, int col, char[][] board, String word, boolean[][] visited, int index) {
    if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
      return false;
    }
    if (visited[row][col] || board[row][col] != word.charAt(index)) {
      return false;
    }
    if (index == word.length() - 1) {
      return true;
    }
    visited[row][col] = true;
    boolean exist = backTracking(row + 1, col, board, word, visited, index + 1)
                        || backTracking(row - 1, col, board, word, visited, index + 1)
                        || backTracking(row, col + 1, board, word, visited, index + 1)
                        || backTracking(row, col - 1, board, word, visited, index + 1);
    visited[row][col] = false;
    return exist;
  }

}
