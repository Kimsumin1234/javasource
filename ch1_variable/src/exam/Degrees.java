package exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    // 화씨온도 => 섭씨온도
    Scanner sc = new Scanner(System.in);

    System.out.print("화씨 온도 입력 ");
    int fahr = sc.nextInt();

    double cels = (fahr - 32) * 5 / (double) 9;

    System.out.println("변환된 섭씨 온도 : " + cels);
  }
}
