package leetcode.q101_q200;

public class Q130 {
  public void solve(char[][] board) {
    if (board.length < 2 || board[0].length < 2) {
      return;
    }

    int row = board.length;
    int col = board[0].length;

    for (int i = 0; i < row; i++) {
      if (board[i][0] == 'O') {
        mark(board, i, 0);
      }
      if (board[i][col - 1] == 'O') {
        mark(board, i, col - 1);
      }
    }

    for (int i = 0; i < col; i++) {
      if (board[0][i] == 'O') {
        mark(board, 0, i);
      }
      if (board[row - 1][i] == 'O') {
        mark(board, row - 1, i);
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (board[i][j] == 'O') {
          board[i][j] = 'X';
        } else if (board[i][j] == '#') {
          board[i][j] = 'O';
        }
      }
    }
  }

  private void mark(char[][] board, int row, int col) {
    if (row >= 0 && row < board.length && col >= 0 && col < board[0].length && board[row][col] == 'O') {
      board[row][col] = '#';
      mark(board, row + 1, col);
      mark(board, row - 1, col);
      mark(board, row, col + 1);
      mark(board, row, col - 1);
    }
  }
}
