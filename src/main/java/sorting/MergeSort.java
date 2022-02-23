package sorting;

public class MergeSort {

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


}
