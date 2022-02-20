package leetcode.q601_q700;

public class Q605 {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n == 0) {
      return true;
    }

    for (int i = 0; i < flowerbed.length; i++) {
      int curr = flowerbed[i];
      if (curr == 0) {
        int prev = i == 0 ? 0 : flowerbed[i - 1];
        int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
        if (prev == 0 && next == 0) {
          flowerbed[i] = 1;
          n--;
        }
      }
      if (n == 0) {
        return true;
      }
    }

    return false;
  }

}
