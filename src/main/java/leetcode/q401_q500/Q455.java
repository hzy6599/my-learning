package leetcode.q401_q500;

import java.util.Arrays;

public class Q455 {

  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int result = 0;
    int cookie = 0;
    int child = 0;

    while (cookie < s.length && child < g.length) {
      if (s[cookie] >= g[child]) {
        result++;
        child++;
      }
      cookie++;
    }

    return result;
  }
}
