package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOEx {

  public static void main(String[] args) {
    /**
     * 사용자에게 입력받기 , 문자열 q 로 입력 종료
     * 사용자에게 입력받은 문자 파일에 쓰기
     */

    try (
      Scanner sc = new Scanner(System.in);
      FileWriter fw = new FileWriter("c:\\temp\\ioex.txt");
      BufferedWriter bw = new BufferedWriter(fw)
    ) {
      System.out.println("파일에 작성할 문자를 입력해주세요 ");
      System.out.println("작성을 중단하려면 q 를 입력해주세요");
      String str = null;
      do {
        System.out.print(">>> ");
        str = sc.nextLine();
        if (!str.equalsIgnoreCase("q")) {
          bw.write(str);

          bw.newLine();
        }
      } while (!str.equals("q"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
