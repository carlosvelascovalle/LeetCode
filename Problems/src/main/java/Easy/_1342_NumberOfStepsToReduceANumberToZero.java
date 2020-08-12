package Easy;

public class _1342_NumberOfStepsToReduceANumberToZero {
  public static void main(String[] args) {
    int num = 8;
    numberOfSteps(num);
  }

  public static int numberOfSteps(int num) {
    int solution = 0;
    while (num > 0) {
      if (num % 2 == 0) {
        num = num / 2;
      } else {
        num--;
      }
      solution++;
    }
    System.out.println(solution);
    return solution;
  }
}
