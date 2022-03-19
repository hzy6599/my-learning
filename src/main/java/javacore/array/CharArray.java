package javacore.array;

public class CharArray {
  public static void main(String[] args) {
    int[] map = new int[256];
    for (int i = 0; i < 10; i++) {
      map[i + '0']++;
    }
    for (int i = 0; i < 52; i++) {
      map[i + 'A']++;
    }
    System.out.println((int) '_');
    System.out.println(map['_']);
  }
}
