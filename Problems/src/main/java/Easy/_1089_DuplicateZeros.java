package Easy;

import java.util.Arrays;

public class _1089_DuplicateZeros {
  public static void main(String[] args) {
    int[] arr = {8, 5, 0, 9, 0, 3, 4, 7};
    duplicateZeros(arr);
  }

  public static void duplicateZeros(int[] arr) {
    int count = 0;
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
      temp = i + count;
      if (temp < arr.length) {
        if (arr[temp] == 0) {
          for (int j = arr.length - 1; j > temp; j--) {
            arr[j] = arr[j - 1];
          }
          count++;
        }
      }
      System.out.print("nº" + i + " ");
      Arrays.stream(arr).forEach(System.out::print);
      System.out.println();
    }
  }
}
