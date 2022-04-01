package leetcode.q201_q300;

public class Q213 {

  /**
   * This problem is similar to the original robber problem except the houses are in circle.
   * It can, however, be break down into two simple robber problem.
   * For a circle of n houses, we can rob either from index 0 to n - 2, or index 1 to n - 1.
   * We run the simple robber problem twice and return the larger of the two.
   * Time Complexity: O(2*n) -> O(n)
   * Space Complexity: O(1)
   */
  public static int rob(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    return Math.max(findMostMoney(nums, 0, nums.length - 2), findMostMoney(nums, 1, nums.length - 1));
  }

  private static int findMostMoney(int[] nums, int start, int end) {
    int twoHousesAgo = 0;
    int oneHouseAgo = 0;
    int currentHouse = 0;

    for (int i = start; i <= end; i++) {
      currentHouse = Math.max(oneHouseAgo, twoHousesAgo + nums[i]);
      twoHousesAgo = oneHouseAgo;
      oneHouseAgo = currentHouse;
    }

    return currentHouse;
  }

}
