package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class _1313_DecompressRunLengthEncodedList {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    decompressRLElist(nums);
  }

  public static void countPair(int[] nums, int pairs) {

  }

  public static int[] decompressRLElist(int[] nums) {
    ArrayList<Integer> numsArray = new ArrayList();
    for (int i = 0; i < nums.length; i += 2) {
      for (int j = 0; j < nums[i]; j++) {
        numsArray.add(nums[i+1]);
      }
    }
    int solve[] = new int[numsArray.size()];
    for (int i = 0; i < numsArray.size(); i++) {
      solve[i]=numsArray.get(i);
    }
    System.out.println(Arrays.toString(solve));

    return solve;
  }
}
