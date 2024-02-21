package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * FileInputStream : 문자,사진,동영상 파일들 모두 연결 할수 있다
 */
public class FileInputStreamEx1 {

  public static void main(String[] args) {
    // InputStream in = null;
    // OutputStream out = null;

    // 빨간줄은 try catch 사용 : in = new FileInputStream(new File("c:\\temp\\file1.txt"));
    // try catch 사용 : finally {in.close();}
    // catch 사용 : in.read()

    // try {
    //   // 파일 연결 하기
    //   in = new FileInputStream(new File("c:\\temp\\file1.txt"));
    //   //   out = System.out; 연결해서 자바프로그램 화면에 출력하기
    //   out = new FileOutputStream("c:\\temp\\file1_copy.txt"); // 자바로 파일을 직접 복사 붙혀넣기 할수있다

    //   // 파일 읽어오기
    //   int data = 0;
    //   byte[] b = new byte[1024];

    //   while ((data = in.read(b)) != -1) {
    //     out.write(b);
    //   }
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // } catch (IOException e) {
    //   e.printStackTrace();
    // } finally {
    //   try {
    //     in.close();
    //     out.close();
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    // }

    // try-with-resources : try() 괄호안에 닫아야할 자원들을 선언하면 자동으로 닫아줌, finally close() 생략 가능
    try (
      InputStream in = new FileInputStream(new File("c:\\temp\\file1.txt"));
      OutputStream out = new FileOutputStream("c:\\temp\\file1_copy.txt");
    ) {
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
    }
  }
}
