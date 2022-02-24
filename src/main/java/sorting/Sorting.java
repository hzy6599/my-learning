package sorting;

public class Sorting {

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

  public static void insertionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j > 0; j--) {
        if (array[j] < array[j - 1]) {
          swap(array, j - 1, j);
        }
      }
    }
  }

}
