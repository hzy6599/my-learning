package interview.algorithm;

public class NumberOfSumDivisibleByM {

  public static int numberOfSumDivisibleByM(int[] arr, int target) {
    int answer = 0;
    int[] helper = new int[target];

    for (int i = 0; i < arr.length; i++) {
      int mod = (arr[i] % target + target) % target;
      answer += helper[(target - mod) % target];
      helper[mod]++;
    }

    return answer;
  }

}
