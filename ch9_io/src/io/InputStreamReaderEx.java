package io;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 보조스트림 : 기존 스트림의 기능 보완
 *             데이터 입출력 기능은 없음
 *
 * 1) 바이트 기반
 *   - BufferedInputStream / BufferedOutputStream : 버퍼를 이용한 입출력 향상
 *   - DataInputStream / DataOutputStream : 기본형 단위로 데이터를 처리
 *   -                   PrintStream : 버퍼 사용하며, print, println, printf()
 *
 * 2) 문자 기반
 *   - BufferedReader / BufferedWriter : 버퍼를 이용한 입출력 향상
 *
 * 3) 브릿지 스트림
 *   - InputStreamReader : 바이트 스트림 => 문자 스트림 (기존에 코딩이 작성이 되었는데 문자스트림으로 바꿀경우 사용할법하다)
 *   - OutputStreamReader : 문자 스트림 => 바이트 스트림
 */
public class InputStreamReaderEx {

  public static void main(String[] args) {
    try (
      FileInputStream fis = new FileInputStream("c:\\temp\\test1.txt");
      InputStreamReader ir = new InputStreamReader(fis)
    ) {
      int data = 0;

      // byte 기반일 경우
      //   while ((data = fis.read()) != -1) {
      //     System.out.println((char) data);
      //   }

      char[] cbuf = new char[1024];
      while ((data = ir.read(cbuf)) != -1) {
        System.out.println(cbuf);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
