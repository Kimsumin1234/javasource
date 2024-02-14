package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 자동 자원 반환 : try-with-resource

public class TryWithResource {

  public static void main(String[] args) {
    // 수동으로 자원을 열고 닫는 방법
    // FileInputStream fis = null;
    // try {
    //   fis = new FileInputStream("Test.txt"); // FileInputStream : 파일을 입력하는 구문 | fis.close(); : 통로 닫는 구문
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // } finally {
    //   if (fis != null) {
    //     try {
    //       fis.close();
    //     } catch (IOException e) {
    //       e.printStackTrace();
    //     }
    //   }
    // }

    // 자동으로 자원을 열고 닫는 방법
    // try() 안에는 close 할 객체들이 들어감
    // 자동으로 닫아줌 (finally를 명시하지 않아도 됨)
    try (FileInputStream fis = new FileInputStream("Test.txt")) {
      fis.read(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
