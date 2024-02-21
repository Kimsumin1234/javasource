package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx2 {

  public static void main(String[] args) {
    InputStream in = null;
    OutputStream out = null;

    try {
      // 파일 연결 하기
      in = new FileInputStream(new File("c:\\temp\\kbs_1.mp4"));
      //   out = System.out;

      // 사진,동영상 파일도 자바프로그램으로 복사 붙혀넣기를 할수있다
      out = new FileOutputStream("c:\\temp\\kbs_1_copy.mp4");

      // 파일 읽어오기
      int data = 0;
      byte[] b = new byte[1024];

      while ((data = in.read(b)) != -1) {
        out.write(b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        in.close();
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
