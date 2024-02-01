package exam;

import java.util.Scanner;

public class MaxValue {

  public static void main(String[] args) {
    // 숫자 세 개를 입력 받은 후 가장 큰 숫자를 출력
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 숫자. >>> "); // 37
    int num1 = sc.nextInt();

    System.out.print("두번째 숫자. >>> "); // 25
    int num2 = sc.nextInt();

    System.out.print("세번째 숫자. >>> "); // 48
    int num3 = sc.nextInt();

    int max = num1;

    if (max < num2) {
      max = num2;
    }
    if (max < num3) {
      max = num3;
    }
    System.out.println("세 수 중 가장 큰 수 " + max);

    // 세 수 중 가장 작은 수
    int min = num1;

    if (min > num2) {
      min = num2;
    }
    if (min > num3) { // else 대신 if 사용해도됨
      min = num3;
    }
    System.out.println("세 수 중 가장 작은 수 " + min);
  }
}
