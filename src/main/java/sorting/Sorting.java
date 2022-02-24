package sorting;

public class Sorting {

  /**
   * Quick sort algorithm
   * 1. Average Time complexity O(nlogn)
   * 2. Best Time complexity O(nlogn)
   * 3. Worst Time complexity O(n^2)
   * 4. Space complexity O(nlogn)
   * @param array the array which need to be sorted
   */
  public static void quickSort(int[] array, int left, int right) {
    if (array == null || left + 1 >= right) {
      return;
    }

    int pivot = array[left];
    int start = left;
    int end = right;

    while (start < end) {
      while (start < end && array[end] >= pivot) {
        end--;
      }

      while (start < end && array[start] <= pivot) {
        start++;
      }

      if (start < end) {
        swap(array, start, end);
      }
    }
    swap(array, left, end);
    quickSort(array, left, end - 1);
    quickSort(array, end + 1, right);
  }

  private static void swap(int[] array, int a, int b) {
    if (a == b) {
      return;
    }
    array[a] = array[a] ^ array[b];
    array[b] = array[a] ^ array[b];
    array[a] = array[a] ^ array[b];
  }

  /**
   * Merge sort algorithm
   * 1. Average Time complexity O(nlogn)
   * 2. Best Time complexity O(nlogn)
   * 3. Worst Time complexity O(nlogn)
   * 4. Space complexity O(n)
   * @param array the array which need to be sorted
   */
  public static void mergeSort(int[] array, int start, int end) {
    if (start < end) {
      int mid = start + ((end - start) >> 1);
      mergeSort(array, start, mid);
      mergeSort(array, mid + 1, end);
      merge(array, start, mid, end);
    }
  }

  private static void merge(int[] array, int start, int mid, int end) {
    int[] helper = new int[end - start + 1];
    int p1 = start;
    int p2 = mid + 1;
    int p3 = 0;
    while (p1 <= mid || p2 <= end) {
      int left = p1 <= mid ? array[p1] : Integer.MAX_VALUE;
      int right  = p2 <= end ? array[p2] : Integer.MAX_VALUE;
      if (left <= right) {
        helper[p3] = left;
        p1++;
      } else {
        helper[p3] = right;
        p2++;
      }
      p3++;
    }

    for (int i = 0; i < helper.length; i++) {
      array[i + start] = helper[i];
    }
  }

  /**
   * Insertion sort algorithm
   * 1. Average Time complexity O(n^2)
   * 2. Best Time complexity O(n)
   * 3. Worst Time complexity O(n^2)
   * 4. Space complexity O(1)
   * @param array the array which need to be sorted
   */
  public static void insertionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j > 0; j--) {
        if (array[j] < array[j - 1]) {
          swap(array, j - 1, j);
        }
      }
    }
  }

  /**
   * Bubble sort algorithm.
   * 1. Average Time complexity O(n^2)
   * 2. Best Time complexity O(n)
   * 3. Worst Time complexity O(n^2)
   * 4. Space complexity O(1)
   * @param array the array which need to be sorted
   */
  public static void bubbleSort(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
        }
      }
    }
  }

  /**
   * Selection sort algorithm.
   * 1. Average Time complexity O(n^2)
   * 2. Best Time complexity O(n)
   * 3. Worst Time complexity O(n^2)
   * 4. Space complexity O(1)
   * @param array the array which need to be sorted
   */
  public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int min = array[i];
      int index = i;
      for (int j = i; j < array.length; j++) {
        if (array[j] < min) {
          min = array[j];
          index = j;
        }
      }
      swap(array, i, index);
    }
  }

}
