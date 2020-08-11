package Easy;

import java.util.*;

public class _1431_KidsWithTheGreatestNumberOfCandies {
  public static void main(String[] args) {
    int[] candies = {2,8,7};
    int extraCandies = 1;
    kidsWithCandies(candies,extraCandies);
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> candiesList= new ArrayList<Boolean>();
    int greatest= Arrays.stream(candies).max().getAsInt();
    for (int i = 0; i < candies.length; i++) {
      if (candies[i]+extraCandies>=greatest){
        candiesList.add(true);
      }else{
        candiesList.add(false);
      }
    }
    candiesList.forEach(System.out::println);
    return candiesList;
  }
}
