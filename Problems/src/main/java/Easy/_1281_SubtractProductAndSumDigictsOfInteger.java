package Easy;

public class _1281_SubtractProductAndSumDigictsOfInteger {
  public static void main(String[] args) {
    int n = 4421;
    subtractProductAndSum(n);
  }

  public static int subtractProductAndSum(int n) {
    int result = 0;
    int product = 1;
    int sum = 0;
    String numberString = String.valueOf(n);
    for (int i = 0; i < numberString.length(); i++) {
      product = product * Integer.parseInt(numberString.substring(i, i + 1));
      sum = sum + Integer.parseInt(numberString.substring(i, i + 1));
    }
    result = product - sum;
    System.out.println(result);
    return result;
  }
}
