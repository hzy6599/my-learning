package leetcode.q1_q100.q51_q100;

import java.util.ArrayList;
import java.util.List;

public class Q51 {

  public List<List<String>> solveNQueens(int n) {
    List<List<String>> results = new ArrayList<>();

    char[][] board = new char[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = '.';
      }
    }

    backTracking(board, results, 0);

    return results;
  }

  private void backTracking(char[][] board, List<List<String>> results, int colIndex) {
    if (colIndex == board.length) {
      results.add(buildResult(board));
      return;
    }

    for (int i = 0; i < board.length; i++) {
      if (validateBox(board, i, colIndex)) {
        board[i][colIndex] = 'Q';
        backTracking(board, results, colIndex + 1);
        board[i][colIndex] = '.';
      }
    }
  }

  private List<String> buildResult(char[][] board) {
    List<String> result = new ArrayList<>();
    for (char[] row : board) {
      result.add(new String(row));
    }
    return result;
  }

  private boolean validateBox(char[][] board, int row, int col) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < col; j++) {
        if (board[i][j] == 'Q' && (i == row || row + j == col + i || row + col == i + j)) {
          return false;
        }
      }
    }
    return true;
  }

}
