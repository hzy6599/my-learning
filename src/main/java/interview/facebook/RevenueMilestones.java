package interview.facebook;

public class RevenueMilestones {

  /**
   * We create two helper variables:
   * 1. sum: keep record of the total sum.
   * 2. milestoneIndex: keep track of the current milestone we look for.
   * Then we loop through the revenues and do following things:
   * 1. add current number to sum
   * 2. check if current sum >= milestone
   * 3. if so, update milestone and move index to the next one. Otherwise, continue.
   * Time Complexity: O(n).
   * Space Complexity: O(1).
   */
  public static int[] getMilestoneDays(int[] revenues, int[] milestones) {
    int sum = 0;
    int milestoneIndex = 0;
    int[] ans = new int[milestones.length];

    for (int i = 0; i < revenues.length; i++) {
      sum += revenues[i];
      if (sum >= milestones[milestoneIndex]) {
        ans[milestoneIndex] = i + 1;
        milestoneIndex++;
      }
      if (milestoneIndex > milestones.length) {
        break;
      }
    }

    while (milestoneIndex < milestones.length) {
      ans[milestoneIndex] = -1;
      milestoneIndex++;
    }

    return ans;
  }

}
