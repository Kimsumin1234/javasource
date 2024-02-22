package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 속도 향상
 * read() => read(배열) => read(배열) + 보조스트림
 * 배열 : 바이트 기반일경우 - byte[] b , 문자 기반일 경우 - char[] cbuf
 */

public class BufferedStreamEx1 {

  public static void main(String[] args) {
    try (
      FileInputStream fis = new FileInputStream("c:\\temp\\test1.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);
      FileOutputStream fos = new FileOutputStream("c:\\temp\\output3.txt");
      BufferedOutputStream bos = new BufferedOutputStream(fos)
    ) {
      int data = 0;
      while ((data = bis.read()) != -1) {
        bos.write(data);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
