package thread;

/*
 * Thread (쓰레드)
 *  - 프로세스 : 실행 중인 프로그램(OS 로부터 실행에 필요한 자원(메모리) 할당받아 실행)
 *              프로그램을 수행하는데 필요한 데이터+자원+쓰레드
 *  - 쓰레드  : 실제로 작업을 수행
 *
 *  - 모든 프로세스는 최소한 하나 이상의 쓰레드가 존재한다
 *
 *  - 멀티쓰레드 프로세스 : 둘 이상의 쓰레드를 가진 프로세스, 예시) 채팅을 보낼때 파일전송도 같이할수있는 개념
 *
 *  - 멀티쓰레드 구현
 *   1) Runnable 구현 하는 클래스 작성해서 구현
 *    ㄱ. run() 오버라이딩
 *    ㄴ. Thread t = new Thread(new SmallLetters()); 객체생성
 *    ㄷ. t.start(); 스캐줄러 호출
 *
 *   2) Thread 상속받는 클래스 작성해서 구현
 *    ㄱ. public class SmallLetters2 extends Thread 상속
 *    ㄴ. run() 오버라이딩
 *    ㄷ. Thread t = new SmallLetters2();
 *    ㄹ. t.start();
 */

public class BigLetters2 {

  public static void main(String[] args) {
    Thread t = new SmallLetters2();
    t.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
