package leetcode.q0_q99;

public class Q74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    int row = matrix.length;
    int col = matrix[0].length;
    int size = row * col;
    if (size == 1) {
      return matrix[0][0] == target;
    }

    int start = 0;
    int end = size - 1;

    while (start <= end) {
      int median = start + ((end - start) >> 1);
      int number = matrix[median/col][median % col];
      if (number == target) {
        return true;
      } else if (number > target) {
        end = median - 1;
      } else {
        start = median + 1;
      }
    }

    return false;
  }
}
