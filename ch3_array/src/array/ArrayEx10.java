package array;

// 알고리즘 - 정렬
//           선택정렬, 버블정렬, 힙정렬...

import java.util.Arrays;

public class ArrayEx10 {

  public static void main(String[] args) {
    // 오름차순 해보기
    int arr[] = { 25, 85, 55, 65, 5, 3 };

    int i = 0, j = 0;

    for (i = 0; i < arr.length; i++) {
      int min_idx = i;
      //최솟값을 가지고있는 인덱스 찾기
      for (j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    // 자바가 제공하는 sort
    // Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));
  }
}
