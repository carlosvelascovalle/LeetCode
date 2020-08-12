package Easy;

public class _771_JewelsAndStones {
  public static void main(String[] args) {
    String J = "z";
    String S = "ZZAAbbbb";
    numJewelsInStones(J, S);
  }

  public static int numJewelsInStones(String J, String S) {
    int solution = 0;
    for (int s = 0; s < S.length(); s++) {
      for (int j = 0; j < J.length(); j++) {
        if (J.substring(j, j + 1).equals(S.substring(s, s + 1))) {
          solution++;
        }
      }
    }
    System.out.println(solution);
    return solution;
  }
}
