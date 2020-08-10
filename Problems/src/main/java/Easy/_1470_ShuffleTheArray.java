package Easy;

import java.util.Arrays;

public class _1470_ShuffleTheArray {
  public static int[] shuffle(int[] nums, int n) {
    int[] solution = new int[nums.length];
    for (int i = 0; i < n; i++) {
      solution[i * 2] = nums[i];
      solution[(i * 2) + 1] = nums[i + n];
    }
    Arrays.stream(solution).forEach(System.out::print);
    return solution;
  }

  public static void main(String[] args) {
    int[] nums = {2, 5, 1, 3, 4, 7};
    int n = 3;
    shuffle(nums, n);
  }

}
