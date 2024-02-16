package util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {

  public static void main(String[] args) {
    // 키보드로 문자열을 읽어서 분리하는 프로그램 작성
    // 입력) 아빠/엄마/수연/수희/수정

    Scanner sc = new Scanner(System.in);
    System.out.print("이름을 입력하시오. 구분자는 / 입니다. >>>> ");
    String name = sc.nextLine();
    StringTokenizer st = new StringTokenizer(name, "/");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
