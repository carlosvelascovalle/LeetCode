package Easy;

public class _1512_NumberOfGoodPairs {
  public static void main(String[] args) {
    int[] nums = {1,2,3,1,1,3};
    numIdenticalPairs(nums);
  }

  public static int numIdenticalPairs(int[] nums) {
    int goodPairs=0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] ==nums[j] & i<j){
          goodPairs++;
        }
      }
    }
    System.out.println(goodPairs);
    return goodPairs;
  }
}
