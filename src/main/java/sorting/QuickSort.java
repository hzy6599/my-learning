package sorting;

public class QuickSort {

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
      array[start] = array[end];

      while (start < end && array[start] <= pivot) {
        start++;
      }
      array[end] = array[start];
    }
    array[start] = pivot;
    quickSort(array, left, end - 1);
    quickSort(array, end + 1, right);
  }

  public static void quickSortTwo(int[] array, int left, int right) {
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

}
