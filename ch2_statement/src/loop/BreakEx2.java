package loop;

public class BreakEx2 {

  public static void main(String[] args) {
    // break; => switch
    // while (true) -> 이대로 실행하면 무한루프에 걸리게됨, break; 를 걸어서 도중에 멈추게 해야함

    int i = 0;
    while (true) {
      // 주사위 굴려서 6일떄만 반복문 종료
      i = (int) (Math.random() * 6) + 1;
      System.out.println(i);
      if (i == 6) break;
    }
    System.out.println("종료");
  }
}
