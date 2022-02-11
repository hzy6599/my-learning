package leetcode.q1_q100.q1_q50;

import java.util.HashSet;
import java.util.Set;

public class Q36 {

  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      Set<Character> row = new HashSet<>();
      Set<Character> col = new HashSet<>();
      Set<Character> box = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        char rowChar = board[i][j];
        char colChar = board[j][i];
        char boxChar = board[3*(i/3) + j/3][3*(i%3) + j%3];
        if (rowChar != '.' && !row.add(rowChar)) {
          return false;
        }
        if (colChar != '.' && !col.add(colChar)) {
          return false;
        }
        if (boxChar != '.' && !box.add(boxChar)) {
          return false;
        }
      }
    }

    return true;
  }

}
