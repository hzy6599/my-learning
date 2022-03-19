package leetcode.q301_q400;

public class Q346 {

  private int capacity;
  private int count;
  private int index;
  private int[] queue;
  private int sum;

  public Q346(int size) {
    capacity = size;
    count = 0;
    index = 0;
    queue = new int[size];
    sum = 0;
  }

  public double next(int val) {
    count++;
    index %= capacity;
    sum -= queue[index];
    sum += val;

    queue[index] = val;
    index++;

    return sum * 1.0 / Math.min(capacity, count);
  }

}
