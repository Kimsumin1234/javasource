package thread;

public class ThreadSleepEx {

  public static void main(String[] args) {
    ThreadSleep1 t1 = new ThreadSleep1();
    Thread t2 = new ThreadSleep2();

    t1.start();
    t2.start();

    try {
      // Thread.sleep() : 일시정지, 밀리세턴드단위(2000 = 2초)
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("main 종료");
  }
}
