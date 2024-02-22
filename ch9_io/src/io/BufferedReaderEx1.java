package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {

  public static void main(String[] args) {
    /**
     * BufferedReader 의 메소드 : readLine() - 줄 단위로 읽어오기
     * BufferedWriter 의 메소드 : newLine() - \r\n 개념을 가지고 있다
     *
     * 문자스트림 작업할때 이런 보조스트림을 사용하면 편하다
     */
    try (
      FileReader fr = new FileReader("c:\\temp\\test.txt");
      BufferedReader br = new BufferedReader(fr);
      FileWriter fw = new FileWriter("c:\\temp\\output4.txt");
      BufferedWriter bw = new BufferedWriter(fw)
    ) {
      String str = null;
      while ((str = br.readLine()) != null) {
        bw.write(str);
        bw.newLine();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
