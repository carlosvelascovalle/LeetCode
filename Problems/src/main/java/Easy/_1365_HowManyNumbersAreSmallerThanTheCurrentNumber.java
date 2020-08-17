package Easy;

import java.util.Arrays;

public class _1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
  public static void main(String[] args) {
    int[] nums = new int[]{8, 1, 2, 2, 3};
    smallerNumbersThanCurrent(nums);
  }

  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] solution = new int[nums.length];
    int temp = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          temp++;
        }

      }
      solution[i] = temp;
      temp = 0;
    }
    Arrays.stream(solution).forEach(System.out::println);
    return solution;
  }
}
