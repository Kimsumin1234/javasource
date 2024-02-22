package io;

import java.io.FileWriter;

public class FileWriterEx1 {

  public static void main(String[] args) {
    try (FileWriter fw = new FileWriter("c:\\temp\\output1.txt", true)) {
      /**
       * 엔터를 넣고 싶으면 \r\n 을 주면된다
       * \r\n : CRLF
       * \r : CR - 캐리지리턴
       * \n : LF - 라인피드
       * (append : true) : 안쓰면 수정, true를 쓰면 이어붙이기
       */
      fw.write("FileWriter 는 한글로 작성된\r\n");
      fw.write("문자열을 바로 출력 할 수 있다\r\n");
      fw.write("Writer 클래스는 문자 단위의\r\n");
      fw.write("출력만 가능합니다.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
