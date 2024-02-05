package array;

// 알고리즘 - 정렬
//           선택정렬, 버블정렬, 힙정렬...

import java.util.Arrays;

public class ArrayEx10 {

  public static void main(String[] args) {
    // 오름차순 해보기
    int arr[] = { 25, 85, 55, 65, 5, 3 };

    int temp = 0, min = arr[0];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length; j++) {
        if (min > arr[j]) {
          min = arr[j];
        }
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
  } // arr[0]->arr[1,2,3,4],   arr[1]->arr[2,3,4]
}
