package interview.facebook;

public class BillionUser {

  /**
   * We first find the maximum growth rate and calculate the maximum number of days we might need.
   * Then start a binary search from 0 to maxDay, each time we calculate the current user count and compare with 1 milion.
   * Time Complexity: O(n + logn) -> O(0).
   * Space Complexity: O(1).
   */
  public static int getBillionUsersDay(float[] growthRates) {
    int start = 0;
    int end = (int) Math.ceil(findUpperBound(growthRates));
    float target = 1000000000F;

    while (start < end) {
      int mid = start + ((end - start) >> 1);
      float totalUser = 0;
      for (float growthRate: growthRates)  {
        totalUser += userOnThatDay(mid, growthRate);
      }
      if (totalUser == target) {
        return mid;
      } else if (totalUser > target) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }

    return start;
  }

  private static float findUpperBound(float[] growthRates) {
    float max = 0;
    for (float growthRate: growthRates) {
      max = Math.max(max, growthRate);
    }
    return (float) (Math.log(1000000000) / Math.log(max));
  }

  private static float userOnThatDay(int day, float growthRate) {
    return (float) Math.pow(growthRate, day);
  }

}
