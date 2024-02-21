package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * java.io.* : io (input / output)
 * 기본 input : keyboard
 * 기본 output : 화면
 * 키보드랑 화면 은 io 작업 보다는 Scanner 쓰는게 편하다
 *
 * 스트림 : 입출력을 수행 할 때 어느 한 쪽에서 다른 쪽으로 데이터 전달시 두 대상을 연결하는 통로 같은 개념
 *         (키보드 입력시 자바프로그램으로 연결하는 입력스트림이 있다, 자바프로그램에서 화면으로 연결하는 출력스트림이 있다)
 *         단방향만 가능 (입력, 출력 => 2개의 스트림 필요)
 *
 * 1. 바이트 기반 스트림 (문자, 이미지, 동영상... 모든종류의 파일들)
 *     InputStream(추상 클래스) : 입력 스트림 부모
 *     OutputStream(추상 클래스) : 출력 스트림 부모
 *
 * 2. 문자 기반 스트림 (문자만 가능)
 *     Reader(추상 클래스)
 *     Writer(추상 클래스)
 */
public class InputStreamEx1 {

  public static void main(String[] args) {
    InputStream in = System.in;
    // in.read() : 1 바이트씩 읽어와서 int 로 리턴 (한글은 3바이트 이기 때문에 깨져서 나온다)
    // in.read(byte[] b) :  byte 배열로 읽어와서 읽어온 byte 를 int 로 리턴
    // in.read(byte[] b, 0, 100) : 입력 스트림에서 100 byte를 읽어와서 0 번 위치부터 저장

    OutputStream out = System.out;
    // out.write(byte[] b);
    // out.write(int);
    // out.write(byte[] b, 0, 100);

    try {
      // 한바이트만 입력 시
      //   int input = in.read();
      //   out.write(input);

      // 여러 바이트 입력 시
      //   int input = 0;
      //   while ((input = in.read()) != -1) {
      //     //   System.out.println((char) input);
      //     out.write(input);
      //   }

      // 엔터 : {13,10}
      byte b[] = new byte[100];
      in.read(b);
      // System.out.println(Arrays.toString(b));
      out.write(b);
      in.close();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
