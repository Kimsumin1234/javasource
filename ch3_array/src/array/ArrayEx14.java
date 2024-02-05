package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx14 {

  public static void main(String[] args) {
    // 1차원 배열 - 사용자 입력 값으로 배열 초기화
    // int[] arr1 = new int[5];

    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < arr1.length; i++) {
    //   System.out.println("숫자 입력 ");
    //   //   int num = sc.nextInt();
    //   //   arr1[i] = num;
    //   arr1[i] = sc.nextInt();
    // }

    // System.out.println("배열 요소 값" + Arrays.toString(arr1));

    // 2차원 배열 2행3열
    int[][] arr2 = new int[2][3];

    Scanner sc2 = new Scanner(System.in);
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.println("숫자 입력");
        arr2[i][j] = sc2.nextInt();
      }
      System.out.println();
    }

    for (int[] is : arr2) {
      for (int num : is) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }
  }
}
