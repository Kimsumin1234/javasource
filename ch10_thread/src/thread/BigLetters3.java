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
 *    ㄷ. t.start(); thread 를 실행
 *
 *   2) Thread 상속받는 클래스 작성해서 구현
 *    ㄱ. public class SmallLetters2 extends Thread 상속
 *    ㄴ. run() 오버라이딩
 *    ㄷ. Thread t = new SmallLetters2();
 *    ㄹ. t.start();
 *
 *   3) Runnable 익명 구현방식 : 1회성 쓰레드
 *
 *
 *  - 멀티쓰레드의 단점
 *   1) 여러 개의 쓰레드가 번갈아가면서 작업을 처리하기 떄문에 쓰레드간 작업 전환 시간이 소요
 *   2) 한 쓰레드가 수행하는 동안 다른 쓰레드는 대기하는 대기시간이 필요함
 *
 *  - 그래서 모든 프로세스를 멀티쓰레드로 구현할 필요가 없다
 *
 *  - 쓰레드 실행 제어
 *   1) sleep(밀리세턴드) : 지정한 시간동안 쓰레드 일시 정지(자동적으로 실행 대기 상태)
 *   2) suspend() : 일시정지, resume() 을 호출해야 실행대기 상태가 됨
 *   3) stop(), interrupt()...
 *
 *  - 동기화 : 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하도록 막는 것
 *   1) synchronized : 메소드를 동기화
 *                     동기화 블록을 사용
 */

public class BigLetters3 {

  public static void main(String[] args) {
    /**
     * 익명 구현방식 : 1회성
     */
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 1; i < 101; i++) {
          System.out.print(i + " ");
        }
      }
    };

    Thread t = new Thread(r);
    t.start();

    Thread t2 = new SmallLetters2();
    t2.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
