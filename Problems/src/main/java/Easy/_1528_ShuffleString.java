package Easy;

import java.util.HashMap;

public class _1528_ShuffleString {
  public static void main(String[] args) {
    String s = "aiohn";
    int[] indices = {3,1,4,2,0};
    restoreString(s, indices);
  }

  public static String restoreString(String s, int[] indices) {
    String solution = "";
    HashMap<Integer, String> stringHash = new HashMap();
    for (int i = 0; i < s.length(); i++) {
      stringHash.put(indices[i], s.substring(i, i+1));
    }
    stringHash.forEach((integer, s1) -> System.out.println(integer+"->"+s1));
      for (int i = 0; i < stringHash.size(); i++) {
        solution=solution + stringHash.get(i);
    }
    System.out.println(solution);
    return "a";
  }
}