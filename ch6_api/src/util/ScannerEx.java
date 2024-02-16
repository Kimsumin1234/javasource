package util;

import java.util.Scanner;

// java 에서 많이 사용하는 패키지
// java.lang
// java.util

// java.util.Scanner : 화면, 파일, 문자열과 같은 입력소스 로부터 문자 데이터를 읽어오기
// System.in : 키보드
// System.out : 화면
public class ScannerEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] argArr = null;

    while (true) {
      String prompt = ">>";
      System.out.print(prompt);

      String input = sc.nextLine();

      input = input.trim();

      // 정규식(Regular Expression) : regExp,regex 어떤 언어든 이렇게 줄여서 표현한다
      // 공백+ : 공백이 최소 1~무제한 으로 들어올수있다
      // split(" +") : 모든 공백을 기준으로 잘라준다
      argArr = input.split(" +");

      // 좌우 공백 다시한번 제거
      String command = argArr[0].trim();

      if ("".equals(command)) continue;

      command = command.toLowerCase();

      if (command.equals("q")) {
        System.exit(0);
      } else {
        for (int i = 0; i < argArr.length; i++) {
          System.out.println(argArr[i]);
        }
      }
    }
  }
}
