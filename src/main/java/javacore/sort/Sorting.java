package javacore.sort;

import java.util.Arrays;

public class Sorting {

  public static void main(String[] args) {
    int[][] arrays = new int[][] {{0,2},{2,4},{2,3},{0,4}};
    Arrays.sort(arrays, (a, b) -> {
      if (a[0] == b[0]) {
        return a[1] - b[1];
      }
      return a[0] - b[0];
    });
    for (int[] arr: arrays) {
      System.out.println(arr[0] + ": " + arr[1]);
    }
  }

}
