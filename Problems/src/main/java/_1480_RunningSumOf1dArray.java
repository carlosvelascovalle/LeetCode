import java.util.Arrays;

public class _1480_RunningSumOf1dArray {
  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3, 4};
    runningSum(nums);
  }

  public static int[] runningSum(int[] nums) {
    int initial = 0;
    int[] solution = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      initial += nums[i];
      solution[i] = initial;
    }
    Arrays.stream(solution).forEach(System.out::println);

    return solution;
  }
}
