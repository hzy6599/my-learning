package sorting;

public class InsertionSort {

  public static void insertionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j > 0; j--) {
        if (array[j] < array[i]) {
          swap(array, i, j);
        }
      }
    }
  }

  private static void swap(int[] array, int i, int j) {
    if (i == j) {
      return;
    }
    array[i] = array[i] ^ array[j];
    array[j] = array[i] ^ array[j];
    array[i] = array[i] ^ array[j];
  }

}
